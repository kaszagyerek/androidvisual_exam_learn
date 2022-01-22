package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         EditText szam1 = (EditText) findViewById(R.id.szam1);
         EditText szam2 = (EditText) findViewById(R.id.szam2);
         Button elkuld = (Button) findViewById(R.id.button);
         TextView kiir = (TextView) findViewById(R.id.result);

         elkuld.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                 try {
                     double eredmeny = Double.parseDouble(szam1.getText().toString()) + Double.parseDouble(szam2.getText().toString());
                     kiir.setText(Double.toString(eredmeny));
                     String fly = Double.toString(eredmeny);
                     Toast.makeText(MainActivity.this , fly.toString(), Toast.LENGTH_SHORT).show();


                 } catch(NumberFormatException e){
                     kiir.setText("");
                     String fly2 = "hiba van";
                     Toast.makeText(MainActivity.this , fly2.toString(), Toast.LENGTH_SHORT).show();

                 }
             }
         });

    }
}