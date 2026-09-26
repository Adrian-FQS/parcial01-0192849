import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalHoras = 10;
        int[] paquetes = new int[totalHoras]; 

        System.out.println(" REGISTRO DE PAQUETES PROCESADOS ");

        // Entrada de datos con validación
        for (int i = 0; i < totalHoras; i++) {
            System.out.print("Ingrese paquetes para la Hora " + (i + 1) + ": ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Error: Ingrese un número entero válido: ");
                scanner.next();
            }
            int val = scanner.nextInt();

            while (val < 0) {
                System.out.print("Error: No puede ser negativo. Intente de nuevo: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Error: Ingrese un entero válido: ");
                    scanner.next();
                }
                val = scanner.nextInt();
            }

            paquetes[i] = val;
        } // <--- AQUÍ FALTABA ESTA LLAVE DE CIERRE

        // Cálculos iniciales (Total y Menor producción)
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

        // Cálculos de horas y rachas bajo el promedio
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

        // Impresión de resultados
        System.out.println("\nRESUMEN Y ESTADÍSTICAS");
        System.out.println("Total de paquetes procesados: " + total);
        System.out.printf("Promedio de paquetes por hora: %.2f\n", promedio);
        System.out.println("Hora con menor cantidad procesada: Hora " + horaMenor + " (" + menorCantidad + " paquetes)");
        System.out.println("Horas con producción inferior al promedio: " + horasBajoPromedio);
        System.out.println("Racha más larga de horas bajo el promedio: " + rachaMaxima + " hora(s) consecutiva(s)");

        System.out.println("\nLISTADO DE PRODUCCIÓN POR HORA");
        for (int i = 0; i < totalHoras; i++) {
            System.out.println("Hora " + (i + 1) + ": " + paquetes[i] + " paquetes");
        }

        scanner.close();
    }
}