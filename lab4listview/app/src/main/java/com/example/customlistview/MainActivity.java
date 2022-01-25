package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"Cat", "Pig", "Giraffe", "Horse",
            "Dog", "Lion", "Octopus", "Rabbit", "Sheep"};
    String[] infoArray = {"8 tentacled monster", "Delicious in rolls", "Great for jumpers", "Nice in a stew", "Great for shoes",
            "Scary", "Scary", "Scary", "Scary"};
    Integer[] imageArray = {
            R.drawable.cat,
            R.drawable.disznyo,
            R.drawable.giraffe,
            R.drawable.horse,
            R.drawable.dog,
            R.drawable.lion,
            R.drawable.octopus3,
            R.drawable.rabbit,
            R.drawable.sheep
    };

    ListView lista ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gomb = findViewById(R.id.gomb);
        lista = findViewById(R.id.allatlista);

        AnimalListAdapter adapter = new AnimalListAdapter(this,nameArray,infoArray,imageArray);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener((adapterView, view, position, id) -> {

            Toast.makeText(MainActivity.this, infoArray[position], Toast.LENGTH_SHORT).show();
        });

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });


    }
}