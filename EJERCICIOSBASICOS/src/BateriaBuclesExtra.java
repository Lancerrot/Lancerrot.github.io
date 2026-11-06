import java.util.Scanner;

public class BateriaBuclesExtra {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        // Ejercicio1();
        // Ejercicio2();
        // Ejercicio3();
        Ejercicio4();

        teclado.close();

    }

    /*
     * Captura por teclado un número y queremos que nos pregunte la tabla de
     * multiplicar de dicho número.
     * Nosotros responderemos y el programa indicara si es correcto o no, lo que
     * hemos escrito
     */

    public static void Ejercicio3() {

        int fallo = 0;
        int resultado = 0;

        int numero = teclado.nextInt();
        teclado.nextLine();

        System.out.println("=====================================");
        System.out.println("La tabla de multiplicar de " + numero);
        System.out.println("=====================================");

        for (int i = 1; i <= 10; i++) {

            int multiplar = i;

            System.out.println("Cual es el resultado de multiplar" + numero + " x " + i);

            // El usuario mete el valor que cree que da la multiplicación

            int valor = teclado.nextInt();
            teclado.nextLine();

            resultado = numero * multiplar;

            // Vemos si el resultado es verdadero

            if (resultado == valor) {

                System.out.println("Correcto");

                if (i == 10 && fallo == 0) {

                    System.out.println("Buen trabajo");

                }

            } else {

                System.out.println("incorrecto");
                fallo++;
                i--;
            }

            if (fallo == 5) {
                System.out.println("Has cometido demasiados fallos, volver empezar");
                i = 1;
            } else if (fallo > 0 && i == 10) {

                System.out.println("Has tenido " + fallo + " fallos. Sigue mejorando");

            }
        }
    }

    /*
     * Escribe un programa que pida el límite inferior y superior de un intervalo.
     * Si el límite inferior es mayor que el superior lo tiene que volver a pedir. A
     * continuación, se van introduciendo números hasta que introduzcamos el 0.
     * Cuando termine el programa dará las siguientes informaciones:
     * • La suma de los números que están dentro del intervalo (intervalo abierto).
     * • Cuántos números están fuera del intervalo.
     * • Que informe de si hemos introducido algún número igual a los límites del
     * intervalo.
     */

    public static void Ejercicio4() {

        // Declaramos variables que vamos a utilizar

        int suma_intervarlos = 0;

        int fuera_del_intervalo = 0;

        int igual = 0;

        int numero = 1;

        boolean es_menor = false;

        // Comprobamos si es menor y en caso de que no lo sea lo vuelve a preguntar

        while (es_menor != true) {

            System.out.println("Dime el limite inferior");

            int inferior = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Dime el limite superior");

            int superior = teclado.nextInt();
            teclado.nextLine();

            // Si es menor empezamos a solicitar número y verificamos si esta dentro del
            // rango o no.

            if (inferior < superior) {

                while (numero != 0) {

                    System.out.println(" Introduce un número ");

                    numero = teclado.nextInt();
                    teclado.nextLine();

                    if (numero > inferior && numero < superior) {

                        suma_intervarlos = suma_intervarlos + numero;

                    } else if (numero == inferior || numero == superior) {

                        igual++;
                        fuera_del_intervalo++;

                    } else {

                        fuera_del_intervalo++;

                    }

                }

                es_menor = true;
            }

        }

        // Imprimimos por pantalla el resultado

        System.out.println("La suma de los número dentro del intervalo es de " + suma_intervarlos);

        // el -1 es para que no tenga en cuenta cuando se pulsa 0.

        System.out.println("La cantidad de número introducidos fuera del rango fueron: " + (fuera_del_intervalo - 1));

        // Si ha coincido que algún número introducido a sido igual que lo limite los mostramos

        if (igual > 0) {

            System.out.println("Ha introducido un número igual a los límites del intervalo ");
        }
    }
}