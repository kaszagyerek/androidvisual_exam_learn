package com.example.constrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        EditText mail = (EditText) findViewById(R.id.idemail);
        EditText password = (EditText) findViewById(R.id.idpassword);



        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mail.getText().toString().equals("kasza@kasza.com") && password.getText().toString().equals("admin")){
                    Intent intent = new Intent(getBaseContext(),MainActivity2.class);
                    startActivity(intent);
                } else{
                    String fly = "Nem jó adat";
                    Toast.makeText(MainActivity.this , fly.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}