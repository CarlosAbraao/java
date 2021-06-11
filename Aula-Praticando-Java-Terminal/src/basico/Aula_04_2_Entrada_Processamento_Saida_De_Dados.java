package basico;

/**
 * 
 * OPERAÇÕES BÁSICAS DA PROGRAMÇÃO ENTRADA, PROCESSAMENTO E SAIDA
 * 
 * 					VAMOS VER COMO FUNCIONA O PROCESSAMENTO?
 **/

public class Aula_04_2_Entrada_Processamento_Saida_De_Dados {

	public static void main(String[] args) {
		
		// DECLARANDO VARIAVEIS USADAS

		double valor1 = 5.658;
		double valor2 = 5.658;
		
		// A VARIAVEL SOMA VAI PROCESSAR O CALCULO DAS DUAS VARIAVEIS
		double soma = valor1 + valor2;

		// EX: 1 DE SAIDA DE DADOS USANDO SOMA COMO EXEMPLO

		System.out.println(soma);

		// EX: 1 USANDO PRINT FORMATADO; AQUI VOCÊ PODE ESTABELER O NUMERO
		// DE CASA DECIMAIS
		System.out.printf("%.5f%n", soma);

	}

}
