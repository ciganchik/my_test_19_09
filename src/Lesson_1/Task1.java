package Lesson_1;

public class Task1 {
    public static void main(String[] args) {
        int[] year1 = new int[]{100, 400, 500,2000, 2018};

        for (int i = 0;i < year1.length; i++){
//            System.out.println(year1[i]);
            if (year1[i] % 4 == 0){
                if (year1[i] % 100 == 0){
                    if (year1[i] % 400 == 0){
                        System.out.println(year1[i] + ": Год высокосный");
                    }
                }
            } else System.out.println(year1[i] + ": Год не высокосный");
        }
    }
}
