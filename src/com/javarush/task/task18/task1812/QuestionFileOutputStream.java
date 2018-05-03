package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    AmigoOutputStream c;

    public QuestionFileOutputStream(AmigoOutputStream c) {
        this.c = c;
    }

    @Override
    public void flush() throws IOException {
        c.flush();
    }

    @Override
    public void write(int b) throws IOException {
        c.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        c.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        c.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if (s.equals("Д")){
            c.close();
        }
    }
}


