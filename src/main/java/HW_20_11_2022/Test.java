package HW_20_11_2022;

import java.util.Scanner;

public class Test {

    public static double getResult(double x) {
        return x * 10;
    }

    static float geld(float money) {
        return money % 7685;
    }

    static void multiply(int num1, int num2) {
        int pro = num1 * num2;
        System.out.println(pro);
    }

    public static void res(int a, int b, int c) {
        System.out.println(a + b - c);
    }

    static void min(int pr, int rp) {
        System.out.println(pr - rp);
    }

    static double last(double s, double d, double f) {
        return s * d / f;
    }

    static int getMultiple(int g) {
        return  g * 15;
    }

    static int get1(int v, int w, int n){
        return v+w+n;
    }

    public static void main(String[] args) {
/*        System.out.println(last(15,3,5));
        res(10,5,3);
        multiply(3,5);
        min(20,19);
        last(15,3,5);
 */
//        for (int i = 0; i < 10; i++)
//        {
//            int starCount = 10 - i;
//            for (int j = 0; j < starCount; j++)
//                System.out.print("*");
//            System.out.println();
//        }

        char a = 8;

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j=i++)
                System.out.print('a');

        }
        System.out.println();

        Scanner sc = new Scanner(System.in);


        System.out.println(getMultiple(sc.nextInt()));
    }


}

