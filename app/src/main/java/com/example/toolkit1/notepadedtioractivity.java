package com.example.toolkit1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class notepadedtioractivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepadedtioractivity);
        EditText editText=(EditText)findViewById(R.id.edittext);
        Intent intent = getIntent();
    }
}