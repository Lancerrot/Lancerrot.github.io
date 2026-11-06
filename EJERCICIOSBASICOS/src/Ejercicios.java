import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ejercicios {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Ejercicio1();
        // Ejercicio2();
        // Ejercicio3();
        // Ejercicio4();
        // Ejercicio5();
        // Ejercicio6();
        // Ejercicio7();
        // Ejercicio8();
        // Ejercicio9();
        // Ejercicio10();
        // Ejercicio11();
        // Ejercicio12();
        // Ejercicio13();
        // Ejercicio14();
        // Ejercicio15();
        // Ejercicio16();
        // Ejercicio17();
        Ejercicio18();
        teclado.close();

    } // Cierre Main

    /* Escribe un programa que dé los “buenos días”. */

    public static void Ejercicio1() {

        String nombre = teclado.nextLine();
        System.out.println("Hola buenos días " + nombre + ", que tengas una buenas mañana.");

    } // Cierre Ejercicio2

    /* Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5. */

    public static void Ejercicio2() {

        int lado = 5;

        int area = lado * lado;

        System.out.println("El área de un cuadrado de " + lado + " es igual a " + area + " cm");

    }// Cierre Ejercicio3

    /*  Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado. */

    public static void Ejercicio3() {

        System.out.println("Dime cuanto mide el lado del cuadrado" );

        int lado = teclado.nextInt();

        int area = lado * lado;

        System.out.println( "El área de un cuadrado de " + lado + " es igual a " + area + " cm");

    }// Cierre Ejercicio3

    /* Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, producto y división.  */

        public static void Ejercicio4() {

        System.out.println("Cual es el primer número");

        int numero1 = teclado.nextInt();

        System.out.println("Cual es el segundo número");

        int numero2 = teclado.nextInt();

        // Operaciones

        int suma = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual " + suma);

        int resta = numero1 - numero2;

        System.out.println("La resta de " + numero1 + " y " + numero2 + " es igual " + resta);

        int multiplicacion = numero1 * numero2;

        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es igual "+ multiplicacion);

        int división = numero1 / numero2;

        System.out.println("La división de " + numero1 + " y " + numero2 + " es igual "+ división);

        int resto = numero1 % numero2;

        System.out.println("El resto de " + numero1 + " y " + numero2 + " es igual "+ resto);

    }// Cierre Ejercicio4

    /* Escribe un programa que toma como dato de entrada un número que corresponde a la longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el volumen de la esfera que corresponden con dicho radio. */

    public static void Ejercicio5() {

        int longitud = teclado.nextInt();

        //perimetro de la circunferencia

        double perimetro = 2 * Math.PI * longitud;

        System.out.println("El perimetro de la circufencia con radio " + longitud + " es igual a " + perimetro);

        // Area de la circunferencia

        double area = Math.PI * (longitud * longitud);

        System.out.println("El area de la circufencia con radio " + longitud + " es igual a " + area);

        //Volumen de la esfera

        double volumen = 1.33333 * Math.PI * (longitud * longitud * longitud);

        System.out.println("El volumen de la esfera con radio " + longitud + " es igual a " + volumen);

    }// Cierre Ejercicio5

    /* Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el porcentaje de descuento realizado */

    public static void Ejercicio6() {

        System.out.println("Dime el precio de venta original");

        double precio1  = teclado.nextDouble();

        System.out.println("Dime el precio actual");

        double precio2  = teclado.nextDouble();

        double porcentaje1 = precio2 * 100 / precio1;

        double porcentaje2 = 100 - porcentaje1;

        System.out.println("El descuento aplicado sería de " + porcentaje2 + "%");

    }// cierre Ejercicio6

    /* Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros. */

    public static void Ejercicio7() {

        System.out.println("Dime las millas que quieres transformar a metro");

        double distanciaMi = teclado.nextDouble();

        double distanciaMe = distanciaMi * 1.852;

        System.out.println(distanciaMi + " millas equivale a " + distanciaMe + " metros");

    }// Cierre Ejercicio7

    /* Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de edad” solo si lo somos. */

    public static void Ejercicio8() {

        System.out.println("Dime tu edad");

        int Edad1 = teclado.nextInt();

        System.out.println("Dime la edad a comparar");

        int Edad2 = teclado.nextInt();

        if (Edad1 > Edad2) {
            
            System.out.println("Eres mayor de edad");

        }

    }//Cierre Ejercicio8

    /* Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”. */

    public static void Ejercicio9() {

        System.out.println("Dime tu edad");

        int Edad1 = teclado.nextInt();

        System.out.println("Dime la edad a comparar");

        int Edad2 = teclado.nextInt();

        if (Edad1 > Edad2) {
            
            System.out.println("Eres mayor de edad");

        } else {

            System.out.println("Eres menor de edad");
        }

    }// Cierre Ejercicio9

    /* Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta, producto y división. (Ten en cuenta la división por cero). */

    public static void Ejercicio10() {

        System.out.println("Cual es el primer número");

        int numero1 = teclado.nextInt();

        System.out.println("Cual es el segundo número");

        int numero2 = teclado.nextInt();

        // Operaciones

        if ( numero2 == 0) {

            System.out.println("No se puede dividir un número por 0");

        } else {

            int suma = numero1 + numero2;

            System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual " + suma);

            int resta = numero1 - numero2;

            System.out.println("La resta de " + numero1 + " y " + numero2 + " es igual " + resta);

            int multiplicacion = numero1 * numero2;

            System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es igual "+ multiplicacion);

            int división = numero1 / numero2;

            System.out.println("La división de " + numero1 + " y " + numero2 + " es igual "+ división);

            int resto = numero1 % numero2;

            System.out.println("El resto de " + numero1 + " y " + numero2 + " es igual "+ resto);
        }
    }// Cierre Ejercicio10

    /* Escribe un programa que lee 2 números y muestra el mayor.*/

    public static void Ejercicio11() {

        System.out.println("Dame le primero número");

        int numero1 = teclado.nextInt();

        System.out.println("Dame el segundo número");

        int numero2 = teclado.nextInt();

        // Operaciones

        if (numero1 > numero2) {
            
            System.out.println(numero1 + " es el mayor");


        } else {

            System.out.println(numero2 + " es el mayor");

        }

    }// Cierre Ejercicio11

    /* Escribe un programa que lee un número y me dice si es positivo o negativo, consideraremos el cero como positivo. */

    public static void Ejercicio12() {

    int numero = -1;

    if ( numero == 0 ) {

        System.out.println(numero + " es positivo");

    } else if ( numero > 0 ) {

        System.out.println(numero + " es positivo");

    } else {

        System.out.println(numero + " es negativo");
    }

    }// Cierre Ejercicio12

    /* Escribe un programa que lee dos números y los visualiza en orden ascendente */

    public static void Ejercicio13() {

    int numero1 = 9;
    int numero2 = 5;

    if ( numero1 < numero2 ) {

        System.out.println("Los número ordenados de manera ascendente: " + numero1 + ", " + numero2);

    } else {

        System.out.println("Los número ordenados de manera ascendente: " + numero2 + ", " + numero1);
    }

    }// Cierre Ejercicio13

    /* Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales */

    public static void Ejercicio14() {

    int numero1 = 5;
    int numero2 = 9;

        if ( numero1 == numero2) {

            System.out.println(numero1 + " y " + numero2 + " son iguales");
            
        } else if (numero1 > numero2) {
            
            System.out.println(numero1 + " es el mayor");


        } else {

            System.out.println(numero2 + " es el mayor");

        }
    
    }//Cierre Ejercicio14

    /* Escribe un programa que lea tres números distintos y nos diga cuál es el mayor. */

    public static void Ejercicio15() {

    int numero1 = 7;
    int numero2 = 5;
    int numero3 = 9;

        if ( numero1 == numero2 && numero1 == numero3 ) {

            System.out.println(numero1 + ", " + numero2 + " y "+ numero3 + " son iguales");
            
        } else if (numero1 > numero2 && numero1 > numero3) {
            
            System.out.println(numero1 + " es el mayor");


        } else if (numero2 > numero1 && numero2 > numero3) {

            System.out.println(numero2 + " es el mayor");

        } else {

            System.out.println(numero3 + " es el mayor");
        }
    
    }//Cierre Ejercicio15

    /*Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en calificación alfabética, escribiendo el resultado.
            • de 0 a <3 Muy Deficiente.
            • de 3 a <5 Insuficiente.
            • de 5 a <6 Bien.
            • de 6 a <9 Notable
            • de 9 a 10 Sobresaliente
    */

    public static void Ejercicio16() {

    int numero = 5;

        if ( numero >= 0 && numero <= 10) {

            if ( numero >= 9 ) {
                
                System.out.println("Sobresaliente");
                
            } else if ( numero >= 6 && numero < 9) {
                
                System.out.println("Notable");
                
            } else if ( numero >= 5 && numero < 6) {
                
                System.out.println("Bien");

            } else if ( numero >= 3 && numero < 5) {
                
                System.out.println("Insuficiente");

            } else if ( numero < 3) {
                
                System.out.println("Muy Deficiente");

            } else {

                System.out.println("Introduzca un valor entre 0 y 10 ambos incluidos");

            }
        }


    }//Cierre Ejercicio16

