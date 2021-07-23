package com.example.mydomily;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class ChoreAssignmentActivity extends AppCompatActivity {

    public EditText chore_textedit, time_textedit, message_textedit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chore_assignment_page);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayList<String> myList = getIntent().getStringArrayListExtra("profiles");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, myList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }


    public void confirmAssignChore(View view) {
        chore_textedit = (EditText) findViewById(R.id.chore_textedit);
        time_textedit = (EditText) findViewById(R.id.time_edittext);
        message_textedit = (EditText) findViewById(R.id.message_textedit);
        String choreAssigned = chore_textedit.getText().toString();
        String timeAssigned = time_textedit.getText().toString();
        String messageAssigned = message_textedit.getText().toString();
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("chore", choreAssigned);
        intent.putExtra("time", timeAssigned);
        intent.putExtra("message", messageAssigned);
        Integer kidProfilesVisible = getIntent().getIntExtra("kid profiles visible", 0);
        intent.putExtra("kid profiles visible", kidProfilesVisible);
        ArrayList<String> profiles = getIntent().getStringArrayListExtra("profiles");
        intent.putStringArrayListExtra("profiles",profiles);
        startActivity(intent);
    }
}