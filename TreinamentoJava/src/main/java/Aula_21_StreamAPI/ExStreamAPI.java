package Aula_21_StreamAPI;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExStreamAPI {
    public static void main(String[] args) {

        List <String> estudantes = new ArrayList<>();

        // LISTA DE ESTUDANTES
        estudantes.add("Carlos");
        estudantes.add("Aline");
        estudantes.add("Paulo");
        estudantes.add("Ana");
        estudantes.add("Carla");
        estudantes.add("Livia");
        estudantes.add("Heloisa");
        estudantes.add("Luna");
        estudantes.add("Evellyn");

        // IMPRIMINDO ESTUDANTES
        System.out.println(estudantes);

        //CONTAGEM DE ESTUDANTES NA STREAM
        System.out.println("Quantidade de elementos na Stream: " + estudantes.stream().count());

        //CONTAGEM DE ESTUDANTES NA STREAM
        System.out.println("Quantidade de elementos na Stream: " + estudantes.stream().count());

        // ELEMENTO COM MAIOR NUMERO DE LETRAS NA STREAM
        System.out.println(estudantes.stream().max(Comparator.comparingInt(String::length)));

        // ELEMENTO COM MENOR NUMERO DE LETRAS NA STREAM
        System.out.println(estudantes.stream().min(Comparator.comparingInt(String::length)));

        // RETORNA O ELEMENTO QUE CONTEM A LETRA "R" COMO PARAMETRO
        System.out.println(estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")
        ).collect(Collectors.toList()));

        // RETORNA UM NOME CONCATENADO A QUANTIDADE DE LETRAS DE CADA NOME
        System.out.println("Coleção com a quantidad de letra de cada nome: " + estudantes.stream().map
                (estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect((Collectors.toList()) ));

// DEPOIS VEJO MAIS OBRE O ASSUNTO

    }
}
