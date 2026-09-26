import java.util.Scanner;

//correpcion punto2

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] ventas = new int[4][5];
        int registrosMayores30 = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                do {
                    System.out.print("Sucursal " + (i + 1) + ", Producto " + (j + 1) + ": ");
                    ventas[i][j] = sc.nextInt();

                    if (ventas[i][j] < 0) {
                        System.out.println(" No se permiten negativos.");
                    }
                } while (ventas[i][j] < 0);

                if (ventas[i][j] > 30) {
                    registrosMayores30++;
                }
            }
        }

         
        int sucursalMenor = 0, menorVentas = Integer.MAX_VALUE;
        int productoMayor = 0, mayorVentas = Integer.MIN_VALUE;

        System.out.println("\n Totales por sucursal1");
        for (int i = 0; i < 4; i++) {
            int totalSucursal = 0;
            for (int j = 0; j < 5; j++) {
                totalSucursal += ventas[i][j];
            }
            System.out.println("Sucursal " + (i + 1) + ": " + totalSucursal);

            if (totalSucursal < menorVentas) {
                menorVentas = totalSucursal;
                sucursalMenor = i;
            }
        }

        System.out.println("\n--- Totales por producto ---");
        for (int j = 0; j < 5; j++) {
            int totalProducto = 0;
            for (int i = 0; i < 4; i++) {
                totalProducto += ventas[i][j];
            }
            System.out.println("Producto " + (j + 1) + ": " + totalProducto);

            if (totalProducto > mayorVentas) {
                mayorVentas = totalProducto;
                productoMayor = j;
            }
        }

        System.out.println("\n resumen final ");
        System.out.println("sucursal con menor ventas: Sucursal " + (sucursalMenor + 1) + " (" + menorVentas + " unidades)");
        System.out.println("producto con mayor ventas: Producto " + (productoMayor + 1) + " (" + mayorVentas + " unidades)");
        System.out.println("registros mayores a 30: " + registrosMayores30);


        System.out.println("\n Matriz de ventas (Sucursales x Productos) ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Suc " + (i + 1) + ":\t");
            for (int j = 0; j < 5; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
