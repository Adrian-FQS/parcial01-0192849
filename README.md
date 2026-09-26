# Primer Parcial Práctico – Programación I

## Versión B

**Lenguaje:** Java  
**Modalidad:** Individual  
**Duración total:** 60 minutos  
**Valor:** 100 puntos  
**Temas:** arreglos unidimensionales, arreglos bidimensionales, ciclos, condicionales, contadores y acumuladores.

---

## Indicaciones generales

- Desarrolle los dos ejercicios en Java y desde consola.
- Cada ejercicio debe resolverse en un archivo independiente.
- Toda la solución debe estar dentro del método `main`.
- Puede utilizar `Scanner`, arreglos, matrices, ciclos y condicionales.
- No se permite utilizar `ArrayList`, colecciones, `Stream`, métodos de ordenamiento automático ni métodos creados por el estudiante.
- Los datos deben ser solicitados al usuario; no deben quedar escritos directamente en el código.
- Los resultados deben mostrarse de forma clara e identificable.
- Si se presenta un empate, debe reportarse la primera posición encontrada.

---

# Ejercicio 1 – Paquetes procesados por hora

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Un centro de distribución registró la cantidad de paquetes procesados durante **10 horas consecutivas**. Los valores son enteros y deben almacenarse en un arreglo unidimensional.

Construya un programa que:

1. Cree un arreglo de 10 posiciones.
2. Solicite la cantidad de paquetes procesados en cada hora y valide que no sea negativa. Si el dato es inválido, debe solicitarlo nuevamente.
3. Calcule y muestre:
   - El total de paquetes procesados.
   - El promedio de paquetes por hora.
   - El número de la hora con la menor cantidad procesada.
   - Cuántas horas tuvieron una producción inferior al promedio.
   - La racha más larga de horas consecutivas cuya producción fue inferior al promedio.
4. Muestre el listado final con el número de cada hora y su cantidad registrada.

## Aclaraciones

- Las horas se numeran del 1 al 10, aunque las posiciones del arreglo comiencen en 0.
- Una racha es una secuencia de posiciones consecutivas. Por ejemplo, si las horas 5, 6 y 7 están por debajo del promedio, existe una racha de longitud 3.
- Para determinar cuáles valores están por debajo del promedio será necesario recorrer nuevamente el arreglo después de calcularlo.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de los 10 valores | 10 |
| Cálculo correcto del total y del promedio | 10 |
| Identificación de la hora con menor producción | 10 |
| Conteo de horas por debajo del promedio | 8 |
| Cálculo correcto de la racha más larga | 8 |
| Claridad de la salida y organización del código | 4 |

---

# Ejercicio 2 – Registro de ventas de sucursales

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Una empresa tiene **4 sucursales** y desea analizar las unidades vendidas de **5 productos** durante una jornada. La información debe almacenarse en una matriz de 4 filas por 5 columnas:

- Cada fila representa una sucursal.
- Cada columna representa un producto.

Construya un programa que:

1. Cree una matriz de `4 x 5`.
2. Solicite las unidades vendidas de cada producto en cada sucursal y valide que ningún valor sea negativo.
3. Calcule y muestre:
   - El total de unidades vendidas por cada sucursal.
   - El total vendido de cada producto, sumando las cuatro sucursales.
   - La sucursal con la menor cantidad total de ventas.
   - El producto con la mayor cantidad total de unidades vendidas.
   - Cuántos registros de la matriz fueron superiores a 30 unidades.
4. Muestre la matriz completa, organizada por sucursales y productos.

## Aclaraciones

- Las sucursales se numeran del 1 al 4 y los productos del 1 al 5.
- Si dos sucursales tienen el mismo total mínimo, se reporta la primera.
- Si dos productos tienen el mismo total máximo, se reporta el primero.
- No es necesario crear arreglos adicionales para resolver el ejercicio, aunque puede utilizarlos si lo considera conveniente.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de la matriz | 10 |
| Cálculo del total de cada sucursal | 10 |
| Cálculo del total de cada producto | 10 |
| Identificación de la sucursal menor y el producto mayor | 10 |
| Conteo de registros superiores a 30 | 6 |
| Presentación de la matriz y organización del código | 4 |

---

## Entrega y Analisis

# # EJERCIO 1

# Esplicacion del ejercico

El programa le pregunta al usuario cuantos paquetes se procesaron en cada una de las 10 horas de trabajo, y luego con esos datos calcula cosas como el total, el promedio, en que hora se procesaron menos paquetes, y si hubo varias horas seguidas con bajo rendimiento.


# Las mejoras implementada son
 
 Optimize el codigo donde se piden los datos por teclado al usuario dentro del ciclo for,
  porque anterior que tian bucle con break a uno mas simple suando solo while con int y val


# Explicacion del codigo

1. Preparacion y declaracion
Se importan las herramientas necesarias (Scanner), se inicia la clase principal y se crea un arreglo (lista fija) de 10 posiciones para almacenar la producción de cada hora.

2. Captura y validacion de datos
Mediante un ciclo for, el programa solicita al usuario la cantidad de paquetes procesados por cada hora (de la 1 a la 10).

