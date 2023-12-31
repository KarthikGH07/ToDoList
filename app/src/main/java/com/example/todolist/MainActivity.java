package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText inputText;
    ListView listView;
    ArrayList<String> list;

    public void onAddButtonClick(View v) {
        String text = inputText.getText().toString();
        String updatedText = new StringUtils().convertToUpperCase(text);
        list.add(updatedText);
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
        inputText.setText("", TextView.BufferType.EDITABLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.addButton);
        inputText = findViewById(R.id.inputText);
        listView = findViewById(R.id.listView);
        list = new ArrayList<>();
    }
}