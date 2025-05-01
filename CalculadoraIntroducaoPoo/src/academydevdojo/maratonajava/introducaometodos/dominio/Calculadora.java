package academydevdojo.maratonajava.introducaometodos.dominio;

import java.util.Scanner;
import java.util.Locale;
public class Calculadora {
	public double valor1;
	public double valor2;
	public double result;
	
	Scanner sc = new Scanner(System.in);
	public int somaDosValores() {
		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor 1: ");
		valor1 = (double) sc.nextInt();
		System.out.println("Digite o valor 2: ");
		valor2 = (double) sc.nextInt();
		result = valor1 + valor2;
		return (int) result;

	}

	public double dividirValores() {
		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor 1: ");
		valor1 = sc.nextDouble();
		System.out.println("Digite o valor 2: ");
		valor2 = sc.nextDouble();
		if (valor2 == 0) {
			return 0;
		} else if (valor1 == 0) {
			return 0;
		} else if (valor1 < valor2) {
			result = valor2 / valor1;
			return result;
		} else {
			result = valor1 / valor2;
			return result;
		}
	}

	public int multiplicarValores() {
		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor 1: ");
		valor1 = (double) sc.nextInt();
		System.out.println("Digite o valor 2: ");
		valor2 = (double) sc.nextInt();
		result = valor1 * valor2;
		return (int) result;

	}

	public double subtrairValores() {
		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor 1: ");
		valor1 = sc.nextDouble();
		System.out.println("Digite o valor 2: ");
		valor2 = sc.nextDouble();

		if (valor1 < valor2) {
			result = valor2 - valor1;
			return result;
		} else {
			result = valor1 - valor2;
			return result;
		}
	}
}