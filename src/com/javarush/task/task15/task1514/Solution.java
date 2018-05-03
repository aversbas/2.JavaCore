package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static
    {
        labels.put(1.3, "uvg");
        labels.put(1.2, "kjh");
        labels.put(1.4, "wer");
        labels.put(1.5, "po");
        labels.put(1.6, "lm");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
