package com.example.thehealthapp.tasks;

import android.widget.TextView;

import org.w3c.dom.Text;

public class Task {
    String taskName;
    String description;
    String dif;
    String cat;
    
    enum category{
        HEALTH,
        INT,
        FIT,
        WORK,
        EVENT
    }

    enum diff{
        HARD,
        MID,
        EASY
    }

    public Task(){
        //popup
    }

    public void onSubmitClick(){
        TextView e = new TextView();
        taskName = e.getText().toString();
        e = new TextView();
        description = e.getText().toString();
        //dropdown stuff
        //close popup
    }
    
}
