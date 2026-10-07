package Recursividad;

import java.util.Scanner;

public class Ejercicio10MultiplicacionSumas {

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b < 0) {
            return -multiplicar(a, -b);
        }
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Digite el segundo numero: ");
        int b = sc.nextInt();

        System.out.println(a + " x " + b + " = " + multiplicar(a, b));
    }
}