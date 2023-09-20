package Lesson_3;

import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println();
            System.out.println("1 - Game 1");
            System.out.println("2 - Game 2");
            System.out.println("3 - Game 3");
            System.out.println("0 - Exit");
            System.out.print("Выберите игру: ");

            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();

                switch (n) {
                    case 1:
                        game1();
                        break;
                    case 2:
                        game2();
                        break;
                    case 3:
                        game3();
                        break;
                    case 0:
                        f = false;
                        break;
                    default:
                        System.out.println("Нет такой игры\nПопробуйте снова");
                }
            } else {
                System.out.println("Вы ввели некорректное число\nПопробуйте снова ");
                scanner.nextLine();
            }

        }
    }

    static boolean isEvan(int n){
        return n % 2 == 0;
    }
    static void game1(){
        System.out.println("Game #1");
        System.out.println("Подсчет суммы нечетных положительных чисел");
        System.out.println("===========================================");
        System.out.println("Введите целые числа (0 - выход): ");

        int sum = 0;
        int counter = 0;
        boolean isNumber = false;
        int num = 0;

        do{
            counter++;
            System.out.print("Введите число: ");
            isNumber = scanner.hasNextInt();
            if (isNumber){
                num = scanner.nextInt();
                scanner.nextLine();
                if(num > 0 && !isEvan(num)){
                    sum += num;
                }
            }else {
                System.out.println("Вы ввели некорректное число\nПопробуйте снова ");
                scanner.nextLine();
            }

        }
        while (!(isNumber && num == 0) );

        System.out.printf("Сумма нечетных положительных чисел: %d;\nКол-во попыток ввода:  %d\n", sum, counter);
        System.out.println("Завершение работы... ");
    }

    static void game2(){
        System.out.println("Game #2");
    }

    static void game3(){
        System.out.println("Game #3");
    }
}
