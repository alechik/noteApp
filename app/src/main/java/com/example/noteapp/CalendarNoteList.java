package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CalendarNoteList extends AppCompatActivity {

    ImageButton btn_search;
    ImageButton btn_calendar;
    ImageButton btn_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_note_list);
        btn_search = findViewById(R.id.btn_search);
        btn_add = findViewById(R.id.btn_add);
        btn_calendar = findViewById(R.id.btn_calendar);
        getSupportActionBar().hide();

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a NoteEditActivity
                Intent intent = new Intent(CalendarNoteList.this, CalendarNoteEditActivitity.class);
                startActivity(intent);
            }
        });

        btn_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a CalendarActivity
                Intent intent = new Intent(CalendarNoteList.this, CalendarActivity.class);
                startActivity(intent);
            }
        });
    }
}