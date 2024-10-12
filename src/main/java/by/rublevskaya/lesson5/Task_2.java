package main.java.by.rublevskaya.lesson5;

/**
 *2*. Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0}, {0,1,0,0}, {0,0,0,0}}
 * Второй массив: {{1,2,3}, {1,1,1}, {0,0,0}, {2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */
public class Task_2 {
    public static void Task_2() {
        int[][] array1 = {{1,0,0},{0,1,0,},{0,0,0}};
        int[][] array2 ={{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        System.out.println("array 1:");
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                System.out.printf("%4d", array1[i][j]);
            }
            System.out.println();
        }

        System.out.println("array 2:");
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){
                System.out.printf("%4d", array2[i][j]);
            }
            System.out.println();
        }

        int [][] result = new int[3][3];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        System.out.println("result of matrix multiplication:");
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }
}
