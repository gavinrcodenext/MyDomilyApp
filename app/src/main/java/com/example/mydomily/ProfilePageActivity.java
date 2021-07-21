package com.example.mydomily;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class ProfilePageActivity extends AppCompatActivity {
    private int kidProfilesVisible = -1;
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private EditText newprofilepopup_firstname, newprofilepopup_lastname;
    private Button newprofilepopup_cancel, newprofilepopup_save;
    private ArrayList<String> profiles;

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
            public void onClick(View v) {
                if (kidProfilesVisible == 0) {
                    View b = findViewById(R.id.kid_profile_one);
                    b.setVisibility(View.VISIBLE);
                    kidProfilesVisible += 1;
                    String profile_name = newprofilepopup_firstname.getText().toString() + " " + newprofilepopup_lastname.getText().toString();
                    Button button = findViewById(R.id.kid_profile_one);
                    button.setText(profile_name);
                    profiles.add(profile_name);
                    dialog.dismiss();
                }
                else if (kidProfilesVisible == 1) {
                    View b = findViewById(R.id.kid_profile_two);
                    b.setVisibility(View.VISIBLE);
                    kidProfilesVisible += 1;
                    String profile_name = newprofilepopup_firstname.getText().toString() + " " + newprofilepopup_lastname.getText().toString();
                    Button button = findViewById(R.id.kid_profile_two);
                    button.setText(profile_name);
                    profiles.add(profile_name);
                    dialog.dismiss();
                }
                else if (kidProfilesVisible == 2) {
                    View b = findViewById(R.id.kid_profile_three);
                    b.setVisibility(View.VISIBLE);
                    kidProfilesVisible += 1;
                    String profile_name = newprofilepopup_firstname.getText().toString() + " " + newprofilepopup_lastname.getText().toString();
                    Button button = findViewById(R.id.kid_profile_three);
                    button.setText(profile_name);
                    profiles.add(profile_name);
                    dialog.dismiss();
                }
                else if (kidProfilesVisible == 3) {
                    View b = findViewById(R.id.kid_profile_four);
                    b.setVisibility(View.VISIBLE);
                    kidProfilesVisible += 1;
                    String profile_name = newprofilepopup_firstname.getText().toString() + " " + newprofilepopup_lastname.getText().toString();
                    Button button = findViewById(R.id.kid_profile_four);
                    button.setText(profile_name);
                    profiles.add(profile_name);
                    dialog.dismiss();
                }
                else if (kidProfilesVisible == 4) {
                    View b = findViewById(R.id.kid_profile_five);
                    b.setVisibility(View.VISIBLE);
                    kidProfilesVisible += 1;
                    String profile_name = newprofilepopup_firstname.getText().toString() + " " + newprofilepopup_lastname.getText().toString();
                    Button button = findViewById(R.id.kid_profile_five);
                    button.setText(profile_name);
                    profiles.add(profile_name);
                    dialog.dismiss();
                }
                else if (kidProfilesVisible == 5) {
                    View b = findViewById(R.id.kid_profile_six);
                    b.setVisibility(View.VISIBLE);
                    kidProfilesVisible += 1;
                    String profile_name = newprofilepopup_firstname.getText().toString() + " " + newprofilepopup_lastname.getText().toString();
                    Button button = findViewById(R.id.kid_profile_six);
                    button.setText(profile_name);
                    profiles.add(profile_name);
                    dialog.dismiss();
                }
                else if (kidProfilesVisible == 6) {
                    View b = findViewById(R.id.kid_profile_seven);
                    b.setVisibility(View.VISIBLE);
                    kidProfilesVisible += 1;
                    String profile_name = newprofilepopup_firstname.getText().toString() + " " + newprofilepopup_lastname.getText().toString();
                    Button button = findViewById(R.id.kid_profile_seven);
                    button.setText(profile_name);
                    profiles.add(profile_name);
                    dialog.dismiss();
                }
                else if (kidProfilesVisible == 7) {
                    View b = findViewById(R.id.kid_profile_eight);
                    b.setVisibility(View.VISIBLE);
                    kidProfilesVisible += 1;
                    String profile_name = newprofilepopup_firstname.getText().toString() + " " + newprofilepopup_lastname.getText().toString();
                    Button button = findViewById(R.id.kid_profile_eight);
                    button.setText(profile_name);
                    profiles.add(profile_name);
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
            intent.putStringArrayListExtra("profiles",profiles);
            startActivity(intent);
        }
}