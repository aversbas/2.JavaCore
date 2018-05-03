package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileOutputStream f1 = new FileOutputStream(fileName1);
        FileInputStream f2 = new FileInputStream(fileName2);
        FileInputStream f3 = new FileInputStream(fileName3);


            byte[] buffer = new byte[f2.available()];

        f2.read(buffer, 0, buffer.length);
        // записываем из буфера в файл
        f1.write(buffer, 0, buffer.length);

            byte[] buffer1 = new byte[f3.available()];

        f3.read(buffer1, 0, buffer1.length);
        // записываем из буфера в файл
        f1.write(buffer1, 0, buffer1.length);


        f1.close();
        f2.close();
        f3.close();

    }
}
