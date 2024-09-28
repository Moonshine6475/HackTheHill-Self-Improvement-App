package com.example.thehealthapp;

import java.util.ArrayList;
import java.util.Random;

public class lootBoxs {
    static String[] id = new String[100];
    //
    //add
    //


    public static int pull(){
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static String lookUp(int n){
        return id[n];
    }


}
