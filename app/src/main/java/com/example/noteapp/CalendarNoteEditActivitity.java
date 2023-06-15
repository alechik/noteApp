package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CalendarNoteEditActivitity extends AppCompatActivity {

    ImageButton btn_upload_image;
    ImageButton btn_save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_note_edit_activitity);
        getSupportActionBar().hide();
        btn_upload_image = findViewById(R.id.btn_upload_image);
        btn_save = findViewById(R.id.btn_save);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalendarNoteEditActivitity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

    }
}