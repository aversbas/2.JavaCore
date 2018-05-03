package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        int count = 0;
        String d = ",";

        while (fileInputStream.available() > 0){

        char ch = (char) fileInputStream.read();
        if (ch == ',')
            count++;}

            fileInputStream.close();
        System.out.println(count);
    }
}
