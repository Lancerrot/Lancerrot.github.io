import java.util.Scanner;

public class EjerciciosExtras {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //Ejercicio1();
        //Ejercicio2();
        Ejercicio3();


        teclado.close();

    } // Cierre Main

    /*
     * Crea un programa que lea las longitudes de 3 lados. Primero debe comprobar si
     * forman un triángulo válido (la suma de dos lados siempre debe ser mayor que
     * el tercero).
     * Si es válido, debe indicar si es Equilátero (3 lados iguales), Isósceles (2
     * lados iguales) o Escaleno (3 lados diferentes).
     */

    public static void Ejercicio1() {

        // Longitud de los lados del triangulo.

        int lado1 = 10;
        int lado2 = 10;
        int lado3 = 10;

        int valido = lado1 + lado2;

        if (valido > lado3) {

            // Equilatero todos sus lados son iguales.

            if (lado1 == lado2 && lado1 == lado3) {

                System.out.println(" El triángulo es Equilatero.");

                // Isóceles dos de sus lados son iguales.

            } else if ( (lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3) ) {

                System.out.println(" El triángulo es Isóceles.");

                // Escaleno

            } else {

                System.out.println(" El triángulo es Escaleno.");

            }

        } else {

            System.out.println(" Por favor introduzca unos valores validos. ");

        } // Cierre de la verificación de los lados del triangos

    } // Cierre Ejercicio1

    /* Lee un número de mes (1 al 12) y un año. El programa debe mostrar cuántos días tiene ese mes. Recuerda que febrero tiene 28 días, pero en años bisiestos tiene 29.

    (Un año es bisiesto si es divisible por 4, excepto si es divisible por 100, a menos que también sea divisible por 400). */

    public static void Ejercicio2() {

        int Mes = 2;

        int Año = 190;

        //Consultamos que mes

        switch (Mes) {
            case 1:

            System.out.println(" Enero tiene 31 días ");

                break;

            case 2:

            //Es bisiesto?????

            if ((Año % 4 == 0) && (Año % 100 != 0) || (Año % 400 == 0) ) {

            System.out.println(" Febrero tiene 29 días ");

            } else {

            System.out.println(" Febrero tiene 28 días");

            }

                break;

            case 3:

            System.out.println(" Marzo tiene 31 días ");

                break;

            case 4:

            System.out.println(" Abril tiene 30 días ");

                break;

            case 5:

            System.out.println(" Mayo tiene 31 días ");

                break;

            case 6:

            System.out.println(" Junio tiene 30 días ");

                break;

            case 7:

            System.out.println(" Julio  tiene 31 días ");

                break;

            case 8:

            System.out.println(" Agosto tiene 31 días ");

                break;

            case 9:

            System.out.println(" Septiembre tiene 30 días");

                break;

            case 10:

            System.out.println(" Octubre tiene 31 días ");

                break;

            case 11:

            System.out.println(" Noviembre tiene 30 días ");

                break;

            case 12:

            System.out.println(" Diciembre tiene 31 días ");

                break;

            default:

            System.out.println(" Por favor introduzca un mes valido.");

                break;
        }
    }// Cierre Ejercicio2

    /* Escribe un programa que pida un día, un mes y un año, y determine si corresponden a una fecha válida en el calendario.
    Ten en cuenta los límites de días según el mes y si el año es bisiesto. */

    public static void Ejercicio3() {

        System.out.println(" Dime el dia");

        int dia = teclado.nextInt();
        teclado.nextLine();

        System.out.println(" Dime el mes");

        int mes = teclado.nextInt();
        teclado.nextLine();

        System.out.println(" Dime el año");

        int anno = teclado.nextInt();
        teclado.nextLine();


            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:

                    if (( dia > 0 && dia <= 31 )) {

                        System.out.println( "la fecha es valida ");

                    } else {

                        System.out.println( "la fecha es valida ");

                    }

                    break;

                case 2:

                int Bisiesto = Esbisiesto(anno);

                if (Bisiesto != 0 && dia > 0 && dia <= 29) {

                    System.out.println( "la fecha es valida ");

                } else {

                    System.out.println( "la fecha es valida ");

                    }

                    break;

                case 4:
                case 6:
                case 9:

                    break;
            
                default:
                    break;
            }




        
    }

    //Verificador de año bisiesto

    public static int Esbisiesto( int anno ) {

        int aux = anno;


        if ( (aux % 4 == 0 && aux % 100 != 0) || aux % 400 == 0  ) {

            return 1;

        } else {

            return 0;
        }

        
    } // Cierre Esbisiesto
}





