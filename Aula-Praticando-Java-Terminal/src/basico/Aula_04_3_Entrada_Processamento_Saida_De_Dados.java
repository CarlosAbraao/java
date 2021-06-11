package basico;

import java.util.Scanner;

/**
 * 
 * OPERA��ES B�SICAS DA PROGRAM��O ENTRADA, PROCESSAMENTO E SAIDA
 * 
 * 					VAMOS VER COMO FUNCIONA A ENTRADA DE DADOS?
 **/

public class Aula_04_3_Entrada_Processamento_Saida_De_Dados {

	public static void main(String[] args) {
		
	

		
		// A classe SCANNER PERMITE LER INFORM��ES DO TECLADO
		/** NO EXEMPLO CRIEI UM OBJETO "TECLADO" QUE IR� CAPTURAR
		
		 * INFORM��ES DO TECLADO FISICO, VEJA O EXEMPLO
		
		 * **/
		Scanner teclado = new Scanner(System.in);

		// A VARIAVEL VALOR (DO TIPO DOUBLE) ESTA RECEBENDO UMA ENTRADA DO TECLADO
		double valor = teclado.nextDouble();

		System.out.println(valor);

		// EX: 1 USANDO PRINT FORMATADO; AQUI VOC� PODE ESTABELER O NUMERO
		// DE CASA DECIMAIS
		System.out.printf("%.5f%n", valor);

	}

}
