package Lesson_01;

public class VariableLearning {
    public static void main(String[] args) {
        int myNum;
        myNum = 18;

        System.out.println("My Variable: " + myNum);

        int a = 1;
        int b = 2;

        int sum = a + b;

        //Pre-fix, post-fix
        int c = ++a + b++;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        boolean check = false;

        float fNum = 3.0f;
        double dNum = 3.0;

        System.out.printf("My Variable: %d %f", myNum, fNum);

        boolean isTrue = a > b;

        int d = 4 / 2;
        int e = 4 % 2;

        //If else
        if (isTrue) {
            System.out.printf("Option 1");
        } else {
            System.out.printf("Option 2");
        }
    }
}
