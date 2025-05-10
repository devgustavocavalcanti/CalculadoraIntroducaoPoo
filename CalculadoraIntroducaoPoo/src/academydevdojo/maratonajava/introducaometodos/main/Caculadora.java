package academydevdojo.maratonajava.introducaometodos.main;

import java.util.Locale;
import java.util.Scanner;

import academydevdojo.maratonajava.introducaometodos.dominio.EntentiesCalculadora;

public class Caculadora {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	EntentiesCalculadora ententiesCalculadora = new EntentiesCalculadora();
	Locale.setDefault(Locale.US);
	boolean isContinuar = false;
	char resp;
	do { 
	 System.out.println("--------Bem Vindo--------");
	 System.out.println("O que deseja realizar");
	 System.out.println("1------Adição");
	 System.out.println("2------Divisão");
	 System.out.println("3------Multiplicação");
	 System.out.println("4------Subtração");
	 System.out.println("-------------------------");
	int op = sc.nextInt(); 
	switch (op){
	case 1: {
	 System.out.printf("O resultado é: %d \n", ententiesCalculadora.somaDosValores());
		sc.nextLine();
		} break;
	case 2:	{
		System.out.printf("O resultado é: %.2f%n", ententiesCalculadora.dividirValores());
		sc.nextLine();
		} break;
	case 3:{
		System.out.printf("O resultado é: %.2f%n", ententiesCalculadora.multiplicarValores());
		sc.nextLine();
	}break;
	case 4:{
		System.out.printf("O resultado é: %.2f%n", ententiesCalculadora.subtrairValores());
		sc.nextLine();
	}break;
	default: {System.out.println("Opção Inválida!");
	sc.nextLine();
	}continue;
	} 
	System.out.println("Deseja continuar s/n");
	resp = sc.nextLine().charAt(0);
	isContinuar= resp=='s';
	} while(isContinuar);
	System.out.println("Obrigado por usar nossa Calculadora!");
	sc.close();
}

}
