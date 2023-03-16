package com.example.notesapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import android.widget.Button;
import android.widget.Toast;

import org.junit.Test;
import org.robolectric.Robolectric;
import org.robolectric.shadows.ShadowToast;

public class ExampleUnitTest2 {
    @Test
    public void testSignupButton() {
        // Создание тестируемой Activity
        signup activity = Robolectric.setupActivity(signup.class);

        // Получение ссылки на кнопку
        Button signupButton = activity.findViewById(R.id.signup);

        // Нажатие на кнопку
        signupButton.performClick();

        // Проверка, что было показано сообщение о том, что все поля обязательны для заполнения
        Toast toast = ShadowToast.getLatestToast();
        assertNotNull(toast);
        assertEquals("All Fields are Required", ShadowToast.getTextOfLatestToast());
    }
}

