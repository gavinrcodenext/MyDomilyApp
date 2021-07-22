package com.example.mydomily;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void goToChoreList(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        ArrayList<String> profiles = getIntent().getStringArrayListExtra("profiles");
        intent.putStringArrayListExtra("profiles",profiles);
        startActivity(intent);
    }
}