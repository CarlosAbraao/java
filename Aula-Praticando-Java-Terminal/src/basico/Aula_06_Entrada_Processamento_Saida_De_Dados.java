package basico;

import java.util.Scanner;

public class Aula_06_Entrada_Processamento_Saida_De_Dados {

	public static void main(String[] args) {


		// CLASSE QUE PERMITE LER O TECLADO 
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Digite um nome: ");
	String nome = sc.nextLine();

	System.out.println("Digite uma idade: ");
	int idade = sc.nextInt();
	
	System.out.println("Digite seu peso: ");
	float peso = sc.nextFloat();
	
	
	
	System.out.println("Olá sr "+ nome);
	System.out.println("Sua idade é: "+idade);
	System.out.println("Seu peso é: "+ peso);
	}

}
