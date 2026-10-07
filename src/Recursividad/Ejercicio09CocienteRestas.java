package Recursividad;

import java.util.Scanner;

public class Ejercicio09CocienteRestas {

    public static int cociente(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        }
        return 1 + cociente(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el dividendo: ");
        int a = sc.nextInt();
        System.out.print("Digite el divisor: ");
        int b = sc.nextInt();

        if (a < 0 || b <= 0) {
            System.out.println("Digite un dividendo positivo y un divisor mayor que 0");
        } else {
            System.out.println("El cociente de " + a + " / " + b + " es: " + cociente(a, b));
        }
    }
}