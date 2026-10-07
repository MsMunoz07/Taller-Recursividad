package Recursividad;

import java.util.Scanner;

public class Ejercicio08CopiarCadena {

    public static String copiar(String origen, int i) {
        if (i == origen.length()) {
            return "";
        }
        return origen.charAt(i) + copiar(origen, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite una cadena: ");
        String cadena = sc.nextLine();

        String copia = copiar(cadena, 0);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena copiada: " + copia);
    }
}