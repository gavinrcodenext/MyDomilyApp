package com.example.mydomily;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Integer kidProfilesVisible = getIntent().getIntExtra("kid profiles visible", 0);
        ArrayList<String> profiles = getIntent().getStringArrayListExtra("profiles");
        if (kidProfilesVisible == 0) {
            TextView e = findViewById(R.id.textView3);
            String noProfilesMessage = "You have not made any profiles yet";
            e.setText(noProfilesMessage);
        }
        else if (kidProfilesVisible == 1) {
            View b = findViewById(R.id.profile_one_label);
            b.setVisibility(View.VISIBLE);
            TextView t = findViewById(R.id.profile_one_label);
            t.setText(profiles.get(0));
            View c = findViewById(R.id.profile_button_one);
            c.setVisibility(View.VISIBLE);
        }
        else if (kidProfilesVisible == 2) {
            View b = findViewById(R.id.profile_two_label);
            b.setVisibility(View.VISIBLE);
            View c = findViewById(R.id.profile_button_two);
            c.setVisibility(View.VISIBLE);
            TextView t = findViewById(R.id.profile_two_label);
            t.setText(profiles.get(1));
        }
        else if (kidProfilesVisible == 3) {
            View b = findViewById(R.id.profile_three_label);
            b.setVisibility(View.VISIBLE);
            View c = findViewById(R.id.profile_button_three);
            c.setVisibility(View.VISIBLE);
            TextView t = findViewById(R.id.profile_three_label);
            t.setText(profiles.get(2));
        }
        else if (kidProfilesVisible == 4) {
            View b = findViewById(R.id.profile_four_label);
            b.setVisibility(View.VISIBLE);
            View c = findViewById(R.id.profile_button_four);
            c.setVisibility(View.VISIBLE);
            TextView t = findViewById(R.id.profile_four_label);
            t.setText(profiles.get(3));
        }
        else if (kidProfilesVisible == 5) {
            View b = findViewById(R.id.profile_five_label);
            b.setVisibility(View.VISIBLE);
            View c = findViewById(R.id.profile_button_five);
            c.setVisibility(View.VISIBLE);
            TextView t = findViewById(R.id.profile_five_label);
            t.setText(profiles.get(4));
        }
        else if (kidProfilesVisible == 6) {
            View b = findViewById(R.id.profile_six_label);
            b.setVisibility(View.VISIBLE);
            View c = findViewById(R.id.profile_button_six);
            c.setVisibility(View.VISIBLE);
            TextView t = findViewById(R.id.profile_six_label);
            t.setText(profiles.get(5));
        }
    }

    public void goToChoreList(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        ArrayList<String> profiles = getIntent().getStringArrayListExtra("profiles");
        intent.putStringArrayListExtra("profiles",profiles);
        startActivity(intent);
    }
}