package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream f = new FileInputStream(reader.readLine());

        int min = 0;
        if (f.available()>0)
            min = f.read();
        while (f.available()>0) {
            int value = f.read();
            if (min > value)
                min = value;
        }
        System.out.println(min);
        f.close();
    }
}
