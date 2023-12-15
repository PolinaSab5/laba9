package com.example.laba9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class pravilno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pravilno);
    }
    public void Programma(View view){
        Intent intent = new Intent(pravilno.this, programma.class);
        startActivity(intent);
    }
}
