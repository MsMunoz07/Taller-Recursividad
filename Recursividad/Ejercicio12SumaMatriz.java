package Recursividad;

import java.util.Scanner;

public class Ejercicio12SumaMatriz {

    public static int sumarMatriz(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) {
            return 0;
        }
        if (columna == matriz[0].length) {
            return sumarMatriz(matriz, fila + 1, 0);
        }
        return matriz[fila][columna] + sumarMatriz(matriz, fila, columna + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Numero de columnas (n): ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("La suma de la matriz es: " + sumarMatriz(matriz, 0, 0));
    }
}