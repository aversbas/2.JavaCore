package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    int N = 4;
    String country = Country.MOLDOVA;
    int getCountOfEggsPerMonth() {return N;}
    String getDescription() {return super.getDescription() +  " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";}
}

