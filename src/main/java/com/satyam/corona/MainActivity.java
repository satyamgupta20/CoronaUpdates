package com.satyam.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Corona Updates");
        getSupportActionBar().setSubtitle("Live updates from corona api");
        
        loadData();
        
        
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

    public void btnclick(View view) {
        Toast.makeText(this, "Btn clicked", Toast.LENGTH_SHORT).show();
        Log.e("Error","Btn clicked");
    }
}
