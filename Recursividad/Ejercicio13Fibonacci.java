package Recursividad;

import java.util.Scanner;

public class Ejercicio13Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el limite de la serie: ");
        int limite = sc.nextInt();

        System.out.println("Serie de Fibonacci hasta " + limite + ":");
        for (int i = 0; i <= limite; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}
