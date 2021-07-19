package com.example.mydomily;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class ProfilePageActivity extends AppCompatActivity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private EditText newprofilepopup_firstname, newprofilepopup_lastname;
    private Button newprofilepopup_cancel, newprofilepopup_save;

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
            int profilesVisible = 0;
            public void onClick(View v) {
                if (profilesVisible == 0) {
                    View b = findViewById(R.id.kid_profile_one);
                    b.setVisibility(View.VISIBLE);
                    profilesVisible += 1;
                    EditText first_name = findViewById(R.id.newprofilepopup_firstname);
                    String profile_first_name = first_name.getText().toString();
                    EditText last_name = findViewById(R.id.newprofilepopup_lastname);
                    String profile_last_name = last_name.getText().toString();
                    String profile_name = profile_first_name + profile_last_name;
                    Button button = findViewById(R.id.kid_profile_one);
                    button.setText(profile_name);
                    dialog.dismiss();
                }
                else if (profilesVisible == 1) {
                    View b = findViewById(R.id.kid_profile_two);
                    b.setVisibility(View.VISIBLE);
                    profilesVisible += 1;
                    EditText first_name = findViewById(R.id.newprofilepopup_firstname);
                    String profile_first_name = first_name.getText().toString();
                    EditText last_name = findViewById(R.id.newprofilepopup_lastname);
                    String profile_last_name = last_name.getText().toString();
                    String profile_name = profile_first_name + profile_last_name;
                    Button button = findViewById(R.id.kid_profile_two);
                    button.setText(profile_name);
                    dialog.dismiss();
                }
                else if (profilesVisible == 2) {
                    View b = findViewById(R.id.kid_profile_three);
                    b.setVisibility(View.VISIBLE);
                    profilesVisible += 1;
                    EditText first_name = findViewById(R.id.newprofilepopup_firstname);
                    String profile_first_name = first_name.getText().toString();
                    EditText last_name = findViewById(R.id.newprofilepopup_lastname);
                    String profile_last_name = last_name.getText().toString();
                    String profile_name = profile_first_name + profile_last_name;
                    Button button = findViewById(R.id.kid_profile_three);
                    button.setText(profile_name);
                    dialog.dismiss();
                }
                if (profilesVisible == 3) {
                    View b = findViewById(R.id.kid_profile_four);
                    b.setVisibility(View.VISIBLE);
                    profilesVisible += 1;
                    EditText first_name = findViewById(R.id.newprofilepopup_firstname);
                    String profile_first_name = first_name.getText().toString();
                    EditText last_name = findViewById(R.id.newprofilepopup_lastname);
                    String profile_last_name = last_name.getText().toString();
                    String profile_name = profile_first_name + profile_last_name;
                    Button button = findViewById(R.id.kid_profile_four);
                    button.setText(profile_name);
                    dialog.dismiss();
                }
                else if (profilesVisible == 4) {
                    View b = findViewById(R.id.kid_profile_five);
                    b.setVisibility(View.VISIBLE);
                    profilesVisible += 1;
                    EditText first_name = findViewById(R.id.newprofilepopup_firstname);
                    String profile_first_name = first_name.getText().toString();
                    EditText last_name = findViewById(R.id.newprofilepopup_lastname);
                    String profile_last_name = last_name.getText().toString();
                    String profile_name = profile_first_name + profile_last_name;
                    Button button = findViewById(R.id.kid_profile_five);
                    button.setText(profile_name);
                }
                else if (profilesVisible == 5) {
                    View b = findViewById(R.id.kid_profile_six);
                    b.setVisibility(View.VISIBLE);
                    profilesVisible += 1;
                    EditText first_name = findViewById(R.id.newprofilepopup_firstname);
                    String profile_first_name = first_name.getText().toString();
                    EditText last_name = findViewById(R.id.newprofilepopup_lastname);
                    String profile_last_name = last_name.getText().toString();
                    String profile_name = profile_first_name + profile_last_name;
                    Button button = findViewById(R.id.kid_profile_six);
                    button.setText(profile_name);
                    dialog.dismiss();
                }
                else if (profilesVisible == 6) {
                    View b = findViewById(R.id.kid_profile_seven);
                    b.setVisibility(View.VISIBLE);
                    profilesVisible += 1;
                    EditText first_name = findViewById(R.id.newprofilepopup_firstname);
                    String profile_first_name = first_name.getText().toString();
                    EditText last_name = findViewById(R.id.newprofilepopup_lastname);
                    String profile_last_name = last_name.getText().toString();
                    String profile_name = profile_first_name + profile_last_name;
                    Button button = findViewById(R.id.kid_profile_seven);
                    button.setText(profile_name);
                    dialog.dismiss();
                }
                else if (profilesVisible == 7) {
                    View b = findViewById(R.id.kid_profile_eight);
                    b.setVisibility(View.VISIBLE);
                    profilesVisible += 1;
                    EditText first_name = findViewById(R.id.newprofilepopup_firstname);
                    String profile_first_name = first_name.getText().toString();
                    EditText last_name = findViewById(R.id.newprofilepopup_lastname);
                    String profile_last_name = last_name.getText().toString();
                    String profile_name = profile_first_name + profile_last_name;
                    Button button = findViewById(R.id.kid_profile_eight);
                    button.setText(profile_name);
                    dialog.dismiss();
                }
                else if (profilesVisible >= 8) {
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
}