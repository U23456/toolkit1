package com.example.toolkit1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.DatabaseHelper;

import java.util.ArrayList;

public class sql extends AppCompatActivity {
    EditText ettext;
    Button btadd,btdelete;
    ListView listView;
    DatabaseHelper databaseHelper;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);

        ettext=findViewById(R.id.et_text);
        btadd=findViewById(R.id.btn_add);
        listView=findViewById(R.id.list_view);
        databaseHelper = new DatabaseHelper(sql.this);
        arrayList = databaseHelper.getAllText();
        arrayAdapter = new ArrayAdapter(sql.this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= ettext.getText().toString();
                if (!text.isEmpty()){
                    if (databaseHelper.addText(text)){
                        ettext.setText("");
                        Toast.makeText(getApplicationContext(),"data inserted",Toast.LENGTH_SHORT).show();
                        arrayList.clear();
                        arrayList.addAll(databaseHelper.getAllText());
                        arrayAdapter.notifyDataSetChanged();
                        listView.invalidateViews();
                        listView.refreshDrawableState();
                    }
                }
            }
        });

    }
}