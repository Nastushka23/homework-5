public class Main {
    public static void main(String[] args){
        //Задача 1
        System.out.println("Задача 1");
        int clientOS;
        clientOS=0;
        if (clientOS==1){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("не верное значение");
        }
        //задача 2
        System.out.println("Задача 2");
        int yearPhone=2015;
        int clientDeviceYear=2015;
        if (clientOS==0 && yearPhone<clientDeviceYear){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clientOS==1 && yearPhone<clientDeviceYear){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS==0 && yearPhone>=clientDeviceYear){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1 && yearPhone>=clientDeviceYear){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("не верное значение");
        }
        //Задача 3
        System.out.println("Задача 3");
        int year=1900;
        boolean leapYear=(year%4==0) && (year%100!=0) || (year%400==0);
        String whatYear=leapYear ? " высокосный ": " не высокосный";
        System.out.println("год является"+whatYear );

        //Задача 4
        System.out.println("Задача 4");
        int deliveryDistance=100;
        if (deliveryDistance<20){
            System.out.println("Один день доставки");
        } else if (deliveryDistance>20 && deliveryDistance<60){
            System.out.println("Потребуется 2 дня доставки");
        } else if (deliveryDistance>=60 && deliveryDistance<100){
            System.out.println("Потребуется 3 дня доставки");
        } else{
            System.out.println("доставки нет");
        }
        //Задача 5
        System.out.println("Задача 5");
        int monthNumber=13;
        switch (monthNumber){
            case 1:
                System.out.println("Январь-зима");
                break;
            case 2:
                System.out.println("Февраль-зима");
                break;
            case 3:
                System.out.println("Март-весна");
                break;
            case 4:
                System.out.println("Апрель-весна");
                break;
            case 5:
                System.out.println("Май-весна");
                break;
            case 6:
                System.out.println("Июнь-лето");
                break;
            case 7:
                System.out.println("Июль-лето");
                break;
            case 8:
                System.out.println("Август-лето");
                break;
            case 9:
                System.out.println("Сентябрь-осень");
                break;
            case 10:
                System.out.println("Октябрь-осень");
                break;
            case 11:
                System.out.println("Ноябрь-осень");
                break;
            case 12:
                System.out.println("Декабрь-зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }












        }





}