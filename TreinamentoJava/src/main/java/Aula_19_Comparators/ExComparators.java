package Aula_19_Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExComparators {
    public static void main(String[] args) {

        List <Estudante> estudantes = new ArrayList<>();

        estudantes.add( new Estudante ("Pedro",25));
        estudantes.add(new Estudante("Carlos",36));
        estudantes.add(new Estudante("Melquisedeque",46));
        estudantes.add(new Estudante("Ana",12));
        estudantes.add(new Estudante("Maria",8));
        estudantes.add(new Estudante("Poliana",18));

        System.out.println("Ordem de Inserção");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("--- ordem natural dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade() );
        System.out.println("--- ordem reversa ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("-- Ordem natural dos numeros - idade (method referense)");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("-- Ordem reversa dos numeros - idade (method referense)");
        System.out.println(estudantes);


        Collections.sort(estudantes);

        System.out.println("-- Ordem natural dos numeros - idade (inteface comparator)");
        System.out.println(estudantes);

        Collections.sort(estudantes , new EstudanteOrdemIdadeReversaComparator());

        System.out.println("-- Ordem reversa dos numeros - idade (inteface comparator)");
        System.out.println(estudantes);



    }
}
