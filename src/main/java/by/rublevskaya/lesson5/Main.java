package main.java.by.rublevskaya.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("please, choose a task number: ");
        Scanner scan = new Scanner(System.in);
        int task = scan.nextInt();
        switch (task) {
            case 0:
                Task_0.Task_0();
                break;
            case 1:
                Task_1.Task_1();
                break;
            case 2:
                Task_2.Task_2();
                break;
            case 3:
                Task_3.Task_3();
                break;
            default:
                System.out.println("invalid task number");
        }
    }
}