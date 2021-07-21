package com.example.mydomily;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class ChoreAssignmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chore_assignment_page);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayList<String> myList = getIntent().getStringArrayListExtra("profiles");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, myList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Log.e("number of profiles", String.valueOf(myList.size()));
        spinner.setAdapter(adapter);
    }


    public void confirmAssignChore(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


}