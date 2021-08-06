package Aula_15_TreeSet;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExTreeSet {
    public static void main(String[] args) {

        // TRABALHANDO COM ARVORE
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Florianopoles");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //RETORNA A PRIMEIRA CAPITAL NO TOPO DA ARVORE
        System.out.println("PRIMEIRA CAPITAL DA ARVORE: "+treeCapitais.first());

        //RETORNA A ULTIMA CAPITAL NO FIM DA ARVORE
        System.out.println("ULTIMA CAPITAL NO FIM DA ARVORE: "+ treeCapitais.last());

        // RETORNA A PRIMEIRA CAPITAL ABAIXO DA ARVORE PARAMETRIZADA
        System.out.println("Primeira capital abaixo do paramentro: "+ treeCapitais.lower("Curitiba"));

        // RETORNA A PRIMEIRA CAPITAL ACIMA DA ARVORE PARAMETRIZADA
        System.out.println("Primeira capital acima do paramentro: "+ treeCapitais.higher("Curitiba"));

        //RETORNA A PRIMEIRA CAPITAL NO TOPO DA ARVORE, removendo o set
        System.out.println("PRIMEIRA CAPITAL no topo DA ARVORE: "+treeCapitais.pollFirst());

        //RETORNA A PRIMEIRA CAPITAL NO final DA ARVORE, removendo o set
        System.out.println("PRIMEIRA CAPITAL no final DA ARVORE: "+treeCapitais.pollLast());

        // TAMBEM PODE USAR O ITERATOR E O FOR PARA PERCORRER OS ELEMENTOS




    }
}
