package com.example.LDM_Evaluacion2_HC98I04001;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnCalc  = findViewById(R.id.btnCal);
        Button btnDatos = findViewById(R.id.btnDatos);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this,CalculadoraActivity.class);
                startActivity(mIntent);
            }
        });

        btnDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bDatos = new Intent(MainActivity.this,MisDatosAcitvity.class);
                startActivity(bDatos);
            }
        });


    }
}