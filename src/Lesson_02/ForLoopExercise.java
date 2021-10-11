package Lesson_02;

import java.util.Scanner;

public class ForLoopExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number: ");
        int inputNumber = scanner.nextInt();

        for (; inputNumber > 0; inputNumber--) {
            for (int i = 0; i < inputNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
