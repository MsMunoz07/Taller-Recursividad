package Recursividad;

import java.util.Scanner;

public class Ejercicio01Factorial {

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("No existe el factorial de un numero negativo");
        } else {
            System.out.println("El factorial de " + n + " es " + factorial(n));
        }
    }
}
