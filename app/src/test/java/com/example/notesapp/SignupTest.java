package com.example.notesapp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.junit.Test;

public class SignupTest {

    @Test
    public void testSignup() {
        // Проверка регистрации пользователя в Firebase с корректными данными
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        String email = "test@test.com";
        String password = "password123";
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                assertTrue(task.isSuccessful());
            }
        });

        // Проверка отправки электронной почты для верификации
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        assertNotNull(firebaseUser);
        firebaseUser.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                assertTrue(task.isSuccessful());
            }
        });
    }

}
