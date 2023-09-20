package Lesson_2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] arr1;

/**
 * Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
  */
        System.out.println("Задача 1");
        arr1 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i:arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i:arr1) {
            if (i == 0){
                i = 1;
            } else i = 0;
            System.out.print(i + " ");
        }

        System.out.println();
/**
*Задать пустой целочисленный массив размером 8.
* С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
*/
        System.out.println("Задача 2");
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
/**
 * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
 * пройти по нему циклом, и числа меньшие 6 умножить на 2;
  */
        System.out.println("Задача 3");
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr3) {
            if (i < 6) i = i * 2;
            System.out.print(i + " ");
        }
        System.out.println();
/**
 * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
  */
        System.out.println("Задача 4");
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++){
            for (int j = 0; j<arr4.length; j++){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr4.length; i++){
            arr4[i][arr4.length - i - 1] = 1;
            for (int j = 0; j<arr4.length; j++){
                if (i == j) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
/**
 *Задать одномерный массив и найти в нем минимальный и максимальный элементы
 *(без помощи интернета);
  */
        System.out.println("Задача 5");
        int[] arr5 = new int[] {2, 5, -8, 4, 10, 8, -85, 59};
        int min = 0, max = 0, k=0;
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
            if(arr5[i] < 0) min = arr5[i];
            if (max < arr5[i]) max = arr5[i];
        }
        System.out.println("\nMin: " + min + "\nMax: " + max);
        System.out.println();
/**
 *Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и
 * правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
 * эти символы в массив не входят.
 */
        System.out.println("Задача 6");
        int arr6[] = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        int Left = 0, Right = 0;
        boolean equals;
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i] + " ");
        }
        System.out.println();
//        int k1 = 1;
//        for (int i : arr6) {
//            Left += i;
//            Right =Right + arr6[arr6.length - k1];
//            k1++;
//            System.out.println(Left + ";" + Right);
//
//            if(Left == Right){
//                equals = true;
//                System.out.println(equals);
//                System.out.println(Left + " "+ Right);
//            }
//        }
        double sum = 0;
        for (int i : arr6) {
            sum += i;
            if (sum % 2 == 0 ) {
                System.out.println(sum + "true");
            }
        }
        System.out.println();
/**
 * Написать метод, которому на вход подается одномерный массив и число n
 * (может быть положительным, или отрицательным), при этом метод должен
 * сместить все элементы массива на n позиций. Элементы смещаются циклично.
 * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
 * [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
 * При каком n в какую сторону сдвиг можете выбирать сами.
  */
        System.out.println("Задание 7");

        int[] arr7 = new int[9];
        Random r = new Random();
        int  n = r.nextInt(3)-2;
        System.out.printf("Смещение на %d позиций\n", n);
        for (int i:arr7) {
            i = r.nextInt(7);
            System.out.print(i + " ");
        }

    }

}
