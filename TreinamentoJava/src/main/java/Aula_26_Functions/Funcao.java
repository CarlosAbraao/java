package Aula_26_Functions;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function <String, String> retornaAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function <String, Integer> retornaInteiro = string -> Integer.valueOf(string) * 40;//multiplicar por 40
        System.out.println(retornaAoContrario.apply("Carlos Abraao"));
        System.out.println(retornaInteiro.apply("20"));


    }
}
