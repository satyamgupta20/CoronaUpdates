package com.satyam.corona;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class India extends AppCompatActivity {

    private MyPojo detail = new MyPojo();
    private RecyclerView recyclerView;
    private List<Statewise> list2;
    private MyAdapter2 adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);

        getSupportActionBar().setTitle("Corona Updates");
        getSupportActionBar().setSubtitle("Live updates of India from corona api");

        list2 = new ArrayList<>();
        init1();
        loadData1();

    }

    private void init1() {
        recyclerView = findViewById(R.id.state_list);

        adapter2 = new MyAdapter2(this,list2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter2);
    }

    //loading data from internet
    private void loadData1() {

        //make requestqueue object
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String url = "https://api.covid19india.org/data.json";

        //making new request
        JsonObjectRequest request;
        request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.e("Response",response.toString());

                Gson son= new Gson();
                detail = son.fromJson(response.toString(),MyPojo.class);
                //String str = detail.getStatewise().getRecovered();
                //Log.e("total recovered in state",str);

                list2.clear();
                for(Statewise s:detail.getStatewise())
                {
                    list2.add(s);
                }
                adapter2.notifyDataSetChanged();


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Error",error.toString());
            }
        });
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
            loadData1();
        }
        return super.onOptionsItemSelected(item);
    }


}
