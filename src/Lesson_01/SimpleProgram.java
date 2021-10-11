package Lesson_01;

import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number: ");

        int inputNumber = scanner.nextInt();
        boolean isEven = (inputNumber % 2 == 0);

        if (isEven) {
            System.out.println("Yes, the number input is even");
        } else {
            System.out.println("No, the number input is not even");
        }
    }
}
