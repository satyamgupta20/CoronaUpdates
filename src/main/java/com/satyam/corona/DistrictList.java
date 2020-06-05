package com.satyam.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DistrictList extends AppCompatActivity {

    PDFView pdf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_list);
        getSupportActionBar().setSubtitle("District Wise Pvt. Hospital List in U.P.");

        pdf2 = (PDFView) findViewById(R.id.pfdDistrictList);
        pdf2.fromAsset("DistrictList.pdf").load();
    }
}
