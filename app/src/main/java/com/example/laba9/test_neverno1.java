package com.example.laba9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class test_neverno1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_neverno1);
    }
    public void vel(View view) {
        Intent intent = new Intent(test_neverno1.this, test_neverno1.class);
        startActivity(intent);
    }
    public void Pravilno(View view){
        Intent intent = new Intent(test_neverno1.this, pravilno.class);
        startActivity(intent);
    }
}
