package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    int N = 4;
    String country = Country.RUSSIA;
    int getCountOfEggsPerMonth() {return N;}
    String getDescription() {return super.getDescription() +  " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";}
}

