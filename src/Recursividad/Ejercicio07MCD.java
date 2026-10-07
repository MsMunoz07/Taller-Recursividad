package Recursividad;

import java.util.Scanner;

public class Ejercicio07MCD {

    public static int mcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return mcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el primer numero (M): ");
        int m = sc.nextInt();
        System.out.print("Digite el segundo numero (N): ");
        int n = sc.nextInt();

        System.out.println("El MCD de " + m + " y " + n + " es: " + mcd(Math.abs(m), Math.abs(n)));
    }
}