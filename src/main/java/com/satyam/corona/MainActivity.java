package com.satyam.corona;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private CoronaDetail detail= new CoronaDetail();
    private TextView gConfirmed,gNewDeath,gTotalDeath,gRecovered;
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Countries> list;

    //buttons in the main activity
    Button btnIndia,btnAiims,btnDistrictList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Corona Updates");
        getSupportActionBar().setSubtitle("Live updates from corona api");

        btnIndia = (Button) findViewById(R.id.button_India);
        btnAiims = (Button) findViewById(R.id.button_Aiims_Guidelines);
        btnDistrictList = (Button) findViewById(R.id.button_Hospital_list);

        btnIndia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,India.class);
                startActivity(i);
            }
        });


        btnAiims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 =new Intent(MainActivity.this,Aiims.class);
                startActivity(intent1);
            }
        });

        btnDistrictList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(MainActivity.this,DistrictList.class);
                startActivity(intent2);

            }
        });

        list = new ArrayList<>();
        init();
        loadData();
    }

    private void init(){
        gConfirmed=findViewById(R.id.global_total_confirmed_cases);
        gNewDeath=findViewById(R.id.global_new_death_cases);
        gTotalDeath=findViewById(R.id.global_total_death_cases);
        gRecovered=findViewById(R.id.global_total_recovered_cases);
        recyclerView=findViewById(R.id.country_list);

        adapter = new MyAdapter(this,list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    //loading data from internet
    private void loadData() {

        //make requestqueue object
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String url="https://api.covid19api.com/summary";

        //making new request

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.e("Response",response.toString());
                Gson son = new Gson();

                detail = son.fromJson(response.toString(),CoronaDetail.class);
                String str = detail.getGlobal().getTotalConfirmed();
                Log.e("Total Cases",str);


                gConfirmed.setText("Total Confirmed Cases : "+detail.getGlobal().getTotalConfirmed());
                gNewDeath.setText("New Death Cases : "+detail.getGlobal().getNewDeaths());
                gTotalDeath.setText("Total Death Cases : "+detail.getGlobal().getTotalDeaths());
                gRecovered.setText("Total Recovered Cases : "+detail.getGlobal().getTotalRecovered());

                list.clear();
                for(Countries c:detail.getCountries())
                {
                    list.add(c);
                }
                adapter.notifyDataSetChanged();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Error",error.toString());

            }
        });

        //adding request to requestqueue
        requestQueue.add(request);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.optionmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //refresh
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()== R.id.refresh)
        {
            Toast.makeText(this, "Reloading Data", Toast.LENGTH_SHORT).show();
            loadData();
        }
        return super.onOptionsItemSelected(item);
    }
}
