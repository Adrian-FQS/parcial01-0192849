import java.util.Scanner;

public class Ejercicio1 {
   public static void main(String[] args) {
     
    //matriz
       import java.util.Scanner;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalHoras = 10;
        int[] paquetes = new int[totalHoras];


        System.out.println(" REGISTRO DE PAQUETES PROCESADOS ");

        
        for (int i = 0; i < totalHoras; i++) {
            while (true) {
                System.out.print("Ingrese la cantidad de paquetes para la Hora " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    int val = scanner.nextInt();
                    if (val >= 0) {
                        paquetes[i] = val;
                        break;
                    } else {
                        System.out.println(" La cantidad no puede ser negativa. Intente de nuevo.");
                    }
                } else {
                    System.out.println(" Debe ingresar un número entero válido.");
                    scanner.next(); 
                }
            }
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

        /
        System.out.println("\n=");
        System.out.println("RESUMEN Y ESTADÍSTICAS");
        System.out.println("");
        System.out.println("Total de paetees procesados: " + total);
        System.out.printf("Promedio de paquetes por hora: %.2f\n", promedio);
        System.out.println("Hora con menor cantidad procesada: Hora " + horaMenor + " (" + menorCantidad + " paquetes)");
        System.out.println("Horas con producción inferior al promedio: " + horasBajoPromedio);
        System.out.println("Racha más larga de horas bajo el promedio: " + rachaMaxima + " hora(s) consecutiva(s)");

        
        System.out.println("LISTADO DE PRODUCCIÓN POR HORA");
        
        for (int i = 0; i < totalHoras; i++) {
            System.out.printf("Hora %-5d %-10d\n", (i + 1), paquetes[i]);
        

        scanner.close();
    }
}
    

