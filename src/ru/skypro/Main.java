package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // задача 1, 2
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //задача 3
        int year = 3000;
        int year1 = year & 4;
        if (year1 == 0) {
            System.out.println(year + " год является високосным");
        }  else {
            System.out.println(year + " год не является високосным"); //доработать: не выводит каждый 400ый год согласно условию
        }
    }
}