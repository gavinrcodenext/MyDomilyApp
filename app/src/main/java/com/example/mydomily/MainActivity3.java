package com.example.mydomily;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void gotoChoreAssignmentActivity(View view) {
        Intent intent = new Intent(this, ChoreAssignmentActivity.class);
        ArrayList<String> profiles = getIntent().getStringArrayListExtra("profiles");
        intent.putStringArrayListExtra("profiles",profiles);
        startActivity(intent);
    }
}