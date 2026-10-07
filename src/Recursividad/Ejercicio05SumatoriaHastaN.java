package Recursividad;

import java.util.Scanner;

public class Ejercicio05SumatoriaHastaN {

    public static int sumatoria(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumatoria(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n = sc.nextInt();

        System.out.println("La sumatoria de 1 hasta " + n + " es: " + sumatoria(n));
    }
}