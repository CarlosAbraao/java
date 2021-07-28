package Aula_8_Metodos;

public class MetodosEx {

    public static void main(String[] args) {
        int resultado = 0;

        mostrarFrase();

       resultado = calcular(5,9);

        System.out.println(resultado);

        // manipulando a variavel ao multiplicar mais 40 em resultado
        System.out.println(resultado * 10);


    }


    // metodo que exibe uma frase qualquer de forma que n podemos manipular o mesmo
    public static void mostrarFrase(){

        System.out.println("Esse metodo vai mostrar essa frase ");
    }

    // esse metodo vai retornar um valor manipulaver e execuatr um calculo
    public static int calcular (int valor1, int valor2){
        int resultado = 0;

        resultado = valor1 + valor2;
        return resultado;
    }
}
