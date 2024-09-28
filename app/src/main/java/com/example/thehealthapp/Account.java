package com.example.thehealthapp;

import java.util.ArrayList;
import java.util.Date;

import kotlinx.coroutines.scheduling.Task;

public class Account {
    String fristName;
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
        fristName = f;
        lastName = l;
        email = e;
        password = p;
    }

    public void gainStat(){

    }
}

class Character{
    short[] states = new short[5];//todo png

    String png;
}

