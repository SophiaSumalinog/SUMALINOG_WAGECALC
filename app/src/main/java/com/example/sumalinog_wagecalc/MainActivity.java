package com.example.wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sumalinog_wagecalc.R;


public class MainActivity extends AppCompatActivity {
    EditText txtRPH;
    EditText txtHours;
    Button btnWeekly;
    Button btnYearly;
    Button btnMonthly;
    TextView txtResults;
    private int YearlyEarnings = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRPH = findViewById(R.id.txtRPH);
        txtHours = findViewById(R.id.txtHours);
        btnWeekly = findViewById(R.id.btnWeekly);
        btnYearly = findViewById(R.id.btnYearly);
        btnMonthly = findViewById(R.id.btnMontly);
        txtResults = findViewById(R.id.txtResults);

        btnWeekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double myRPH = Double.parseDouble(txtRPH.getText().toString());
                double myHours = Double.parseDouble(txtHours.getText().toString());
                double Results = myRPH * myHours;

                txtResults.setText(String.valueOf(Results));
            }
        });
        btnYearly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double myRPH = Double.parseDouble(txtRPH.getText().toString());
                double myHours = Double.parseDouble(txtHours.getText().toString());
                txtResults.setText(String.valueOf(myRPH * myHours * 52));
            }
        });
        btnMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double myRPH = Double.parseDouble(txtRPH.getText().toString());
                double myHours = Double.parseDouble(txtHours.getText().toString());
                txtResults.setText(String.valueOf((myRPH * myHours * 52)/12));
            }
        });
    }
}