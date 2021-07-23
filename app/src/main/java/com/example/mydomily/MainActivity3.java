package com.example.mydomily;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String choreAssigned = getIntent().getStringExtra("chore");
        String timeAssigned = getIntent().getStringExtra("time");
        String messageAssigned = getIntent().getStringExtra("message");
        View b = findViewById(R.id.chore_assigned_checkbox);
        /*ArrayList<String> profiles = getIntent().getStringArrayListExtra("profiles");
        TextView a = findViewById(R.id.todo_list_title_textview);
        a.setText(profiles.get(0) + "'s To-do List");*/
        if (choreAssigned != null) {
            b.setVisibility(View.VISIBLE);
        }
        CheckBox c = findViewById(R.id.chore_assigned_checkbox);
        if (messageAssigned != null) {
            c.setText(choreAssigned + "- " + timeAssigned + "\n" + messageAssigned);
        }
        else {
            c.setText(choreAssigned + "- " + timeAssigned);
        }
    }

    public void gotoChoreAssignmentActivity(View view) {
        Intent intent = new Intent(this, ChoreAssignmentActivity.class);
        ArrayList<String> profiles = getIntent().getStringArrayListExtra("profiles");
        intent.putStringArrayListExtra("profiles",profiles);
        startActivity(intent);
    }

    public void gotoMainActivity4(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}