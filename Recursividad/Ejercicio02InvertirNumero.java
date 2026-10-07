package Recursividad;

import java.util.Scanner;

public class Ejercicio02InvertirNumero {

    public static int invertir(int n, int resultado) {
        if (n == 0) {
            return resultado;
        }
        return invertir(n / 10, resultado * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Numero invertido: -" + invertir(-n, 0));
        } else {
            System.out.println("Numero invertido: " + invertir(n, 0));
        }
    }
}
