package com.example.toolkit1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    private EditText e1;
    private EditText e2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        e1=(EditText) findViewById(R.id.enter1);
        e2=(EditText) findViewById(R.id.enter2);
        result=(TextView) findViewById(R.id.result);
    }

    public void btsum(View view) {
        float n1 = Integer.parseInt(e1.getText().toString());
        float n2 = Integer.parseInt(e2.getText().toString());
        float sum = n1 + n2;
        result.setText(String.valueOf(sum));
    }

    public void btsub(View view) {
        float n1 = Integer.parseInt(e1.getText().toString());
        float n2 = Integer.parseInt(e2.getText().toString());
        float sub = n1 - n2;
        result.setText(String.valueOf(sub));
    }

    public void btMul(View view) {
        float n1 = Integer.parseInt(e1.getText().toString());
        float n2 = Integer.parseInt(e2.getText().toString());
        float Mul = n1 * n2;
        result.setText(String.valueOf(Mul));
    }

    public void btdiv(View view) {
        float n1 = Integer.parseInt(e1.getText().toString());
        float n2 = Integer.parseInt(e2.getText().toString());
        float Div = n1 / n2;
        result.setText(String.valueOf(Div));
    }
}