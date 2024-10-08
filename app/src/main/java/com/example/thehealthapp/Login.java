package com.example.thehealthapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.d("hI", "onCreate: hi");
    }

    final EditText emailEntry = (EditText) findViewById(R.id.editTextTextEmailAddress);
    final EditText passEntry = (EditText) findViewById(R.id.editTextTextPassword);

    public void loginPressed(View view) {
        emailEntry.getText();
        passEntry.getText();
        //idk do something with these
    }

    public void noAccSignUp(View view) {
        //should send you to the register page???????
        // also do not!! click too many times because what i think happens is you create a new instance each time
        // and idk how to implement it properly (switch if already exist/create if not)
        // unless im dumb and thats how its working rn
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

}