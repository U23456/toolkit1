package com.example.toolkit1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class counter extends AppCompatActivity {
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
    }
    public void increaseInteger(View view){
        counter = counter+1;
        display(counter);

    }

    private void display(int counter) {
        TextView displayInteger=findViewById(R.id.integer_number);
        displayInteger.setText("Clicks Counter="+counter);
    }
}