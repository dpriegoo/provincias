package com.example.provincias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner lstProvincias = findViewById(R.id.spinner);
        ImageView sevilla = findViewById(R.id.sevillaView);





        lstProvincias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {



               provincias(i, sevilla);


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
}
    private void provincias (int i, ImageView sevilla){
        switch (i){
            case 0:
                sevilla.setImageResource(R.drawable.sevilla);
                break;

            case 3:
                sevilla.setImageResource(R.drawable.huelva);
                break;

        }
    }
}