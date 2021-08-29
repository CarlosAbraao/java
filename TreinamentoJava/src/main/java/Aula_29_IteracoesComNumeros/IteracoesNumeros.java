package Aula_29_IteracoesComNumeros;

import java.util.stream.Stream;

public class IteracoesNumeros {
    public static void main(String[] args) {
        Integer[] numeros = {1,4,5,1,8,23,45,75,32};
        imprimirODobloDeCadaValor(numeros);
    }


    public static void imprimirODobloDeCadaValor(Integer... numeros){
        for(Integer numero : numeros){
            System.out.println(numero*2);

        }
        System.out.println("");
        Stream.of(numeros)
                .map(numero -> numero*2)
                .forEach(System.out::println);
    }
}
