package Lesson_01;

import java.util.Scanner;

public class ExerciseWeek01_AnhDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number A: ");
        int A = scanner.nextInt();
        System.out.print("\nPlease input number B: ");
        int B = scanner.nextInt();

        int sum, difference, product, quotient, remainder;

        //1. Sum
        sum = A + B;
        System.out.printf("\nSum: %d", sum);

        //2. Difference
        if (A > B) {
            difference = A - B;
            System.out.printf("\nDifference: %d", difference);
        } else {
            difference = B - A;
            System.out.printf("\nDifference: %d", difference);
        }

        //3. Product
        product = A * B;
        System.out.printf("\nProduct: %d", product);

        //4. Quotient
        if (B != 0) {
            quotient = A / B;
            remainder = A % B;
            System.out.printf("\nQuotient: %d", quotient);
            System.out.printf("\t\tRemainder: %d", remainder);
        } else {
            System.out.printf("\nNumber %d cannot divide with 0 !", A);
        }
    }
}
