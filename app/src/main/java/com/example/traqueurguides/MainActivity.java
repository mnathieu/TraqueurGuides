package com.example.traqueurguides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String USER_NAME = "com.example.traqueurguides.userName";

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
            public void pressConnectButton(View view){
                Intent intent = new Intent(this, RoleActivity.class);
                EditText userName = (EditText) findViewById(R.id.user_name);
                String userNameString = userName.getText().toString();
                intent.putExtra(USER_NAME, userNameString);
                startActivity(intent);

             }
    }