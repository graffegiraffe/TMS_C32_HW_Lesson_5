package main.java.by.rublevskaya.lesson5;

import java.util.Scanner;

/**
 * 0. Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый
 * элемент на заданное число. Пусть число, на которое будет
 * увеличиваться каждый элемент, задается из консоли.
 */
public class Task_0 {
    public static void Task_0() {

        System.out.print("please enter the value, to which you need to increase each element: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        int[][][] array = new int[2][2][2];

        array[0][0][0] = 1;
        array[0][0][1] = 2;
        array[0][1][1] = 3;
        array[1][1][1] = 4;
        array[1][0][0] = 5;
        array[1][0][1] = 6;


        System.out.println("array:");
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                for (int z = 0; z < array[x][y].length; z++) {
                    System.out.println(array[x][y][z] + " ");
                }
                System.out.println();
            }
        }

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                for (int z = 0; z < array[x][y].length; z++) {
                    array[x][y][z] += value;
                }
            }
        }

        System.out.println("new array:");
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                for (int z = 0; z < array[x][y].length; z++) {
                    System.out.print(array[x][y][z] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
