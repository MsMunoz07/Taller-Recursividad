package Recursividad;

import java.util.Scanner;

public class Ejercicio14Ackermann {

    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite m: ");
        int m = sc.nextInt();
        System.out.print("Digite n: ");
        int n = sc.nextInt();

        System.out.println("Ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
    }
}