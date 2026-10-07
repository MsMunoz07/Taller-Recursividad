package Recursividad;

import java.util.Scanner;

public class Ejercicio11SumaArreglo {

    public static int sumar(int[] vector, int i) {
        if (i == vector.length) {
            return 0;
        }
        return vector[i] + sumar(vector, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos valores desea ingresar: ");
        int n = sc.nextInt();

        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

        System.out.println("La suma de los elementos es: " + sumar(vector, 0));
    }
}
