package ru.itgirl;

import java.util.Scanner;

public class WeekDayConvertor {
    private static Scanner sc = new Scanner(System.in);

    public static String getWeekDay(){
        String enDay = sc.next().toLowerCase();
        String result = null;
        switch (enDay){
            case "monday" -> result = "Понедельник";
            case "tuesday" -> result = "Вторник";
            case "wednesday" -> result = "Среда";
            case "thursday" -> result = "Четверг";
            case "friday" -> result = "Пятница";
            case "saturday" -> result = "Суббота";
            case "sunday" -> result = "Воскресенье";
        }
        return result;
    }

    public static void printDay(String dayName){
        System.out.println(dayName);
    }
}
