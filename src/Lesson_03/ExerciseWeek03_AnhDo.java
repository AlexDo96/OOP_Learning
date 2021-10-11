package Lesson_03;

import java.util.Scanner;

public class ExerciseWeek03_AnhDo {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n------------------------- Exercise week 03 -------------------------\n");
            System.out.println("1/ Minutes calculate");
            System.out.println("2/ Check input password");
            System.out.println("3/ Extract digit from string");
            System.out.println("4/ Check http OR https, domain name, .com OR .net");
            System.out.println("5/ Exit program");
            System.out.println("\n--------------------------------------------------------------------\n");
            System.out.print("Please input your option: ");
            Scanner scanner = new Scanner(System.in);
            int inputOption = scanner.nextInt();
            System.out.println("\n--------------------------------------------------------------------\n");

            switch (inputOption) {
                case 1:
                    //Exercise 1
                    System.out.println("Please input your (x) & (y) with this format (x)hrs and (y) minutes");
                    System.out.print("Please input (x)= ");
                    int hours = scanner.nextInt();
                    System.out.print("Please input (y)= ");
                    int minutes = scanner.nextInt();
                    String inputTimeString = hours + "hrs and " + minutes + " minutes";
                    System.out.print("\nYour input time string: " + inputTimeString);
                    System.out.print("\nTotal: " + minutesCalculator(inputTimeString) + " minutes");
                    break;
                case 2:
                    //Exercise 2
                    checkInputPassword();
                    break;
                case 3:
                    //Exercise 3
                    Scanner scanInputString = new Scanner(System.in);
                    System.out.print("Please input your string: ");
                    String inputString = scanInputString.nextLine();
                    System.out.print("\nYour digits from your input string: " + extractDigitFromString(inputString));
                    break;
                case 4:
                    //Exercise 4
                    Scanner scanInputURL = new Scanner(System.in);
                    System.out.print("Please input your URL: ");
                    String inputURL = scanInputURL.nextLine();
                    checkURL(inputURL);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Wrong option ! Please try again");
            }
        }
    }

    /**
     * Exercie 1: Minutes calculate
     *
     * @param inputTime
     * @return
     */
    public static int minutesCalculator(String inputTime) {
        String digitHours = inputTime.substring(0, inputTime.indexOf("hrs"));
        int hours = Integer.parseInt(digitHours);

        // Loai bo phan thua chi lay dung phan minutes
        String minutesString = inputTime.replaceAll(digitHours + "hrs and ", "");
        // Loai bo tat ca [] nhung cai gi khong thuoc (^) (0-9)
        String digitMinutes = minutesString.replaceAll("[^0-9]", "");
        int minutes = Integer.parseInt(digitMinutes);

        int calculateMinutes = (hours * 60) + minutes;
        return calculateMinutes;
    }

    /**
     * Exercie 2: Check input password
     */
    public static void checkInputPassword() {
        Scanner scanInputPassword = new Scanner(System.in);
        final String CORRECT_PASSWORD = "password123";
        int failCount = 0;
        while (failCount < 3) {
            System.out.print("Please input your password: ");
            String inputPassword = scanInputPassword.nextLine();
            if (inputPassword.equals(CORRECT_PASSWORD)) {
                System.out.println("\nLogin successful :D");
                break;
            } else if (failCount == 2) {
                System.out.println("\nYou have input over 3 times ! Your account has been locked !!!");
            }
            System.out.println("\nWrong password ! Pleas try again\n");
            failCount++;
        }
    }

    /**
     * Exercie 3: Extract digit from string
     *
     * @param inputString
     * @return
     */
    public static String extractDigitFromString(String inputString) {
        String digitString = "";
        char[] stringCharArray = inputString.toCharArray();
        for (char charater : stringCharArray) {
            if (Character.isDigit(charater)) {
                digitString = digitString.concat(String.valueOf(charater));
            }
        }
        return digitString;
    }

    /**
     * Exercie 4: Check http OR https, domain name, .com OR .net
     *
     * @param inputURL
     */
    public static void checkURL(String inputURL) {
        //URL Protocol
        String urlProtocol = inputURL.substring(0, inputURL.indexOf("://"));
        if (urlProtocol.toLowerCase().equals("https")) {
            System.out.println("\nYour URL protocol is: https");
        } else {
            System.out.println("\nYour URL protocol is: http");
        }

        //URL Domain
        String domainString = inputURL.replaceAll(urlProtocol + "://www.", "");
        String domain = domainString.substring(0, domainString.lastIndexOf("."));
        System.out.println("Your URL domain is: " + domain);

        //URL Top Level Domain
        String topLevelDomain = inputURL.replaceAll(urlProtocol + "://www." + domain, "");
        if (topLevelDomain.toLowerCase().equals(".com")) {
            System.out.println("Your URL top level domain is: .com");
        } else if (topLevelDomain.toLowerCase().equals(".net")) {
            System.out.println("Your URL top level domain is: .net");
        } else {
            System.out.println("Your URL top level domain is: " + topLevelDomain);
        }
    }
}
