package org.example;

public class Main {
    public static void main(String[] args) {
        minuteToSecond(5);
        minuteToSecond(3);
        minuteToSecond(2);
    }


    public static void minuteToSecond(int minute){
        System.out.println(minute+" minute is "+minute*60+" seconds");
    }
}