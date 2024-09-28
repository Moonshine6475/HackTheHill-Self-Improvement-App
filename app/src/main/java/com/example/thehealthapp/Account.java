package com.example.thehealthapp;

import com.example.thehealthapp.tasks.Task;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import static com.example.thehealthapp.Constant.category.HEALTH;


public class Account {
//    String firstName;
//    String lastName;
    String email;
    String password;

    String focusedImprovemnet;

    double wakeUp;
    double sleep;

    ArrayList<Double> timeOfWork = new ArrayList<Double>();

    int point;
    int coins;

    String[] itemId = new String[100];

    Character user = new Character();

    Account(){
        //All ready a account
    }
    Account(String e, String p){
        email = e;
        password = p;
        //New account
    }
    Account(String e, String p, int[] stat){
        email = e;
        password = p;
        user.states = stat;
    }

    public void gainStat(Task task){
        switch (task.getType()){
            case HEALTH:
                user.states[0]++;
                break;
            case INT:
                user.states[1]++;
                break;
            case FIT:
                user.states[2]++;
                break;
            case WORK:
                user.states[3]++;
                break;
            case EVENT:
                user.states[4]++;
                break;
            default:
                break;
        }
    }



    public void pullALootBox() {
        int a = lootBoxs.pull();
        if (itemId[a] != null) {
            itemId[a] = lootBoxs.lookUp(a);
        }
        else{
            point+=100;
        }
    }




    public void read(){
        try {
            File file = new File("data");
            if(file.createNewFile()){
                return;
            }else {
                BufferedReader read = new BufferedReader(new FileReader(file));
                String tmp = read.readLine();

//                firstName = tmp.substring(0,tmp.indexOf(":"));
//                tmp.substring(tmp.indexOf(":"));
//                lastName = tmp.substring(0,tmp.indexOf(":"));
//                tmp.substring(tmp.indexOf(":"));
                email = tmp.substring(0,tmp.indexOf(":"));
                tmp.substring(tmp.indexOf(":"));
                password = tmp.substring(0,tmp.indexOf(":"));
                tmp.substring(tmp.indexOf(":"));
                user.readString(tmp);
            }
        } catch (IOException e){

        }
    }
    public void write() throws IOException {
        File file = new File("data");
        BufferedWriter write = new BufferedWriter(new FileWriter(file));
        String tmp = email + ":" + password + ":" + user.writeString();
        write.write(tmp);
    }
}

class Character {
    /*
     * Health, Int, Fit, Work, Event
     * */
    int[] states = {0, 0, 0, 0, 0};
    String png;

    Character() {

    }

    Character(int[] x) {
        System.arraycopy(x, 0, states, 0, 5);
    }

    public void readString(String x){
        for(int i=0; i<5; i++){
            states[i] = Integer.parseInt(x.substring(0,x.indexOf(":")));
            x = x.substring(x.indexOf(":"));
        }
    }

    public String writeString(){
        StringBuilder tmp = new StringBuilder();
        for(int i=0; i<5; i++){
            tmp.append(":").append(states[i]);
        }
        return tmp.toString();
    }

    public boolean fight() {
        Random rand = new Random();
        int hp = 200;
        int dam = 5;
        int attPerSec = 1;
        int crit = 0;
        int reg = 0;

        int Php = states[0] * 10;
        int Pcrit = states[1];
        int Pdam = states[2] * 2;
        int PattPerSec = Math.max(states[3] / 20, 1);
        int Preg = states[4] / 2;


        while (Php != 0 && hp != 0) {
            if (rand.nextInt(100) + 1 >= 100 - Pcrit) {
                hp -= Pdam * PattPerSec * (2);
            } else {
                hp -= Pdam * PattPerSec;
            }
            if (hp == 0) {
                return true;
            }
            if (rand.nextInt(100) + 1 >= 100 - crit) {
                Php -= dam * attPerSec * (2);
            } else {
                Php -= dam * attPerSec;
            }
            if (Php == 0) {
                return false;
            }

            Php += Preg;
            hp += reg;
        }
        System.out.println("ERROR");
        return false;
    }
}

