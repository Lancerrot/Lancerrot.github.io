import java.util.Scanner;
import java.util.Random;

public class BateriaBucles {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        pintamenu();

        teclado.close();

    } // Cierre Main

    /*
     * Realiza un programa que muestre por pantalla los 20 primeros números
     * naturales (1, 2, 3... 20).
     */

    public static void EjercicioBubles1() {

        int num = 1;

        while (num <= 20) {

            System.out.println(num);

            num++;

        }

    } // Cierre EjercicioBubles1

    /*
     * Realiza un programa que muestre los números pares comprendidos entre el 1 y
     * el 200. Para ello utiliza un contador y suma de 2 en 2.
     */

    public static void EjercicioBubles2() {

        int num = 0;

        while (num <= 200) {

            if (num % 2 == 0) {

                if (num == 200) {

                    System.out.print(num + ".");

                } else {

                    System.out.print(num + ", ");
                }
            }
            num = num + 2;
        }

    } // Cierre EjercicioBubles2

    /*
     * Realiza un programa que muestre los números pares comprendidos entre el 1 y
     * el 200. Esta vez utiliza un contador sumando de 1 en 1.
     */

    public static void EjercicioBubles3() {

        for (int num = 0; num <= 200; num++) {

            if (num % 2 == 0) {

                if (num == 200) {

                    System.out.print(num + ".");

                } else {

                    System.out.print(num + ", ");
                }
            }
        }

    } // Cierre EjercicioBubles3

    /*
     * Realiza un programa que muestre los números desde el 1 hasta un número N que
     * se introducirá por teclado.
     */

    public static void EjercicioBubles4() {

        int num = 1;

        int limitador = teclado.nextInt();

        while (num <= limitador) {

            System.out.println(num);
            num++;
        }

    } // Cierre EjercicioBubles4

    /*
     * Realiza un programa que lea un número positivo N y calcule y visualice su
     * factorial N!
     * Siendo el factorial:
     * 0! = 1
     * 1! = 1
     * 2! = 2 * 1
     * 3! = 3 * 2* 1
     * N! = N * (N-1) * (N-2)........* 3*2*1
     */

    public static void EjercicioBubles5() {

        long factorial = 5;

        long resultado = 1;

        // Veficamos que el número no es negativo.

        if (factorial > 0) {

            // Calculamos el factorial.

            for (long contador = factorial; contador > 0; contador--) {

                resultado = resultado * contador;

                if (contador == 1) {

                    System.out.println("El factorial de " + factorial + " es igual a " + resultado);

                }

            }

        } else if (factorial == 0) {

            System.out.println("El factorial de " + factorial + " es igual a " + resultado);

        } else {

            System.out.println("Por Favor introduzca un número positivo");

        }

    } // Cierre EjercicioBubles5

    /*
     * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de
     * si ha leído algún número negativo o no.
     */

    public static void EjercicioBubles6() {

        int hayNegativo = 0;

        System.out.println("=================================================== ");

        System.out.println("==                Dime 10 número no nulos.       ==");

        System.out.println("=================================================== ");

        for (int i = 0; i < 10; i++) {

            System.out.println("Dime " + (i + 1) + " número.  ");

            int numero = teclado.nextInt();
            teclado.nextLine();

            if (numero < 0) {

                hayNegativo = hayNegativo + 1;

            }

            if (hayNegativo != 0 && i == 9) {

                System.out.println("Hay algun negativo/s");

            }

        }

    } // Cierre EjercicioBubles6

    /*
     * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
     * indicando cuántos son positivos y cuantos negativos.
     */

    public static void EjercicioBubles7() {

        int hayNegativo = 0;

        int hayPositivo = 0;

        System.out.println("=================================================== ");

        System.out.println("==                Dime 10 número no nulos.       ==");

        System.out.println("=================================================== ");

        for (int i = 0; i < 10; i++) {

            System.out.println("Dime " + (i + 1) + " número.  ");

            int numero = teclado.nextInt();
            teclado.nextLine();

            if (numero < 0) {

                hayNegativo = hayNegativo + 1;

            } else {

                hayPositivo = hayPositivo + 1;

            }

            if (hayNegativo != 0 && i == 9) {

                System.out.println("Hay " + hayNegativo + " negativo/s");

            }

            if (hayPositivo != 0 && i == 9) {

                System.out.println("Hay " + hayPositivo + " positivo/s");

            }

        }

    } // Cierre EjercicioBubles7

    /*
     * Realiza un programa que lea una secuencia de números no nulos hasta que se
     * introduzca un 0, y
     * luego muestre si ha leído algún número negativo, cuantos positivos y cuantos
     * negativos.
     */

    public static void EjercicioBubles8() {

        int hayNegativo = 0;
        int hayPositivo = 0;

        for (boolean i = false; i != true;) {

            int numero = teclado.nextInt();
            teclado.nextLine();

            if (numero < 0) {

                hayNegativo = hayNegativo + 1;

            } else {

                hayPositivo = hayPositivo + 1;

            }

            if (numero == 0) {

                i = true;

                if (hayNegativo != 0) {

                    System.out.println("Hay " + hayNegativo + " negativo/s");

                }

                if (hayPositivo != 0) {

                    System.out.println("Hay " + hayPositivo + " positivo/s");

                }
            }

        }

    } // Cierre EjercicioBubles8

    /*
     * Realiza un programa que calcule y escriba la suma y el producto de los 10
     * primeros números naturales.
     */

    public static void EjercicioBubles9() {

        int suma = 0;
        int producto = 1;

        // Empezamos desde el 1 ya que si empezamos de 0 el producto siempre va dar 0

        for (int i = 1; i <= 10; i++) {

            // Suma de los 10 primero número naturales.

            suma = suma + i;

            System.out.print("La suma del " + i + " número natural es " + suma);

            // Producto de los 10 primero números naturales.

            producto = producto * i;

            System.out.println(" El producto del " + i + " números natural es " + producto);

        }

    } // Cierre EjercicioBubles9

    /*
     * Realiza un programa que lea una secuencia de notas (con valores que van de 0
     * a 10) que
     * termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
     */

    public static void EjercicioBubles10() {

        int haydiez = 0;

        for (boolean i = false; i != true;) {

            int numero = teclado.nextInt();
            teclado.nextLine();

            if (numero == -1) {

                i = true;

                System.out.println(haydiez);

                if (haydiez != 0) {

                    System.out.println("Hubo algún diez");

                } else {

                    System.out.println("No hubo ningun diez");

                }

            }

            if (numero >= 0 && numero <= 10) {

                if (numero == 10) {

                    haydiez = haydiez + 1;

                }

            } else {

                i = true;

            }

        }

    } // Cierre EjercicioBubles10

    /*
     * Realiza un programa que sume independientemente los pares y los impares de
     * los números comprendidos entre 100 y 200, y luego muestra por pantalla ambas
     * sumas.
     */

    public static void EjercicioBubles11() {

        int SumaPar = 0, SumaImpar = 0;

        for (int i = 100; i <= 200; i++) {

            if (i % 2 == 0) {

                SumaPar = SumaPar + i;

            } else {

                SumaImpar = SumaImpar + i;

            }

            if (i == 200) {

                System.out.println("La suma de los números pares es igual " + SumaPar);
                System.out.println("La suma de los números impares es igual " + SumaImpar);
            }
        }

    } // Cierre EjercicioBubles11

    /*
     * Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso
     * del operador de
     * potencia (^), siendo A y B valores introducidos por teclado, y luego muestre
     * el resultado por
     * pantalla.
     */

    public static void EjercicioBubles12() {

        System.out.println("Introduce el valor de A");
        int A = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Introduce el valor de B");
        int B = teclado.nextInt();
        teclado.nextLine();

        int resultado = A;

        if (B != 0) {

            for (int i = 1; i != B; i++) {

                resultado = resultado * A;

                if (i == (B - 1)) {

                    System.out.println(resultado);

                }

            }

        }

    } // Cierre EjercicioBubles12

    /*
     * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
     * ordenador intenta
     * adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez
     * hasta adivinarlo (el
     * usuario deberá indicarle al ordenador si es mayor, menor o igual al número
     * que ha pensado).
     */

    public static void EjercicioBubles13() {

        char V = 0;
        int limite1 = 100;
        int limite2 = 1;
        int pienso = random(limite1, limite2);

        System.out.println("El número que pienso es " + pienso);

        do {

            V = teclado.next().charAt(0);

            if (V == '<') {

                limite1 = pienso;

                pienso = random(limite1, limite2);

                System.out.println("El número que pienso es " + pienso);

            } else if (V == '>') {

                limite2 = pienso;

                pienso = random(limite1, limite2);

                System.out.println("El número que pienso es " + pienso);

            } else {

                System.out.println("El valor introducido es incorrecto");

            }

        } while (V != '=');

        System.out.println("El número adivinado es " + pienso);

    } // Cierre EjercicioBubles13

    /*
     * Realiza un programa que dada una cantidad de Euros que el usuario introduce
     * por teclado
     * (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios
     * para alcanzar dicha
     * cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que
     * indicar el mínimo de
     * billetes posible. Por ejemplo, si el usuario introduce 145 el programa
     * indicará que será necesario
     * 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por
     * ejemplo 29 billetes de
     * 5, que aunque sume 145 € no es el mínimo número de billetes posible).
     */

    public static void EjercicioBubles14() {

        System.out.println("¿Cuántos Euros tienes?");

        int dinero = teclado.nextInt();
        teclado.nextLine();

        int Billete_de_500 = 0, Billete_de_200 = 0, Billete_de_100 = 0, Billete_de_50 = 0, Billete_de_20 = 0,
                Billete_de_10 = 0, Billete_de_5 = 0;

        if (dinero % 5 == 0) {

            while (dinero != 0) {

                if (dinero >= 500) {

                    dinero = dinero - 500;

                    Billete_de_500 = Billete_de_500 + 1;

                } else if (dinero >= 200) {

                    dinero = dinero - 200;

                    Billete_de_200 = Billete_de_200 + 1;

                } else if (dinero >= 100) {

                    dinero = dinero - 100;

                    Billete_de_100 = Billete_de_100 + 1;

                } else if (dinero >= 50) {

                    dinero = dinero - 50;

                    Billete_de_50 = Billete_de_50 + 1;

                } else if (dinero >= 20) {

                    dinero = dinero - 20;

                    Billete_de_20 = Billete_de_20 + 1;

                } else if (dinero >= 10) {

                    dinero = dinero - 10;

                    Billete_de_10 = Billete_de_10 + 1;

                } else if (dinero >= 5) {

                    dinero = dinero - 5;

                    Billete_de_5 = Billete_de_5 + 1;

                }
            }

            // Mostrar billetes de 500

            if (Billete_de_500 > 0 && Billete_de_200 == 0 && Billete_de_100 == 0 && Billete_de_50 == 0
                    && Billete_de_20 == 0 && Billete_de_10 == 0 && Billete_de_5 == 0) {

                System.out.print("Necesitará " + Billete_de_500 + " billetes de 500 Euros");

            } else if (Billete_de_500 > 0) {

                System.out.print("Necesitará " + Billete_de_500 + " billetes de 500 Euros, ");

            }

            // Mostrar billetes de 200

            if (Billete_de_500 == 0 && Billete_de_200 > 0 && Billete_de_100 == 0 && Billete_de_50 == 0
                    && Billete_de_20 == 0 && Billete_de_10 == 0 && Billete_de_5 == 0) {

                System.out.print("Necesitará " + Billete_de_200 + " billetes de 200 Euros");

            } else if (Billete_de_200 > 0) {

                System.out.print(Billete_de_200 + " billetes de 200 Euros, ");
            }

            // Mostrar billetes de 100

            if (Billete_de_500 == 0 && Billete_de_200 == 0 && Billete_de_100 > 0 && Billete_de_50 == 0
                    && Billete_de_20 == 0 && Billete_de_10 == 0 && Billete_de_5 == 0) {

                System.out.print("Necesitará " + Billete_de_100 + " billetes de 100 Euros");

            } else if (Billete_de_100 > 0) {

                System.out.print(Billete_de_100 + " billetes de 100 Euros, ");

            }

            // Mostrar billetes de 50

            if (Billete_de_500 == 0 && Billete_de_200 == 0 && Billete_de_100 == 0 && Billete_de_50 > 0
                    && Billete_de_20 == 0 && Billete_de_10 == 0 && Billete_de_5 == 0) {

                System.out.print("Necesitará " + Billete_de_50 + " billetes de 50 Euros");

            } else if (Billete_de_50 > 0) {

                System.out.print(Billete_de_50 + " billetes de 50 Euros, ");

            }

            // Mostrar billetes de 20

            if (Billete_de_500 == 0 && Billete_de_200 == 0 && Billete_de_100 == 0 && Billete_de_50 == 0
                    && Billete_de_20 > 0 && Billete_de_10 == 0 && Billete_de_5 == 0) {

                System.out.print("Necesitará " + Billete_de_20 + " billetes de 20 Euros");

            } else if (Billete_de_20 > 0) {

                System.out.print(Billete_de_20 + " billetes de 20 Euros, ");

            }

            // Mostrar billetes de 10

            if (Billete_de_500 == 0 && Billete_de_200 == 0 && Billete_de_100 == 0 && Billete_de_50 == 0
                    && Billete_de_20 == 0 && Billete_de_10 > 0 && Billete_de_5 == 0) {

                System.out.print("Necesitará " + Billete_de_10 + " billetes de 10 Euros,");

            } else if (Billete_de_10 > 0) {

                System.out.print(Billete_de_10 + " billetes de 10 Euros, ");
            }

            // Mostrar billetes de 5

            if (Billete_de_500 == 0 && Billete_de_200 == 0 && Billete_de_100 == 0 && Billete_de_50 == 0
                    && Billete_de_20 == 0 && Billete_de_10 == 0 && Billete_de_5 > 0) {

                System.out.print("Necesitará " + Billete_de_5 + " billetes de 5 Euros");

            } else if (Billete_de_5 > 0) {

                System.out.print(Billete_de_5 + " billetes de 5 Euros");

            }

        } else {

            System.out.println("Introduce un valor correcto");

        }

    } // Cierre EjercicioBubles14

    public static void pintamenu() {

        System.out.println("=================================");
        System.out.println("== Batería de ejercicos bucles ==");
        System.out.println("== 1 Ejercicio1-               ==");
        System.out.println("== 2 Ejercicio2-               ==");
        System.out.println("== 3 Ejercicio3-               ==");
        System.out.println("== 4 Ejercicio4-               ==");
        System.out.println("== 5 Ejercicio5-               ==");
        System.out.println("== 6 Ejercicio6-               ==");
        System.out.println("== 7 Ejercicio7-               ==");
        System.out.println("== 8 Ejercicio8-               ==");
        System.out.println("== 9 Ejercicio9-               ==");
        System.out.println("== 10 Ejercicio10-             ==");
        System.out.println("== 11 Ejercicio11-             ==");
        System.out.println("== 12 Ejercicio12-             ==");
        System.out.println("== 13 Ejercicio13-             ==");
        System.out.println("== 14 Ejercicio14-             ==");
        System.out.println("== 0 finalizar                 ==");
        System.out.println("=================================");

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

                EjercicioBubles1();

                break;

            case 2:

                EjercicioBubles2();

                break;

            case 3:

                EjercicioBubles3();

                break;

            case 4:

                EjercicioBubles4();

                break;

            case 5:

                EjercicioBubles5();

                break;

            case 6:

                EjercicioBubles6();

                break;

            case 7:

                EjercicioBubles7();

                break;

            case 8:

                EjercicioBubles8();

                break;

            case 9:

                EjercicioBubles9();

                break;

            case 10:

                EjercicioBubles10();

                break;

            case 11:

                EjercicioBubles11();

                break;

            case 12:

                EjercicioBubles12();

                break;

            case 13:

                EjercicioBubles13();

                break;

            case 14:

                EjercicioBubles14();

                break;

            default:

                System.out.println("Por favor introduzca un valor valido");
                pintamenu();

                break;

        }

    }

    public static int random(int max, int min) {

        Random GeneradorR = new Random();

        int NumeroRandom = GeneradorR.nextInt(max - min + 1) + min;

        return NumeroRandom;

    }
}// Cierre Clase BateriaBucles
