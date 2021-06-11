package basico;

public class Aula_07_Funcoes_Aritmeticas {
	
	public static void main(String[] args) {
		
		double x,y,z;
		
		double a = 5.0;
		
		double b = 7.0;
		
		double c = 9.0;
		
		double d = 144.0;
		
		double e = 2.0;
		
		double f = -5.0;
		
		
		// CALCULANDO A RAIZ QUADRADA
		
		x = Math.sqrt(d);
		System.out.println("Raiz quadrada de 144: " + x);
		
		
		// CALCULANDO A POTENCIA
		
		y= Math.pow(a, e);
		System.out.println("Potenciação entre os dois valores: " + y);
		
		// VALOR ABSOLUTO
		
				y= Math.abs(f);
				System.out.println("O VALOR ABSOLUTO: " + y);
		
	}
	
	

}
