package com.example.traqueurguides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.traqueurguides.MainActivity.USER_NAME;

public class RoleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role);

        Intent intent = getIntent();
        String userName = intent.getStringExtra(USER_NAME);

        TextView userNameDisplay = findViewById(R.id.userNameDisplay);
        userNameDisplay.setText(userName);
    }
}