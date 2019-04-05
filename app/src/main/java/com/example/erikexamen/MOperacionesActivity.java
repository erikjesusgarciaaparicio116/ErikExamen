package com.example.erikexamen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MOperacionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moperaciones);
    }

    public void suma(View view) {
        Intent intent = new Intent(this, OSumaActivity.class);
        startActivity(intent);
    }

    public void resta(View view) {
        Intent intent = new Intent(this, ORestaActivity.class);
        startActivity(intent);
    }

    public void potencia(View view) {
        Intent intent = new Intent(this, OPotenciaActivity.class);
        startActivity(intent);
    }

    public void salir(View view) {
        Intent intent = new Intent(this, SalidaActivity.class);
        startActivity(intent);
    }
}