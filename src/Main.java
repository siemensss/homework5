public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
        task5();
    }
    public static void task1_2 (){
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }
    public static void task3 (){
        System.out.println("Задача 3");
        int year = 2000;
        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0) {
                    System.out.println("Год високосный");
                }else {
                    System.out.println("Год невисокосный");
                }
            } else {
                System.out.println("Год високосный");
            }
        } else {
            System.out.println("Год невисокосный");
        }
    }
    public static void task4 (){
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <=100){
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 (){
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого не бывает");
        }
    }

}