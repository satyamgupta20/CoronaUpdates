package com.satyam.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {


    private ProgressBar pb;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().setTitle("Corona Updates");
        getSupportActionBar().setSubtitle("Live updates from corona api");
        
        //funtion for progress bar
        fun();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }

    private void fun() {
        pb= (ProgressBar) findViewById(R.id.pb);

        final Timer t = new Timer();
        TimerTask tt= new TimerTask() {
            @Override
            public void run() {
                counter++;
                pb.setProgress(counter);

                if(counter == 100)
                {
                    t.cancel();
                }
            }
        };
         t.schedule(tt,0,20);

    }
}
