package Homework.Task_1;

import java.util.Scanner;

public class case_1_6 {
    public static void main(String args[]) {
        System.out.println("Enter the amount: ");// Ввводим числа
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] number = new int[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            number[i] = s.nextInt();
        }

        System.out.print(" Четные: ");
        for (int a = 0; a < size; a++) //четные
            if (number[a] % 2 == 0)
                System.out.print(" " + number[a]);
        System.out.print(" Нечетные: ");
        for (int a = 0; a < size; a++) //четные
            if (number[a] % 2 != 0)
                System.out.print(" " + number[a]);
        int max = number[0]; //максимальное число
        for (int a = 0; a < size; a++)
            if (max < number[a])
                max = number[a];
        System.out.println("max = " + max);
        int min = number[0]; //минимальное число
        for (int a = 0; a < size; a++)
            if (min > number[a])
                min = number[a];
        System.out.println("min = " + min);

        for (int a = 0; a < size; a++) //. Числа, которые делятся на 3 или на 9.
            if ((number[a] % 3 == 0) || (number[a] % 9 == 0))
                System.out.println("Can be divided by 3 or 9 = " + number[a]);
        for (int a = 0; a < size; a++) //. Числа, которые делятся на 5 и на 7.
            if ((number[a] % 5 == 0) & (number[a] % 7 == 0))
                System.out.println("Can be divided by 5 and 7 = " + number[a]);
        int a = 0, b = 0, c = 0;
        for (int d = 0; d < size; d++) {// трехзначное где нет повторяющихся номеров
            if ((number[d] > 99) && (number[d] < 1000)) {
                a = number[d] / 10 / 10;
                b = number[d] / 10 % 10;
                c = number[d] % 100 % 10;
                if (a != b && a != c && b != a && b != c && c != a && c != b) {
                    System.out.println("Unique  numbers with 3 symbols -not crossed" + number[d]);
                }
            }
        }
    }
}