Incluye bucles while de proteccion: si el usuario ingresa texto en lugar de un numero o escribe un valor negativo, el programa muestra un error y pide el dato nuevamente hasta que sea valido.

3. Procesamiento estadistico
Con los datos guardados en el arreglo, el codigo ejecuta el calculo de metricas clave:

Total y promedio: Suma todos los elementos del arreglo y calcula el promedio diario (usando (double) para conservar decimales).

Minimo: Identifica cual fue la hora con menor producción y guarda esa cantidad.

Evaluacion de rendimiento: Cuenta cuantas horas quedaron por debajo del promedio y calcula la racha mas larga de horas consecutivas con bajo rendimiento.

4. Presentación de resultados
Finalmente, imprime en la consola un resumen estadistico limpio (formateando los decimales a 2 dígitos con %.2f) y muestra el listado detallado hora por hora utilizando columnas alineadas con printf. Al terminar, cierra el recurso Scanner.


# Comandos de java mas usado

1. Entrada de datos (Scanner)
 *new Scanner(System.in):   Crea la herramienta para leer lo que el usuario escribe en la consola.

* scanner.hasNextInt():   Valida si lo que el usuario digito es un numero entero antes de leerlo (evita que el programa se rompa por error).

* scanner.nextInt():   Lee y guarda el numero entero ingresado.

* scanner.next():   Limpia la memoria del teclado descartando textos o entradas no validas.

2. Estructuras de control y ciclos
* for (int i = 0; i < totalHoras; i++):   Bucle que repite un proceso un numero exacto de veces (en este caso, 10 veces).

* while (condicion):   Repite un bloque de código mientras no se cumpla la regla de validacion (por ejemplo, mientras la entrada no sea un numero o sea negativa).

* if / else:   Evalua una condicion para decidir que camino tomar en la logica del programa.

3. Manejo de arreglos y tipos
* int[] paquetes = new int[totalHoras];:   Reserva un espacio en memoria para guardar un listado fijo de 10 enteros.

* paquetes[i]:   Accede o guarda informacion en una posicion especifica del arreglo usando su indice.

* (double) (Casteo):   Convierte temporalmente un entero a decimal para que la division del promedio entregue decimales precisos y no un valor redondeado.

4. Salida en consola
* System.out.print() / println():   Muestran mensajes en pantalla (sin o con salto de línea final).

* System.out.printf():   Imprime texto formateado usando comodines como %.2f (para 2 decimales) o %d (para enteros).


# #Ejercico 2

# Explicacion del ejercio

El programa ayuda a una empresa a administrar y analizar las ventas de sus 4 sucursales sobre 5 productos distintos.

Para organizar toda esa información en orden, el programa usa una matriz (tabla de filas y columnas) donde cada fila es una sucursal y cada columna es un producto.

# Explicaicon del codigo

1. Lectura y filtrado: Se crea una matriz de 4x5 para representar sucursales y productos. Con dos ciclos anidados (for) y un do-while se piden las ventas de cada producto en cada sucursal. Se rechazan numeros negativos y se contabiliza automaticamente cuantas entradas son mayores a 30.

2. Calculo por sucursales (filas): Se recorre horizontalmente la matriz sumando cada fila. Se imprime el total e identifica la sucursal con el minimo de ventas y para esto se inicializa la variable con Integer.MAX_VALUE y se actualiza si se encuentra un valor menor.

3. Calculo por productos (columnas): Se invierte el orden de los ciclos (j externo, i interno) para recorrer verticalmente la matriz. Se calcula el total vendido de cada producto y se identifica el maas vendido. Aqui se usa Integer.MIN_VALUE para inicializar y luego se actualiza si se encuentra un valor mayor.

4. Resultados finales: Se muestran los totales, la sucursal con menos ventas, el producto mas vendido y el numero de registros mayores a 30.

5. Impresion de la matriz: Finalmente, se imprime la matriz completa organizada en filas y columnas con tabulaciones (\t) para que se vea como una tabla.

# Comandos de java usados 

* int[][] ventas = new int[4][5];      	Declara e instancia la matriz de 4 filas por 5 columnas.

*	for (int i = 0; i < 4; i++)	  Bucle externo para recorrer las 4 sucursales (filas).

* for (int j = 0; j < 5; j++)	  Bucle interno para recorrer los 5 productos (columnas).

*	do { ... } while (condicion);	  Ciclo hacer-mientras para validar entradas no negativas.

*	ventas[i][j]	   Acceso a una celda de la matriz (Fila i, Columna j).

*	registrosMayores30++	  Contador de valores ingresados mayores a 30 unidades.

*	Integer.MAX_VALUE	    Valor maximo de un entero en Java, usado para buscar el minimo.

*	Integer.MIN_VALUE	    Valor minimo de un entero en Java, usado para buscar el maximo.

*	totalSucursal += ventas[i][j]	    Acumula la suma horizontal (ventas por sucursal).

*	totalProducto += ventas[i][j]	    Acumula la suma vertical (ventas por producto).

*	\t	    Tabulacion para alinear la matriz en formato de tabla.

*	System.out.println();	  Salto de linea para separar las filas al imprimir la matriz.