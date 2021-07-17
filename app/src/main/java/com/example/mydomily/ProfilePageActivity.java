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
            @Override
            public void onClick(View v) {
                //save button
            }
        });

        newprofilepopup_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cancel button
                dialog.dismiss();
            }
        });
    }
}