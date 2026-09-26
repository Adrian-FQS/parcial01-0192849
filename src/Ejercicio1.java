import java.util.Scanner;

//correcion punto1

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalHoras = 10;
        int[] paquetes = new int[totalHoras]; 

        System.out.println("registro de paquetes procesados");

        for (int i = 0; i < totalHoras; i++) {
            System.out.print("Ingrese paquetes para la Hora " + (i + 1) + ": ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Error ingrese un numero entero valido: ");
                scanner.next();
            }
            int val = scanner.nextInt();

            while (val < 0) {
                System.out.print("Error no puede ser negativo intente de nuevo: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Error iungrese un entero valido: ");
                    scanner.next();
                }
                val = scanner.nextInt();
            }

            paquetes[i] = val;
        } 

       
        int total = 0;
        int menorCantidad = paquetes[0];
        int horaMenor = 1;

        for (int i = 0; i < totalHoras; i++) {
            total += paquetes[i];
            if (paquetes[i] < menorCantidad) {
                menorCantidad = paquetes[i];
                horaMenor = i + 1; 
            }
        }

        double promedio = (double) total / totalHoras;

        int horasBajoPromedio = 0;
        int rachaActual = 0;
        int rachaMaxima = 0;

        for (int i = 0; i < totalHoras; i++) {
            if (paquetes[i] < promedio) {
                horasBajoPromedio++;
                rachaActual++;
                if (rachaActual > rachaMaxima) {
                    rachaMaxima = rachaActual;
                }
            } else {
                rachaActual = 0;
            }
        }

        System.out.println("\nresumen y estatdistica");
        System.out.println("Total de paquetes procesados: " + total);
        System.out.printf("Promedio de paquetes por hora: %.2f\n", promedio);
        System.out.println("Hora con menor cantidad procesada: Hora " + horaMenor + " (" + menorCantidad + " paquetes)");
        System.out.println("Horas con producción inferior al promedio: " + horasBajoPromedio);
        System.out.println("Racha mas larga de horas bajo el promedio: " + rachaMaxima + " hora(s) consecutiva(s)");

        System.out.println("\nlistado de producion por hora ");
        for (int i = 0; i < totalHoras; i++) {
            System.out.printf("Hora %-2d: %-5d paquetes\n", (i + 1), paquetes[i]);
        }

        scanner.close();
    }
}