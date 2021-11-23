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
        int year = 1000;
        int yearOne = year & 4;
        int yearTwo = year & 400;

        if (yearOne == 0 && yearTwo == 0) {
            System.out.println(year + " год является високосным");
        }  else {
            System.out.println(year + " год не является високосным"); //доработать: не выводит каждый 400ый год согласно условию
        }

        //задача 4
        int deliveryDistance = 101;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        }  else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Мы не доставляем в эту зону");
        }

        //задача 5
        int monthNumber = 1;

        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого времени года ещё не придумали");
        }
    }


    }
