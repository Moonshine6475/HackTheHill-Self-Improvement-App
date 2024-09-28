package com.example.thehealthapp;

import com.example.thehealthapp.tasks.Task;

import java.util.ArrayList;
import java.util.Date;

import static com.example.thehealthapp.Constant.category.HEALTH;


public class Account {
    String firstName;
    String lastName;
    String email;
    String password;

    String focusedImprovemnet;

    double wakeUp;
    double sleep;

    ArrayList<Double> timeOfWork = new ArrayList<Double>();

    int point;
    int coins;


    Account(String e, String f, String l, String p){
        firstName = f;
        lastName = l;
        email = e;
        password = p;
    }

    public void gainStat(Task task){
        switch (task.getType()){
            case HEALTH:
                break;
            case INT:
                break;
            case FIT:
                break;
            case WORK:
                break;
            case EVENT:
                break;
            default:
                break;
        }
    }
}

class Character{
    short[] states = new short[5];//todo png

    String png;
}

