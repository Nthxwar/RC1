package ProyectoRC.Interfaz;

import java.util.Scanner;

public class Valida {
    private static final Scanner sc = new Scanner(System.in);

    public static String leerString(String mensaje) {
        String valor;
        do {
            System.out.print(mensaje + ": ");
            valor = sc.nextLine();

            if (valor == null || valor.trim().isEmpty()) {
                System.out.println("Error. El dato no puede estar vacío.");
            }
        } while (valor == null || valor.trim().isEmpty());

        return valor.trim();
    }

    public static int leerEntero(String mensaje) {
        int valor = 0;
        boolean valido = false;

        do {
            System.out.print(mensaje + ": ");
            if (!sc.hasNextInt()) {
                System.out.println("Ingrese un número entero válido.");
                sc.next();
            } else {
                valor = sc.nextInt();
                sc.nextLine();
                if (valor <= 0) {
                    System.out.println("El número debe ser mayor que cero.");
                } else {
                    valido = true;
                }
            }
        } while (!valido);

        return valor;
    }

    public static double leerDouble(String mensaje) {
        double valor = 0;
        boolean valido = false;

        do {
            System.out.print(mensaje + ": ");
            if (!sc.hasNextDouble()) {
                System.out.println("Ingrese un número válido.");
                sc.next();
            } else {
                valor = sc.nextDouble();
                sc.nextLine();
                if (valor <= 0) {
                    System.out.println("El número debe ser mayor que cero.");
                } else {
                    valido = true;
                }
            }
        } while (!valido);

        return valor;
    }
}
