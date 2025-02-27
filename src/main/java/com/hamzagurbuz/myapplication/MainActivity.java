package com.hamzagurbuz.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText user, pass;

    Button login, clear;

    Context LoginPage = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.txtUser);
        pass = findViewById(R.id.txtPass);

        login = findViewById(R.id.login);
        clear = findViewById(R.id.clear);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("Hamza") && pass.getText().toString().equals("6436")) {
                    Toast.makeText(LoginPage, "Welcome", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginPage, SecondActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginPage, "Who Are You !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setText("");
                pass.setText("");
                user.requestFocus();
            }
        });




    }
}