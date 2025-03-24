package Programa;

import java.util.Locale;
import java.util.Scanner;
import entities.entidades;

public class home {
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner (System.in);
	    

	    System.out.println("Digite o nome do aluno: ");
	    String nomeAluno = sc.next();
	    System.out.println("Digite a nota 1: ");
	    double nota1 = sc.nextDouble();
	    System.out.println("Digite a nota 2: ");
	    double nota2 = sc.nextDouble();
	    System.out.println("Digite a nota 3: ");
	    double nota3 = sc.nextDouble();
	    
	    entidades Aluno = new entidades(nomeAluno, nota1,nota2,nota3);
	    
	    System.out.println(Aluno.toString());
 }
}