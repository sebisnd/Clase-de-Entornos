import java.util.Scanner;

public class entornos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tu  completo con espacios: ");
		String nombre = teclado.nextLine();
		System.out.print("Introduce tu edad: ");
		int edad = teclado.nextInt();
		System.out.println("¡Hola, " + nombre + "! Tienes " + edad + " años.");
	}
}