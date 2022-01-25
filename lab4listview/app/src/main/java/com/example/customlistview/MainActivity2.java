package com.example.customlistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    String[] symArray = {"aud", "cad", "chf", "dkk", "eur", "huf", "usd"};
    String[] teljesArray = {"audaud", "cadcad", "chfchf", "dkkdkk", "euro", "forint", "dollar"};
    Integer[] imageArray = {
            R.drawable.aud,
            R.drawable.cad,
            R.drawable.chf,
            R.drawable.dkk,
            R.drawable.eur,
            R.drawable.huf,
            R.drawable.usd,
    };
    double[] buyArray = new double[]
            {1.41, 2.42, 3.44, 4.55, 5.74, 6.44, 7.21};
    double[] sellArray = new double[]
            {7.12, 6.22, 5.33, 4.44, 3.22, 2.11, 1.22};

    ListView lista2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lista2 = findViewById(R.id.idvaluta);
        ValutaListAdapter adapter2 = new ValutaListAdapter(this,imageArray,symArray,teljesArray,buyArray,sellArray);
        lista2.setAdapter(adapter2);

        lista2.setOnItemClickListener((adapterView,view,position,id)->{
            Toast.makeText(getBaseContext(),teljesArray[position],Toast.LENGTH_SHORT).show();
        });

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