/*  Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos y
    segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo */

    public static void Ejercicio17() {

        // Hora indicada

        int hora = 17;

        int minutos = 47;

        int segundos = 46;

        segundos = segundos + 1;

        if ( (hora < 24 && hora >= 0) && (minutos < 60 && minutos >= 0) && (segundos <= 60 && segundos >= 0) ) {

            // Compruebo si segundos llega a 60

            if (segundos == 60){

                segundos = 0;

                int minutosnuevos = minutos + 1;

                //Compruebo si minutos llega a 60

                if (minutosnuevos == 60) {

                    minutosnuevos = 0;

                    int horanueva = hora + 1;

                    //Compruebo si las horas llegan a 24

                    if (horanueva == 24) {

                        horanueva = 0;

                        System.out.println("La hora introducida es de "+ horanueva + ":" + minutosnuevos + ":" + segundos);

                    } else {

                        System.out.println("La hora introducida es de "+ horanueva + ":" + minutosnuevos + ":" + segundos);

                    }

                } else {

                    System.out.println("La hora introducida es de "+ hora + ":" + minutosnuevos + ":" + segundos);

                }
            }


        } else {

            System.out.println("Por favor introduzca una una hora correcta");

        } // cierre if principal

    }//Cierre Ejercicio17

    /*  Escribe un programa que calcula el salario neto semanal de un trabajador en función del número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
            • Las primeras 35 horas se pagan a tarifa normal.
            • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
            • Las tasas de impuestos son:
            • Los primeros 500 euros son libres de impuestos.
            • Los siguientes 400 tienen un 25% de impuestos.
            • Los restantes un 45% de impuestos.
            Escribir nombre, salario bruto, tasas y salario neto */

    public static void Ejercicio18() {

        String trabajador = "Pedro";

        double tarifa = 30;

        double horastrabajadas = 50;

        if (horastrabajadas <= 35 ) {

            double salariobruto = horastrabajadas * tarifa;

            double salariobruto2 = horastrabajadas * tarifa;

            // Miramos si el salario es superior al limite del libre impuesto

            if ( salariobruto > 500 ) {

                double libreimpuesto = 500;

                salariobruto = salariobruto - libreimpuesto;

                // Miramos si el salario es superior a la primera tasa

                if ( salariobruto >= 400 ) {

                    salariobruto = salariobruto - 400;

                    double tasa1 = 400 - (400 * 0.75);

                    double salarioneto = salariobruto2 - tasa1;

                    //Miro si el salario es superior a la segunda tasa.

                    if (salariobruto > 0) {

                        double tasa2 = salariobruto - (salariobruto * 0.55);

                        salarioneto = salariobruto2 - tasa1 - tasa2;

                        System.out.println("El " + trabajador + " tiene un salario bruto de " + salariobruto2 + " con una tasa 1 de "+ tasa1 + ", con una tasa 2 de " +  tasa2 + " y un salario neto de " + salarioneto + " euro ");

                        // si el salario no llega a la segunda entonces solo mostramos la primera.
                    } else {

                        System.out.println("El " + trabajador + " tiene un salario bruto de " + salariobruto2 + " con una tasa 1 de "+ tasa1 + " y un salario neto de " + salarioneto + " euro ");

                    }

                    // Si el salario es mayor que el libreimpuesto pero no llega al limite de la segunda tasa, solo mostramos la primera tasa.

                } else if ( salariobruto < 400 && salariobruto > 0 ) {

                    double tasa1 = salariobruto - (salariobruto * 0.75);

                    double salarioneto = salariobruto2 - tasa1;

                    System.out.println(trabajador + " va cobrar " + salarioneto + " euro ");

                }

            // Si es menor de 500 directamente lo ponemos como salario neto.

            } else {

                System.out.println ( "El " + trabajador + " tiene un salario bruto y neto de " + salariobruto + " euro sin tasas");

            }

        } else if ( horastrabajadas > 35 ) {

            double horasextras = (horastrabajadas - 35);

            double salariohorasextra = horasextras * (tarifa * 1.5 );
            
            double salariobruto =  (horastrabajadas - horasextras) * tarifa;

            double salariobruto2 = (horastrabajadas - horasextras) * tarifa;

            // Miramos si el salario es superior al limite del libre impuesto

            if ( salariobruto > 500 ) {

                double libreimpuesto = 500;

                salariobruto = salariobruto - libreimpuesto;

                // Miramos si el salario es superior a la primera tasa

                if ( salariobruto >= 400 ) {

                    salariobruto = salariobruto - 400;

                    double tasa1 = 400 - (400 * 0.75);

                    double salarioneto = salariobruto2 - tasa1;

                    //Miro si el salario es superior a la segunda tasa.

                    if (salariobruto > 0) {

                        double tasa2 = salariobruto - (salariobruto * 0.55);

                        salarioneto = salariobruto2 - tasa1 - tasa2;

                        System.out.println("El " + trabajador + " tiene un salario bruto de " + salariobruto2 + " con una tasa 1 de "+ tasa1 + ", con una tasa 2 de " +  tasa2 + ", un salario neto de " + salarioneto + " euros y " + salariohorasextra + " euros en horas extras");

                        // si el salario no llega a la segunda entonces solo mostramos la primera.
                    } else {

                        System.out.println("El " + trabajador + " tiene un salario bruto de " + salariobruto2 + " con una tasa 1 de "+ tasa1 + " y un salario neto de " + salarioneto + " euros y " + salariohorasextra + "en horas extras");

                    }

                    // Si el salario es mayor que el libreimpuesto pero no llega al limite de la segunda tasa, solo mostramos la primera tasa.

                } else if ( salariobruto < 400 && salariobruto > 0 ) {

                    double tasa1 = salariobruto - (salariobruto * 0.75);

                    double salarioneto = salariobruto2 - tasa1;

                    System.out.println("El " + trabajador + " tiene un salario bruto de " + salariobruto2 + " con una tasa 1 de "+ tasa1 + " y un salario neto de " + salarioneto + " euros y " + salariohorasextra + "en horas extras");

                }

            // Si es menor de 500 directamente lo ponemos como salario neto.

            } else {

                System.out.println ( "El " + trabajador + " tiene un salario bruto y neto de " + salariobruto2 + " euro sin tasas y " + salariohorasextra + " euros en horas extras." );

            }
            
        }
        
    }

} // Cierre Clase Ejercicios

