package com.example.notesapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.junit.Test;
import org.robolectric.shadows.ShadowToast;

public class FogotPasswordUnitTest {

    @Test
    public void passwordRecoveryButton_Click_EmailIsEmpty_ShowToast() {
        fogotpassword fogotpasswordActivity = new fogotpassword();
        EditText forgotPasswordEditText = new EditText(fogotpasswordActivity);
        forgotPasswordEditText.setText("");
        fogotpasswordActivity.mforgotpassword = forgotPasswordEditText;
        Button passwordRecoveryButton = new Button(fogotpasswordActivity);
        fogotpasswordActivity.mpasswordrecoverbutton = passwordRecoveryButton;

        passwordRecoveryButton.performClick();

        Toast toast = ShadowToast.getLatestToast();
        String toastMessage = ShadowToast.getTextOfLatestToast();
        assertEquals(toastMessage, "Enter your mail first");
    }

}

