package Aula_25_Consumidores;

import java.util.function.Consumer;

public class Consumir {
    public static void main(String[] args) {
        Consumer<String> imprimirFrase = System.out::println;
       // Consumer<String> imprimirFrase = frase -> System.out.println(frase);
        imprimirFrase.accept("Olá Pessoal");
    }
}
