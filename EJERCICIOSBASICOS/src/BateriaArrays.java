import java.util.Arrays;
import java.util.Scanner;

public class BateriaArrays {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        pintamenu();

        char euroSymbol = Character.toChars(0x20AC)[0];

        System.out.println("El símbolo del Euro es €: " + euroSymbol);

        teclado.close();

    } // Cierre Main

    /*
     * Crea un programa que pida diez números reales por teclado, los almacene en un
     * array, y luego muestre todos sus valores.
     */

    public static void EjercicioArray1() {

        // Creamos un array para guardar los 10 números reales
        double[] numeros = new double[10];

        // Pedimos los números por teclado
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduce un número real " + i + ":");

            numeros[i] = teclado.nextDouble();

        }

        // Mostramos todos los valores del array
        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }

    } // Cierre Ejercicio1

    /*
     * Crea un programa que pida diez números reales por teclado, los almacene en un
     * array, y luego muestre la suma de todos los valores.
     */

    public static void EjercicioArray2() {

        // Creamos un array para guardar los 10 números reales
        int[] numeros = new int[10];

        // Variable para guardar la suma de los números
        int suma = 0;

        // Pedimos los 10 números por teclado
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduce el número " + (i + 1) + ":");

            numeros[i] = teclado.nextInt();

        }

        // Sumamos todos los números del array
        for (int i = 0; i < numeros.length; i++) {

            suma = suma + numeros[i];

        }

        // Mostramos la suma
        System.out.println("La suma de los 10 número reales da: " + suma);

    } // Cierre Ejercicio2

    /*
     * Crea un programa que pida diez números reales por teclado, los almacene en un
     * array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
     * pantalla.
     */

    public static void EjercicioArray3() {

        // Creamos un array para guardar los 10 números reales
        int[] numeros = new int[10];

        // Pedimos los 10 números por teclado
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduce el número " + (i + 1) + ":");

            numeros[i] = teclado.nextInt();

        }

        // Inicializamos el máximo y el mínimo con el primer número
        int maximo = numeros[0];
        int minimo = numeros[0];

        // Recorremos el array para buscar el máximo y el mínimo
        for (int i = 1; i < numeros.length; i++) {

            // Comprobamos si el número es mayor que el máximo actual
            if (numeros[i] > maximo) {

                maximo = numeros[i];

            }

            // Comprobamos si el número es menor que el mínimo actual
            if (numeros[i] < minimo) {

                minimo = numeros[i];

            }
        }

        // Mostramos el máximo y el mínimo
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);

    } // Cierre Ejercicio3

    /*
     * Crea un programa que pida veinte números enteros por teclado, los almacene en
     * un array y luego muestre por separado la suma de todos los valores positivos y
     * negativos.
     */

    public static void EjercicioArray4() {

        // Creamos un array para guardar los 20 números enteros
        int[] numeros = new int[20];

        // Variables para sumar los números positivos y negativos
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        // Pedimos los 20 números por teclado
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduce el número " + (i + 1) + ":");

            numeros[i] = teclado.nextInt();

        }

        // Recorremos el array para sumar los positivos y los negativos
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > 0) {

                // Sumamos los números positivos
                sumaPositivos = sumaPositivos + numeros[i];

            } else if (numeros[i] < 0) {

                // Sumamos los números negativos
                sumaNegativos = sumaNegativos + numeros[i];

            }
        }

        // Mostramos las sumas por separado
        System.out.println("La suma de los números positivos es: " + sumaPositivos);
        System.out.println("La suma de los números negativos es: " + sumaNegativos);

    } // Cierre Ejercicio4

    /*
     * Crea un programa que pida veinte números reales por teclado, los almacene en
     * un array y luego lo recorra para calcular y mostrar la media: (suma de
     * valores) / nº de valores.
     */

    public static void EjercicioArray5() {

        // Creamos un array para guardar los 20 números reales
        double[] numeros = new double[20];

        // Variable para guardar la suma de los números
        double suma = 0;

        // Variable para guardar la media
        double media;

        // Pedimos los 20 números por teclado
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduce el número " + (i + 1) + ":");

            numeros[i] = teclado.nextDouble();

        }

        // Recorremos el array para sumar todos los números
        for (int i = 0; i < numeros.length; i++) {

            suma = suma + numeros[i];

        }

        // Calculamos la media dividiendo la suma entre el número de valores
        media = suma / numeros.length;

        // Mostramos la media por pantalla
        System.out.println("La media de los números es: " + media);

    } // Cierre Ejercicio5

    /*
     * Crea un programa que pida dos valores enteros N y M, luego cree un array de
     * tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.
     */

    public static void EjercicioArray6() {

        // Pedimos los valores N y M por teclado
        System.out.println("Introduce el tamaño del array (N):");

        int N = teclado.nextInt();

        System.out.println("Introduce el valor que quieres guardar (M):");

        int M = teclado.nextInt();

        // Creamos un array de tamaño N
        int[] numeros = new int[N];

        // Guardamos el valor M en todas las posiciones del array
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = M;

        }

        // Mostramos todos los valores del array
        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }

    } // Cierre Ejercicio6

    /*
     * Crea un programa que pida dos valores enteros P y Q, luego cree un array que
     * contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
     */

    public static void EjercicioArray7() {

        // Pedimos los valores P y Q por teclado
        System.out.println("Introduce el valor de P:");

        int P = teclado.nextInt();

        System.out.println("Introduce el valor de Q:");

        int Q = teclado.nextInt();

        // Calculamos el tamaño del array
        int[] numeros = new int[Q - P + 1];

        // Guardamos los valores desde P hasta Q
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = P + i;

        }

        // Mostramos los valores del array
        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }

    } // Cierre Ejercicio7

    /*
     * Crea un programa que cree un array con 100 números reales aleatorios entre
     * 0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real
     * R. Por último, mostrará cuántos valores del array son igual o superiores a R.
     */

    public static void EjercicioArray8() {

        // Creamos un array para guardar 100 números reales
        double[] numeros = new double[100];

        // Variable para contar los números iguales o superiores a R
        int contador = 0;

        // Generamos 100 números aleatorios entre 0.0 y 1.0
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
        }

        // Pedimos un valor real R por teclado
        System.out.println("Introduce un valor real R:");
        double R = teclado.nextDouble();

        // Recorremos el array para contar los números iguales o superiores a R
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] >= R) {

                contador++;

            }

        }

        // Mostramos la cantidad de números encontrados
        System.out.println("Hay " + contador + " números iguales o superiores a " + R);

    } // Cierre Ejercicio8

    /*
     * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
     * valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego
     * pedirá un valor N y mostrará en qué posiciones del array aparece N.
     */

    public static void EjercicioArray9() {

        // Creamos un array para guardar 100 números enteros
        int[] numeros = new int[100];

        // Rellenamos el array con números aleatorios entre 1 y 10
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = 1 + (int) (Math.random() * 10);

        }

        // Pedimos el valor N por teclado
        System.out.println("Introduce un número entre 1 y 10:");

        int N = teclado.nextInt();

        // Recorremos el array para buscar las posiciones donde aparece N
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == N) {

                System.out.println("El número " + N + " aparece en la posición " + i);

            }
        }

    } // Cierre Ejercicio9

    /*
     * Crea un programa para realizar cálculos relacionados con la altura (en
     * metros) de personas. Pedirá un valor N y luego almacenará en un array N
     * alturas introducidas por teclado.
     * Luego mostrará la altura media, máxima y mínima así como cuántas personas
     * miden por encima y por debajo de la media.
     */

    public static void EjercicioArray10() {

        // Pedimos la cantidad de personas
        System.out.println("Introduce el número de personas:");

        int N = teclado.nextInt();

        // Creamos un array para guardar las alturas
        double[] alturas = new double[N];

        // Variables para calcular la suma, la media, el máximo y el mínimo
        double suma = 0;
        double media;
        double maximo;
        double minimo;

        // Variables para contar las personas por encima y por debajo de la media
        int encima = 0;
        int debajo = 0;

        // Pedimos las alturas por teclado
        for (int i = 0; i < alturas.length; i++) {

            System.out.println("Introduce la altura de la persona " + (i + 1) + " en metros:");

            alturas[i] = teclado.nextDouble();

        }

        // Inicializamos el máximo y el mínimo con la primera altura
        maximo = alturas[0];
        minimo = alturas[0];

        // Recorremos el array para calcular la suma, el máximo y el mínimo
        for (int i = 0; i < alturas.length; i++) {

            suma = suma + alturas[i];

            if (alturas[i] > maximo) {

                maximo = alturas[i];

            }

            if (alturas[i] < minimo) {

                minimo = alturas[i];

            }
        }

        // Calculamos la altura media
        media = suma / alturas.length;

        // Contamos las personas que están por encima y por debajo de la media
        for (int i = 0; i < alturas.length; i++) {

            if (alturas[i] > media) {

                encima++;

            } else if (alturas[i] < media) {

                debajo++;

            }
        }

        // Mostramos los resultados
        System.out.println("La altura media es: " + media + " metros");
        System.out.println("La altura máxima es: " + maximo + " metros");
        System.out.println("La altura mínima es: " + minimo + " metros");
        System.out.println("Personas por encima de la media: " + encima);
        System.out.println("Personas por debajo de la media: " + debajo);

    } // Cierre Ejercicio10

    /*
     * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego
     * introducirá en el primer array todos los valores del 1 al 100. Por último,
     * deberá copiar todos los valores del
     * primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
     */

    public static void EjercicioArray11() {

        // Creamos dos arrays de 100 posiciones
        int[] numeros1 = new int[100];
        int[] numeros2 = new int[100];

        // Guardamos los valores del 1 al 100 en el primer array
        for (int i = 0; i < numeros1.length; i++) {

            numeros1[i] = i + 1;

        }

        // Copiamos los valores del primer array al segundo en orden inverso
        for (int i = 0; i < numeros1.length; i++) {

            numeros2[i] = numeros1[99 - i];

        }

        // Mostramos los valores del primer array
        System.out.println("Primer array:");

        for (int i = 0; i < numeros1.length; i++) {

            System.out.println(numeros1[i]);

        }

        // Mostramos los valores del segundo array
        System.out.println("Segundo array en orden inverso:");

        for (int i = 0; i < numeros2.length; i++) {

            System.out.println(numeros2[i]);

        }

    } // Cierre Ejercicio11

    /*
     * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
     * menú con
     * distintas opciones:
     * a. Mostrar valores.
     * b. Introducir valor.
     * c. Salir.
     * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá
     * un valor V y una
     * posición P, luego escribirá V en la posición P del array. El menú se repetirá
     * indefinidamente
     * hasta que el usuario elija la opción ‘c’ que terminará el programa.
     */

    public static void EjercicioArray12() {

        // Creamos un array de 10 enteros
        int[] numeros = new int[10];

        // Variable para guardar la opción elegida
        char opcion;

        // Repetimos el menú hasta que el usuario elija la opción c
        do {
            System.out.println("----- MENÚ -----");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.println("Elige una opción:");

            opcion = teclado.next().charAt(0);

            // Comprobamos la opción elegida
            if (opcion == 'a') {

                // Mostramos todos los valores del array
                for (int i = 0; i < numeros.length; i++) {

                    System.out.println("Posición " + i + ": " + numeros[i]);

                }

            } else if (opcion == 'b') {

                // Pedimos el valor y la posición donde guardarlo
                System.out.println("Introduce el valor V:");

                int V = teclado.nextInt();

                System.out.println("Introduce la posición P (de 0 a 9):");

                int P = teclado.nextInt();

                // Comprobamos que la posición sea válida
                if (P >= 0 && P < numeros.length) {

                    numeros[P] = V;

                    System.out.println("Valor introducido correctamente.");

                } else {

                    System.out.println("Error: la posición debe estar entre 0 y 9.");

                }

            } else if (opcion == 'c') {

                // Terminamos el programa
                System.out.println("Saliendo del programa...");

            } else {

                // Avisamos si la opción no es válida
                System.out.println("Opción no válida.");

            }

        } while (opcion != 'c');

    } // Cierre Ejercicio12

    /*
     * Crea un programa que permita al usuario almacenar una secuencia aritmética en
     * un array y
     * luego mostrarla. Una secuencia aritmética es una serie de números que
     * comienza por un
     * valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2,
     * la secuencia sería
     * 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa
     * solicitará al
     * usuario V, I además de N (nº de valores a crear).
     */

    public static void EjercicioArray13() {

        // Pedimos el valor inicial V, el incremento I y el número de valores N
        System.out.println("Introduce el valor inicial V:");

        int V = teclado.nextInt();

        System.out.println("Introduce el incremento I:");

        int I = teclado.nextInt();

        System.out.println("Introduce el número de valores N:");

        int N = teclado.nextInt();

        // Creamos un array para guardar la secuencia
        int[] numeros = new int[N];

        // Guardamos los valores de la secuencia en el array
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = V + (I * i);

        }

        // Mostramos la secuencia por pantalla
        System.out.println("La secuencia aritmética es:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");

        }

        System.out.println();

    } // Cierre Ejercicio13

    /*
     * Crea un programa que cree un array de enteros e introduzca la siguiente
     * secuencia de
     * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10
     * diez veces, y luego la
     * muestre por pantalla.
     */

    public static void EjercicioArray14() {

        // Creamos un array para guardar la secuencia
        int[] numeros = new int[55];

        // Variable para indicar la posición del array
        int posicion = 0;

        // Introducimos cada número tantas veces como su valor
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {

                numeros[posicion] = i;
                posicion++;

            }
        }

        // Mostramos la secuencia por pantalla
        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");

        }

        System.out.println();

    } // Cierre Ejercicio14

    /*
     * Crea un programa que pida la usuario dos valores N y M y luego cree un array
     * de tamaño N
     * que contenga M en todas sus posiciones. Luego muestra el array por pantalla.
     */

    public static void EjercicioArray15() {

        // Pedimos los valores N y M por teclado
        System.out.println("Introduce el tamaño del array (N):");

        int N = teclado.nextInt();

        System.out.println("Introduce el valor que se guardará en el array (M):");

        int M = teclado.nextInt();

        // Creamos un array de tamaño N
        int[] numeros = new int[N];

        // Guardamos el valor M en todas las posiciones
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = M;

        }

        // Mostramos el array por pantalla
        System.out.println("Contenido del array:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");

        }

        System.out.println();

    } // Cierre Ejercicio15

    /*
     * Crea un programa que cree un array de enteros e introduzca la siguiente
     * secuencia de
     * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10
     * diez veces, y luego la
     * muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().
     */

    public static void EjercicioArray16() {

        // Creamos un array de 55 posiciones
        int[] numeros = new int[55];

        // Variable para indicar la posición del array
        int posicion = 0;

        // Rellenamos el array con cada número usando Arrays.fill()
        for (int i = 1; i <= 10; i++) {

            // Rellenamos tantas posiciones como indique el número i
            Arrays.fill(numeros, posicion, posicion + i, i);

            // Actualizamos la posición para el siguiente número
            posicion = posicion + i;

        }

        // Mostramos el contenido del array
        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");

        }

        System.out.println();

    } // Cierre Ejercicio16

    /*
     * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
     * primeros en un
     * array y los 10 últimos en otro array. Por último, comparará ambos arrays y le
     * dirá al usuario
     * si son iguales o no.
     */

    public static void EjercicioArray17() {

        // Creamos dos arrays de 10 posiciones
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];

        // Pedimos los 10 primeros números
        for (int i = 0; i < numeros1.length; i++) {

            System.out.println("Introduce el número " + (i + 1) + ":");

            numeros1[i] = teclado.nextInt();
        }

        // Pedimos los 10 últimos números
        for (int i = 0; i < numeros2.length; i++) {

            System.out.println("Introduce el número " + (i + 11) + ":");

            numeros2[i] = teclado.nextInt();
        }

        // Variable para comprobar si los arrays son iguales
        boolean iguales = true;

        // Comparamos los valores de ambos arrays
        for (int i = 0; i < numeros1.length; i++) {

            if (numeros1[i] != numeros2[i]) {

                iguales = false;

            }
        }

        // Mostramos si los arrays son iguales o diferentes
        if (iguales) {

            System.out.println("Los dos arrays son iguales.");

        } else {

            System.out.println("Los dos arrays son diferentes.");

        }

    } // Cierre Ejercicio17

    /*
     * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
     * aleatorios entre 0
     * y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los
     * mostrará por
     * pantalla.
     */

    public static void EjercicioArray18() {

        // Creamos un array de 30 enteros
        int[] numeros = new int[30];

        // Rellenamos el array con números aleatorios entre 0 y 9
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * 10);

        }

        // Ordenamos los números de menor a mayor
        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = 0; j < numeros.length - 1 - i; j++) {

                if (numeros[j] > numeros[j + 1]) {

                    // Intercambiamos los números de posición
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;

                }
            }
        }

        // Mostramos el array ordenado
        System.out.println("Array ordenado de menor a mayor:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");

        }

    } // Cierre Ejercicio18

    /*
     * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
     * torneo de
     * ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
     * puntuaciones de todos los
     * jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego
     * muestre las
     * puntuaciones en orden descendente (de la más alta a la más baja).
     */

    public static void EjercicioArray19() {

        // Creamos un array para guardar las puntuaciones de los 8 jugadores
        int[] puntuaciones = new int[8];

        // Pedimos las puntuaciones por teclado
        for (int i = 0; i < puntuaciones.length; i++) {

            System.out.println("Introduce la puntuación del jugador " + (i + 1) + ":");

            puntuaciones[i] = teclado.nextInt();

        }

        // Ordenamos las puntuaciones de mayor a menor
        for (int i = 0; i < puntuaciones.length - 1; i++) {

            for (int j = 0; j < puntuaciones.length - 1 - i; j++) {

                if (puntuaciones[j] < puntuaciones[j + 1]) {

                    // Intercambiamos las puntuaciones de posición
                    int aux = puntuaciones[j];
                    puntuaciones[j] = puntuaciones[j + 1];
                    puntuaciones[j + 1] = aux;

                }
            }
        }

        // Mostramos el ranking de puntuaciones
        System.out.println("Ranking de puntuaciones:");

        for (int i = 0; i < puntuaciones.length; i++) {

            System.out.println((i + 1) + ". " + puntuaciones[i] + " puntos");

        }

    } // Cierre Ejercicio19

    /*
     * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores
     * enteros
     * aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado
     * un valor N y se
     * mostrará por pantalla si N existe en el array, además de cuantas veces.
     */

    public static void EjercicioArray20() {

        // Creamos un array de 1000 posiciones
        int[] numeros = new int[1000];

        // Rellenamos el array con números aleatorios entre 0 y 99
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * 100);

        }

        // Pedimos el número que queremos buscar
        System.out.println("Introduce un número entre 0 y 99:");

        int N = teclado.nextInt();

        // Contamos cuántas veces aparece el número
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == N) {

                contador++;

            }
        }

        // Mostramos el resultado
        if (contador > 0) {

            System.out.println("El número " + N + " existe en el array.");
            System.out.println("Aparece " + contador + " veces.");

        } else {

            System.out.println("El número " + N + " no existe en el array.");

        }

    } // Cierre Ejercicio20

    // ==================================================== Menu de inicio de
    // ejecicios =================================================================
    // //

    public static void pintamenu() {

        System.out.println("==================================");
        System.out.println("== Batería de ejercicos bucles  ==");
        System.out.println("== 1 Ejercicio1                 ==");
        System.out.println("== 2 Ejercicio2                 ==");
        System.out.println("== 3 Ejercicio3                 ==");
        System.out.println("== 4 Ejercicio4                 ==");
        System.out.println("== 5 Ejercicio5                 ==");
        System.out.println("== 6 Ejercicio6                 ==");
        System.out.println("== 7 Ejercicio7                 ==");
        System.out.println("== 8 Ejercicio8                 ==");
        System.out.println("== 9 Ejercicio9                 ==");
        System.out.println("== 10 Ejercicio10               ==");
        System.out.println("== 11 Ejercicio11               ==");
        System.out.println("== 12 Ejercicio12               ==");
        System.out.println("== 13 Ejercicio13               ==");
        System.out.println("== 14 Ejercicio14               ==");
        System.out.println("== 15 Ejercicio15               ==");
        System.out.println("== 16 Ejercicio16               ==");
        System.out.println("== 17 Ejercicio17               ==");
        System.out.println("== 18 Ejercicio18               ==");
        System.out.println("== 19 Ejercicio19               ==");
        System.out.println("== 20 Ejercicio20               ==");
        System.out.println("== 0 finalizar                  ==");
        System.out.println("==================================");

        int ejercicio = teclado.nextInt();
        teclado.nextLine();

        if (ejercicio == 0) {

            System.out.println("Cerrando menu");

        } else {

            ejecutaEjercicio(ejercicio);

        }
    }

    // Ejecutar el ejercicio que toque.

    public static void ejecutaEjercicio(int NumEjer) {

        int aux = NumEjer;

        switch (aux) {
            case 1:

                EjercicioArray1();

                break;

            case 2:

                EjercicioArray2();

                break;

            case 3:

                EjercicioArray3();

                break;

            case 4:

                EjercicioArray4();

                break;

            case 5:

                EjercicioArray5();

                break;

            case 6:

                EjercicioArray6();

                break;

            case 7:

                EjercicioArray7();

                break;

            case 8:

                EjercicioArray8();

                break;

            case 9:

                EjercicioArray9();

                break;

            case 10:

                EjercicioArray10();

                break;

            case 11:

                EjercicioArray11();

                break;

            case 12:

                EjercicioArray12();

                break;

            case 13:

                EjercicioArray13();

                break;

            case 14:

                EjercicioArray14();

                break;

            case 15:

                EjercicioArray15();

                break;

            case 16:

                EjercicioArray16();

                break;

            case 17:

                EjercicioArray17();

                break;

            case 18:

                EjercicioArray18();

                break;

            case 19:

                EjercicioArray19();

                break;

            case 20:

                EjercicioArray20();

                break;

            default:

                System.out.println("Por favor introduzca un valor valido");
                pintamenu();

                break;

        }

    }

}
