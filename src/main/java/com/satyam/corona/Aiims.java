package com.satyam.corona;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;


public class Aiims extends AppCompatActivity {

    PDFView pdf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiims);

        getSupportActionBar().setSubtitle("Aiims Guidelines for COVID-19");
        pdf1 = (PDFView) findViewById(R.id.pfdViewAiims);

        pdf1.fromAsset("Aiims.pdf").load();
    }
}
