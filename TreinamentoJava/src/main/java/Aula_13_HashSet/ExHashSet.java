package Aula_13_HashSet;

import java.util.HashSet;
import java.util.Set;

public class ExHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();
// NÃO OBEDECE A ORDEM NATURAL DOS NUMEROS AO PRINTAR ELES VÃO SEGUIR OUTRA ORDEM
        notasAlunos.add(10.0);
        notasAlunos.add(2.5);
        notasAlunos.add(4.7);
        notasAlunos.add(7.0);
        notasAlunos.add(5.5);
        notasAlunos.add(8.7);

        System.out.println(notasAlunos);

        //remove a nota set pelo objeto
          notasAlunos.remove(8.7);

        // retorna a quantidade de itens do set
        System.out.println("Quantidade de itens no Set: "+notasAlunos.size());

        //para saber se esta vazio
        System.out.println("O set esta vazio? "+ notasAlunos.isEmpty());

        //ALÉM DISSO PODEMOS USAR O ITERATOR E FOREACH ASSIM COMO NOS OUTROS EXEMPLOS

    }
}
