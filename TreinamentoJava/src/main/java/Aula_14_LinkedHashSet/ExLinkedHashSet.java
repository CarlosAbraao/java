package Aula_14_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExLinkedHashSet {
    public static void main(String[] args) {

        //ENQUANTO O HASHSET NÃO OBEDECE A SEQUENCIA DE ESCRITA O LINKEDHASHSET OBEDECE
        // BASICAMENTE É ESSA A DIFERENCIA OS PARAMETROS SÃO BASICAMENTE OS MESMOS
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
// NÃO OBEDECE A ORDEM NATURAL DOS NUMEROS AO PRINTAR ELES VÃO SEGUIR OUTRA ORDEM


        sequenciaNumerica.add(10);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(8);

        System.out.println(sequenciaNumerica);

        //remove a nota set pelo objeto
          sequenciaNumerica.remove(8);

        // retorna a quantidade de itens do set
        System.out.println("Quantidade de itens no Set: "+sequenciaNumerica.size());

        //para saber se esta vazio
        System.out.println("O set esta vazio? "+ sequenciaNumerica.isEmpty());

        //ALÉM DISSO PODEMOS USAR O ITERATOR E FOREACH ASSIM COMO NOS OUTROS EXEMPLOS

    }
}
