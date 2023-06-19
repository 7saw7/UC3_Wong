package com.example.dam_uc3_sandrow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;


    private List<String> optionsList;
    private List<String> optionsList2;

    private List<String> optionsList3;

    private List<String> optionsList4;

    private ArrayAdapter<String> adapter;
    private ArrayAdapter<String> adapter2;
    private ArrayAdapter<String> adapter3;
    private ArrayAdapter<String> adapter4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btnEntrar);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Ingresó correctamente", Toast.LENGTH_SHORT).show());
        Button btn2 = findViewById(R.id.btnregistrar);
        btn2.setOnClickListener(view -> Toast.makeText(this, "Se registró correctamente", Toast.LENGTH_SHORT).show());

        spinner = findViewById(R.id.spinner);
        optionsList = new ArrayList<>();
        optionsList.add(getString(R.string.opcion_sexoF));
        optionsList.add(getString(R.string.opcion_sexoM));
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, optionsList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        spinner2 = findViewById(R.id.spinner2);
        optionsList2 = new ArrayList<>();
        optionsList2.add(getString(R.string.opcion_dia));

        adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, optionsList2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        spinner3 = findViewById(R.id.spinner3);
        optionsList3 = new ArrayList<>();
        optionsList3.add(getString(R.string.opcion_mes));

        adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, optionsList3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        spinner4 = findViewById(R.id.spinner4);
        optionsList4 = new ArrayList<>();
        optionsList4.add(getString(R.string.opcion_año));

        adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, optionsList4);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
    }
}