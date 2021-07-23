package com.example.mydomily;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Objects;

public class ProfilePageActivity extends AppCompatActivity {
    private int kidProfilesVisible = 0;
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private EditText newprofilepopup_firstname, newprofilepopup_lastname;
    private Button newprofilepopup_cancel, newprofilepopup_save;
    private ImageView survivalGuide;
    private final ArrayList<String> profiles = new ArrayList<String>();
    private String profile_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
    }

    public void createNewProfileDialog(View View) {
        dialogBuilder = new AlertDialog.Builder ( this);
        final View profilePopupView = getLayoutInflater().inflate(R.layout.popup, null);
        newprofilepopup_firstname = (EditText) profilePopupView.findViewById(R.id.newprofilepopup_firstname);
        newprofilepopup_lastname = (EditText) profilePopupView.findViewById(R.id.newprofilepopup_lastname);

        newprofilepopup_save = (Button) profilePopupView.findViewById(R.id.saveButton);
        newprofilepopup_cancel = (Button) profilePopupView.findViewById(R.id.cancelButton);

        dialogBuilder.setView(profilePopupView);
        dialog = dialogBuilder.create();
        dialog.show();

        newprofilepopup_save.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            public void onClick(View v) {
                String profile_name = newprofilepopup_firstname.getText().toString() + " " + newprofilepopup_lastname.getText().toString();
                profiles.add(profile_name);
                if (kidProfilesVisible == 0) {
                    View b = findViewById(R.id.profile_button_two);
                    b.setVisibility(android.view.View.VISIBLE);
                    kidProfilesVisible += 1;
                    Button button = findViewById(R.id.profile_button_two);
                    button.setText(profile_name);
                    String easterEgg = "best item to survive";
                    if (Objects.equals(profile_name, easterEgg)) {
                        ImageView i = findViewById(R.id.survival_guide);
                        i.setVisibility(android.view.View.VISIBLE);
                        b.setVisibility(android.view.View.INVISIBLE);
                        dialog.dismiss();
                    }
                    dialog.dismiss();

                }
                else if (kidProfilesVisible == 1) {
                    View b = findViewById(R.id.profile_button_three);
                    b.setVisibility(android.view.View.VISIBLE);
                    kidProfilesVisible += 1;
                    Button button = findViewById(R.id.profile_button_three);
                    button.setText(profile_name);
                    dialog.dismiss();
                }
                else if (kidProfilesVisible == 2) {
                    View b = findViewById(R.id.profile_button_four);
                    b.setVisibility(android.view.View.VISIBLE);
                    kidProfilesVisible += 1;
                    Button button = findViewById(R.id.profile_button_four);
                    button.setText(profile_name);
                    dialog.dismiss();
                }
                else if (kidProfilesVisible == 3) {
                    View b = findViewById(R.id.profile_button_five);
                    b.setVisibility(android.view.View.VISIBLE);
                    kidProfilesVisible += 1;
                    Button button = findViewById(R.id.profile_button_five);
                    button.setText(profile_name);
                    dialog.dismiss();
                }
                else if (kidProfilesVisible == 4) {
                    View b = findViewById(R.id.profile_button_six);
                    b.setVisibility(android.view.View.VISIBLE);
                    kidProfilesVisible += 1;
                    Button button = findViewById(R.id.profile_button_six);
                    button.setText(profile_name);
                    dialog.dismiss();
                }
                else {
                    dialog.dismiss();
                }
            }
        });

        newprofilepopup_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

        public void gotoMainActivity2(View view) {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putStringArrayListExtra("profiles", profiles);
            intent.putExtra("kid profiles visible", kidProfilesVisible);
            startActivity(intent);
        }
}