package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
     int intVar = 0 ;
     double doubleVar = 0 ;
     Double DoubleVar = null ;
     boolean booleanVar = false;
     Object ObjectVar = null;
     Exception ExceptionVar = null;
     String StringVar = null;

    public static void main(String[] args) {

        Solution a = new Solution();

        System.out.println(a.intVar);
        System.out.println(a.doubleVar);
        System.out.println(a.DoubleVar);
        System.out.println(a.booleanVar);
        System.out.println(a.ObjectVar);
        System.out.println(a.ExceptionVar);
        System.out.println(a.StringVar);

    }
}
