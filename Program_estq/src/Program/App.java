package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Stock;

public class App {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner (System.in);
   
    	
    System.out.print("Digite o nome do produto: ");
    	String product = sc.next();
    System.out.print("Digite o valor do produto: ");
    	double value = sc.nextDouble();
    System.out.print("Digite a quantidade: ");
    	double stock = sc.nextDouble();
    	Stock stoke = new Stock(product, value, stock);
    System.out.println(stock);
    
    System.out.println(" ");
    System.out.println("Digite a quantidade para adcionar: ");
    stock = sc.nextDouble();
    System.out.println("Estoque aualizado:" + stock);
    System.out.println("Digite a quantidade para Retirar: ");
   
	System.out.println("Estoque aualizado:" + stock);
    	
    sc.close();

	}

}
