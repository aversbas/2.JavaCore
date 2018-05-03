package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        int MAGIC_SIZE = 1000;
while (true) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String filename = bufferedReader.readLine();
    FileInputStream f = new FileInputStream(filename);
    int size = f.available();
    f.close();
    bufferedReader.close();

    if (size < MAGIC_SIZE)
        throw new DownloadException();
}



    }

    public static class DownloadException extends Exception {

    }
}
