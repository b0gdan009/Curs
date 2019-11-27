package src.Heros.src.exeption;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner reder = new Scanner(System.in);
        System.out.print("a=");
        int a = reder.nextInt();
        System.out.println("b=");
        int b = reder.nextInt();
        try {
            divide(a, b);
        } catch (Exception e) {
            System.out.println("mne");
        }
    }

    private static void divide(int a, int b)  throws Exception {
        if (b == 0) {
            throw new InvalidParamterExeption();
        }
        int c = a / b;
        System.out.println(a + "/" + b + "=" + c);
    }
}

