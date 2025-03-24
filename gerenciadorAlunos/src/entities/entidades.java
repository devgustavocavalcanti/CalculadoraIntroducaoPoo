package entities;

public class entidades{
	public String nomeAluno;
	public String materia;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	

 public entidades (String nomeAluno, double nota1, double nota2, double nota3) {
 this.nomeAluno=nomeAluno;
 this.nota1=nota1;
 this.nota2=nota2;
 this.nota3=nota3;
 this.media=media;
 }
 public double mediaMateria() {
 return media=(nota1+nota2+nota3)/3;
 }
 
 public String toString() {
	 return nomeAluno 
			 + "Teve a média de " 
			 + String.format("%.2f", mediaMateria())
			 + "e está aprovado!";
	 
			
 }
}