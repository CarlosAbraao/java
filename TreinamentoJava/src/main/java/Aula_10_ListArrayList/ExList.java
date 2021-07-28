package Aula_10_ListArrayList;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExList {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Marcos");
        nomes.add("Alice");
        nomes.add("Abraão"); //ADICIONADO DEPOIS


        // index do objeto

        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);

        // não ordenados
        System.out.println(nomes);
        // ALTERANDO A POSIÇÃO DOS NOMES
        nomes.set(2 ,"Melquisedeque");

        // não ordenados
        System.out.println(nomes);
        // PARAMETRO QUE ORDENA
        Collections.sort(nomes);
        // DEPOIS DE USAR A COLECTION "SORT" ELA FICARa ORDENADA

        System.out.println(nomes);

        //REMOVENDO ELEMENTO EM UMA DETERMINADA POSIÇÃO

        nomes.remove(2);
        // REMOVEU CARLOS QUE ESTAVA NA POSIÇÃO 2 "INDEX"
        System.out.println(nomes);;
        // REMEVENDO O OBJETO PELO NOME
        nomes.remove("Marcos");
        // MARCOS NÃO PERTENCE MAIS A LISTA
        System.out.println(nomes);
        // PEGA UM ELEMENTO DA LISTA
       String nome =  nomes.get(3);

        System.out.println("Peguei o nome: "+nome);

        // QUAL O TAMANHO DA MINHA LISTA?

        int tamanho = nomes.size();

        System.out.println("O tamanho da minha lista é: "+tamanho);

        // SABER SE um elemento esta presente na lista elel retorna um boolean

        boolean temNomeNaLista = nomes.contains("Raul");
        System.out.println(temNomeNaLista);

        // para saber se a lista esta vazia
       // boolean listaVazia = nomes.isEmpty();
        //System.out.println(listaVazia);

        //posso usar o comando clear para limpa uma lista

        // nomes.clear

        // percorrendo a lista com foreach

        for (String nomeItens : nomes){

            System.out.println("--> "+nomeItens);
        }


        // percorrendo a lista com iterator

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
