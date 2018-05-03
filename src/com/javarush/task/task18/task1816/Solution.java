package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";
        String alphabetH = alphabetL.toUpperCase();

        FileReader r = new FileReader(args[0]);

        int count = 0;

        while (r.ready()){
            char s = (char) r.read();
            if ((alphabetH.indexOf(s) > -1) || (alphabetL.indexOf(s) > -1))
                count++;
        }
             r.close();
        System.out.println(count);
    }
}
