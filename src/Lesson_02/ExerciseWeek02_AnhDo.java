package Lesson_02;

import java.util.Scanner;

public class ExerciseWeek02_AnhDo {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n------------------------- Exercise week 02 -------------------------\n");
            System.out.println("1/ Factorial calculate");
            System.out.println("2/ Average of array");
            System.out.println("3/ Find max number of array");
            System.out.println("4/ Sort array by Ascending");
            System.out.println("5/ Check Prime number");
            System.out.println("6/ Exit program");
            System.out.println("\n--------------------------------------------------------------------\n");
            System.out.print("Please input your option: ");
            Scanner scanner = new Scanner(System.in);
            int inputOption = scanner.nextInt();
            System.out.println("\n--------------------------------------------------------------------\n");

            switch (inputOption) {
                case 1:
                    System.out.print("Please input your number: ");
                    int inputNumber = scanner.nextInt();
                    //Exercise 1
                    System.out.println("Factorial of " + inputNumber + " = " + factorialCalculate(inputNumber));
                    break;
                case 2:
                    //Exercise 2
                    int[] arrayExercise2 = inputArray();
                    System.out.println("Average of your array: " + averageArray(arrayExercise2));
                    break;
                case 3:
                    //Exercise 3
                    int[] arrayExercise3 = inputArray();
                    System.out.println("Max number of your array: " + findMax(arrayExercise3));
                    break;
                case 4:
                    //Exercise 4
                    int[] arrayExercise4 = inputArray();
                    sortArrayByAsc(arrayExercise4);
                    System.out.print("Array after sort by Ascending: ");
                    printArray(arrayExercise4);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Please input your check Prime number: ");
                    int inputCheckNumber = scanner.nextInt();
                    //Exercise 5
                    if (isPrimeNumber(inputCheckNumber)) {
                        System.out.printf("Number %d is Prime number\n", inputCheckNumber);
                    } else {
                        System.out.printf("Number %d is not Prime number\n", inputCheckNumber);
                    }
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Wrong option ! Please try again");
            }
        }
    }

    /**
     * Exercie 1: Tinh giai thua
     *
     * @param number
     * @return
     */
    public static long factorialCalculate(int number) {
        long factorial = 1;
        if (number == 0 || number == 1) {
            return factorial;
        } else {
            for (int i = 2; i <= number; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }

    /**
     * Exercie 2: Trung binh cong mot mang cac so nguyen
     *
     * @param inputArray
     * @return
     */
    public static double averageArray(int[] inputArray) {
        double sumArray = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sumArray = sumArray + inputArray[i];
        }
        double average = sumArray / inputArray.length;
        return average;
    }

    /**
     * Exercie 3: Tim so lon nhat cua mot mang cac so nguyen
     *
     * @param inputArray
     * @return
     */
    public static int findMax(int[] inputArray) {
        int max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (max < inputArray[i]) {
                max = inputArray[i];
            }
        }
        return max;
    }

    /**
     * Exercie 4: Sap xep mot mang cac so nguyen theo thu tu tang dan
     *
     * @param inputArray
     */
    public static void sortArrayByAsc(int[] inputArray) {
        int temp;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j]) {
                    temp = inputArray[j];
                    inputArray[j] = inputArray[i];
                    inputArray[i] = temp;
                }
            }
        }
    }

    /**
     * Exercie 5: Kiem tra so nguyen to
     *
     * @param number
     * @return true is Prime number
     * false is not Prime number
     */
    public static boolean isPrimeNumber(int number) {
        // Prime Number is not < 2
        if (number < 2) {
            return false;
        }
        // Prime Number is >= 2 and can only divide by itself
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Input Array
     */
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your array number of elements: ");
        int numberOfElements = scanner.nextInt();
        int[] myArray = new int[numberOfElements];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Input value for your array element number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    /**
     * Print Array function
     *
     * @param inputArray
     */
    public static void printArray(int[] inputArray) {
        System.out.print("[ ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            if (i < inputArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }
}
