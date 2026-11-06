import java.util.Scanner;

public class EjerciciosProgramacion {

	public static Scanner teclado = new Scanner(System.in);

	public static void main (String [] args){
	
		Ejercicio1();
		
		teclado.close();

	}

	public static void Ejercicio1(){

		int dia = teclado.nextInt();
		teclado.nextLine();

        while (dia != 0) {

		dia = teclado.nextInt();
		teclado.nextLine();

			switch (dia) {

                case 0:
                break;
				case 1: System.out.println("Lunes");
				break;
				case 2: System.out.println("Martes");
				break;
				case 3: System.out.println("Miércoles");
				break;
				case 4: System.out.println("Jueves");
				break;
				case 5: System.out.println("Viernes");
				break;
				case 6: System.out.println("Sabado");
				break;
				case 7: System.out.println("Domingo");
				break;
				default: System.out.println("Introduzca un valor");
				break;
			}
		}

	}

}