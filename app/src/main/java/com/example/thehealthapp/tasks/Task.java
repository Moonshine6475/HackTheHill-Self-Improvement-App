package com.example.thehealthapp.tasks;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.thehealthapp.Constant;

import org.w3c.dom.Text;

import static com.example.thehealthapp.Constant.category;

public class Task {
    String taskName;
    String description;

    category type;
    Constant.diff difficulty;

    public void setType(category type){
        this.type = type;
    }
    public void setDifficulty(Constant.diff diff){
        this.difficulty = diff;
    }
    public category getType() {
        return type;
    }
    public Constant.diff getDifficulty() {
        return difficulty;
    }

    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
/**
    public void onSubmitClick(){
        TextView e = new TextView();
        taskName = e.getText().toString();
        e = new TextView();
        description = e.getText().toString();
        //dropdown stuff
        //close popup
    }
    **/
}
