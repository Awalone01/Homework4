package ru.skypro;

public class Main {
    public static void main(String[] args) {
        // задача 1, 2
        int clientOS = 0;
        int clientDeviceYear = 2011;

        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 0) {
                if (clientDeviceYear <= 2015)
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
            //задача 3
            int year = 443;

            if (year % 4 == 0) {
                System.out.println(year + " год является високосным");
                } else if (year % 400 == 0) {
                    System.out.println(year + " год является високосным");
                } else if (year % 100 == 0) {
                    System.out.println(year + " год не является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }

            //задача 4
            int deliveryDistance = 50;
            int numberOfDayOne = 1;
            int numberOfDayTwo = 2;
            int numberOfDayThree = 3;

            if (deliveryDistance < 20) {
                System.out.println("Потребуется дней: " + numberOfDayOne);
            } if (deliveryDistance >= 20 && deliveryDistance <= 60) {
                numberOfDayOne += 1;
                System.out.println("Потребуется дней: " + numberOfDayOne);
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                numberOfDayOne += 1;
                System.out.println("Потребуется дней: " + ++numberOfDayOne);
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