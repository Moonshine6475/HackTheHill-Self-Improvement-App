package com.example.thehealthapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText emailEntry = (EditText) findViewById(R.id.editTextEmailAddress);
        EditText passEntry = (EditText) findViewById(R.id.editTextPassword);
        EditText passConfirm = (EditText) findViewById(R.id.editTextPasswordConf);

    }


    public void registerPressed(View view) {
        EditText et = findViewById(R.id.editTextTextEmailAddress);
        String e = String.valueOf(et.getText());
        et = findViewById(R.id.editTextPassword);
        String p = String.valueOf(et.getText());
        et = findViewById(R.id.editTextPasswordConf);
        String c = String.valueOf(et.getText());
        if(p.equals(c)) {
            MainActivity.user = new Account(e,p);
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        }else{

        }
        //idk do something with these
    }

    public void accLogin(View view) {
        //should send you to the login page?
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }


}