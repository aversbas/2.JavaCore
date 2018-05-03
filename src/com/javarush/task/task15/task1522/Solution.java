package com.javarush.task.task15.task1522;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;
        static {
            readKeyFromConsoleAndInitPlanet();
        }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if ("sun".equals(s)){
                thePlanet = (Planet) Sun.getInstance();
            }
            else if ("moon".equals(s)){
                thePlanet = (Planet) Moon.getInstance();
            }
            else if ("earth".equals(s)){
                thePlanet = (Planet) Earth.getInstance();
            }
            else thePlanet = null;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
