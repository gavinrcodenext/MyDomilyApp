package com.example.mydomily;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String choreAssigned = getIntent().getStringExtra("chore");
        String timeAssigned = getIntent().getStringExtra("time");
        String messageAssigned = getIntent().getStringExtra("message");
        /*ArrayList<String> profiles = getIntent().getStringArrayListExtra("profiles");
        TextView a = findViewById(R.id.todo_list_title_textview);
        a.setText(profiles.get(0) + "'s To-do List");*/
        View a = findViewById(R.id.chore_assigned_checkbox_one);
        View b = findViewById(R.id.chore_assigned_checkbox_two);
        View c = findViewById(R.id.chore_assigned_checkbox_three);
        if (!a.isShown()) {
            if (choreAssigned != null) {
            a.setVisibility(VISIBLE);
            }
        CheckBox d = findViewById(R.id.chore_assigned_checkbox_one);
            if (messageAssigned != null) {
            d.setText(choreAssigned + "- " + timeAssigned + "\n" + messageAssigned);
            }
            else {
            d.setText(choreAssigned + "- " + timeAssigned);
            }
        }
        else if (a.isShown() & !b.isShown()) {
            if (choreAssigned != null) {
                b.setVisibility(VISIBLE);
            }
            CheckBox d = findViewById(R.id.chore_assigned_checkbox_two);
            if (messageAssigned != null) {
                d.setText(choreAssigned + "- " + timeAssigned + "\n" + messageAssigned);
            }
            else {
                d.setText(choreAssigned + "- " + timeAssigned);
            }
        }
        else if (a.isShown() & b.isShown()) {
            if (choreAssigned != null) {
                c.setVisibility(VISIBLE);
            }
            CheckBox d = findViewById(R.id.chore_assigned_checkbox_three);
            if (messageAssigned != null) {
                d.setText(choreAssigned + "- " + timeAssigned + "\n" + messageAssigned);
            } else {
                d.setText(choreAssigned + "- " + timeAssigned);
            }
        }
    }

    public void gotoChoreAssignmentActivity(View view) {
        Intent intent = new Intent(this, ChoreAssignmentActivity.class);
        ArrayList<String> profiles = getIntent().getStringArrayListExtra("profiles");
        intent.putStringArrayListExtra("profiles",profiles);
        Integer kidProfilesVisible = getIntent().getIntExtra("kid profiles visible", 0);
        intent.putExtra("kid profiles visible", kidProfilesVisible);
        startActivity(intent);
    }

    public void gotoMainActivity2(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        Integer kidProfilesVisible = getIntent().getIntExtra("kid profiles visible", 0);
        intent.putExtra("kid profiles visible", kidProfilesVisible);
        ArrayList<String> profiles = getIntent().getStringArrayListExtra("profiles");
        intent.putStringArrayListExtra("profiles",profiles);
        startActivity(intent);
    }
}