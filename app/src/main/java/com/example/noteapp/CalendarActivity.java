package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;

public class CalendarActivity extends AppCompatActivity {

    ImageButton back_button;
    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        back_button = findViewById(R.id.back_button);
        calendarView = findViewById(R.id.calendarView);
        getSupportActionBar().hide();
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Regresar a NoteListActivity
                Intent intent = new Intent(CalendarActivity.this, NoteListActivity.class);
                startActivity(intent);
            }
        });

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // Navegar a NoteEditActivity
                Intent intent = new Intent(CalendarActivity.this, CalendarNoteList.class);
                startActivity(intent);
            }
        });
    }
}