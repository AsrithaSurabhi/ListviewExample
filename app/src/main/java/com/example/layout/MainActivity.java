package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    EditText input;
    ListView list;
    ArrayAdapter adapter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// android:id="@+id/input"
        input = (EditText) findViewById(R.id.input);
// android:id="@+id/list"
        list = (ListView) findViewById(R.id.list);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new ArrayList());
        list.setAdapter(adapter);
    }

    // android:onClick="addToList"
    public void addToList(View view) {
        adapter.add(input.getText().toString());
        adapter.notifyDataSetChanged();
// Clear the input
        input.setText("");
    }
}