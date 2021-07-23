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
            View b = findViewById(R.id.profile_one_label);
            b.setVisibility(View.VISIBLE);
            TextView t = findViewById(R.id.profile_one_label);
            t.setText(profiles.get(0));
            View c = findViewById(R.id.profile_button_one);
            c.setVisibility(View.VISIBLE);
            View a = findViewById(R.id.profile_two_label);
            a.setVisibility(View.VISIBLE);
            View f = findViewById(R.id.profile_button_two);
            f.setVisibility(View.VISIBLE);
            TextView g = findViewById(R.id.profile_two_label);
            g.setText(profiles.get(1));
        }
        else if (kidProfilesVisible == 3) {
            View b = findViewById(R.id.profile_one_label);
            b.setVisibility(View.VISIBLE);
            TextView t = findViewById(R.id.profile_one_label);
            t.setText(profiles.get(0));
            View c = findViewById(R.id.profile_button_one);
            c.setVisibility(View.VISIBLE);
            View a = findViewById(R.id.profile_two_label);
            a.setVisibility(View.VISIBLE);
            View f = findViewById(R.id.profile_button_two);
            f.setVisibility(View.VISIBLE);
            TextView g = findViewById(R.id.profile_two_label);
            g.setText(profiles.get(1));
            View j = findViewById(R.id.profile_three_label);
            j.setVisibility(View.VISIBLE);
            View i = findViewById(R.id.profile_button_three);
            i.setVisibility(View.VISIBLE);
            TextView z = findViewById(R.id.profile_three_label);
            z.setText(profiles.get(2));
        }
        else if (kidProfilesVisible == 4) {
            View b = findViewById(R.id.profile_one_label);
            b.setVisibility(View.VISIBLE);
            TextView t = findViewById(R.id.profile_one_label);
            t.setText(profiles.get(0));
            View c = findViewById(R.id.profile_button_one);
            c.setVisibility(View.VISIBLE);
            View a = findViewById(R.id.profile_two_label);
            a.setVisibility(View.VISIBLE);
            View f = findViewById(R.id.profile_button_two);
            f.setVisibility(View.VISIBLE);
            TextView g = findViewById(R.id.profile_two_label);
            g.setText(profiles.get(1));
            View j = findViewById(R.id.profile_three_label);
            j.setVisibility(View.VISIBLE);
            View i = findViewById(R.id.profile_button_three);
            i.setVisibility(View.VISIBLE);
            TextView z = findViewById(R.id.profile_three_label);
            z.setText(profiles.get(2));
            View y = findViewById(R.id.profile_four_label);
            y.setVisibility(View.VISIBLE);
            View x = findViewById(R.id.profile_button_four);
            x.setVisibility(View.VISIBLE);
            TextView w = findViewById(R.id.profile_four_label);
            w.setText(profiles.get(3));
        }
        else if (kidProfilesVisible == 5) {
            View b = findViewById(R.id.profile_one_label);
            b.setVisibility(View.VISIBLE);
            TextView t = findViewById(R.id.profile_one_label);
            t.setText(profiles.get(0));
            View c = findViewById(R.id.profile_button_one);
            c.setVisibility(View.VISIBLE);
            View a = findViewById(R.id.profile_two_label);
            a.setVisibility(View.VISIBLE);
            View f = findViewById(R.id.profile_button_two);
            f.setVisibility(View.VISIBLE);
            TextView g = findViewById(R.id.profile_two_label);
            g.setText(profiles.get(1));
            View j = findViewById(R.id.profile_three_label);
            j.setVisibility(View.VISIBLE);
            View i = findViewById(R.id.profile_button_three);
            i.setVisibility(View.VISIBLE);
            TextView z = findViewById(R.id.profile_three_label);
            z.setText(profiles.get(2));
            View y = findViewById(R.id.profile_four_label);
            y.setVisibility(View.VISIBLE);
            View x = findViewById(R.id.profile_button_four);
            x.setVisibility(View.VISIBLE);
            TextView w = findViewById(R.id.profile_four_label);
            w.setText(profiles.get(3));
            View k = findViewById(R.id.profile_five_label);
            k.setVisibility(View.VISIBLE);
            View l = findViewById(R.id.profile_button_five);
            l.setVisibility(View.VISIBLE);
            TextView m = findViewById(R.id.profile_five_label);
            m.setText(profiles.get(4));
        }
        else if (kidProfilesVisible == 6) {
            View b = findViewById(R.id.profile_one_label);
            b.setVisibility(View.VISIBLE);
            TextView t = findViewById(R.id.profile_one_label);
            t.setText(profiles.get(0));
            View c = findViewById(R.id.profile_button_one);
            c.setVisibility(View.VISIBLE);
            View a = findViewById(R.id.profile_two_label);
            a.setVisibility(View.VISIBLE);
            View f = findViewById(R.id.profile_button_two);
            f.setVisibility(View.VISIBLE);
            TextView g = findViewById(R.id.profile_two_label);
            g.setText(profiles.get(1));
            View j = findViewById(R.id.profile_three_label);
            j.setVisibility(View.VISIBLE);
            View i = findViewById(R.id.profile_button_three);
            i.setVisibility(View.VISIBLE);
            TextView z = findViewById(R.id.profile_three_label);
            z.setText(profiles.get(2));
            View y = findViewById(R.id.profile_four_label);
            y.setVisibility(View.VISIBLE);
            View x = findViewById(R.id.profile_button_four);
            x.setVisibility(View.VISIBLE);
            TextView w = findViewById(R.id.profile_four_label);
            w.setText(profiles.get(3));
            View k = findViewById(R.id.profile_five_label);
            k.setVisibility(View.VISIBLE);
            View l = findViewById(R.id.profile_button_five);
            l.setVisibility(View.VISIBLE);
            TextView m = findViewById(R.id.profile_five_label);
            m.setText(profiles.get(4));
            View n = findViewById(R.id.profile_six_label);
            n.setVisibility(View.VISIBLE);
            View o = findViewById(R.id.profile_button_six);
            o.setVisibility(View.VISIBLE);
            TextView p = findViewById(R.id.profile_six_label);
            p.setText(profiles.get(5));
        }
    }

    public void goToChoreList(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        ArrayList<String> profiles = getIntent().getStringArrayListExtra("profiles");
        intent.putStringArrayListExtra("profiles",profiles);
        startActivity(intent);
    }
}