package com.example.notesapp;

import org.junit.Test;
import org.robolectric.Robolectric;
import org.robolectric.shadows.ShadowToast;

import static org.junit.Assert.*;

import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;


public class ExampleUnitTest {
    @Test
    public void testGetRandomColor() {
        int expectedSize = 11;
        List<Integer> colorCode = new ArrayList<>();
        colorCode.add(R.color.gray);
        colorCode.add(R.color.pink);
        colorCode.add(R.color.lightgreen);
        colorCode.add(R.color.skyblue);
        colorCode.add(R.color.color1);
        colorCode.add(R.color.color2);
        colorCode.add(R.color.color3);
        colorCode.add(R.color.color4);
        colorCode.add(R.color.color5);
        colorCode.add(R.color.green);

        notesactivity notesactivity = new notesactivity();
        int randomColor = notesactivity.getRandomColor();
        assertTrue("Returned color code is not valid", colorCode.contains(randomColor));
        assertEquals("List size doesn't match expected size", expectedSize, colorCode.size());
    }
}

