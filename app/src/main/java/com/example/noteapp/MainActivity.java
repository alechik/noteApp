package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private static final long SPLASH_DELAY = 2000; // 2000 milisegundos = 2 segundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        // Crear un objeto Handler para realizar la transición después de un retraso
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crear un Intent para iniciar la actividad NoteListActivity
                Intent intent = new Intent(MainActivity.this, NoteListActivity.class);
                startActivity(intent);

                // Finalizar la actividad actual
                finish();
            }
        }, SPLASH_DELAY);
    }
}