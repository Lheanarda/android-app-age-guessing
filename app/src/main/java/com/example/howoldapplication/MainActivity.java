package com.example.howoldapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Year;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public void clickCalculate (View viewCalculate){
        EditText edtTahun = findViewById(R.id.edtTahun);
        EditText edtUsia = findViewById(R.id.edtUsia);
        View edtHasil = findViewById(R.id.edtUsia);


        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        String thnTxt = edtTahun.getText().toString();
        int thn = Integer.parseInt(thnTxt);
        String usia = String.valueOf(currentYear - thn);

        edtHasil.setVisibility(View.VISIBLE);
        edtUsia.setText(usia + " Years Old");

        Toast.makeText(MainActivity.this,"Calculate successfully !",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
