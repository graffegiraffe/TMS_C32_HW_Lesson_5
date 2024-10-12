package main.java.by.rublevskaya.lesson5;

/**
 * 3. Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * всех элементов массива.
 */
public class Task_3 {
    public static void Task_3() {

        int[][] array = new int[5][5];
        int sum =0;

         for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]= (int) (Math.random()*100);
                sum+=array[i][j];
                System.out.printf("%4d", array[i][j]);
            }
             System.out.println();
         }

        System.out.println("\nsum of all elements: " + sum);

    }
}
