package Aula_12_Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;

public class ExQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Carlos");
        filaBanco.add("Ronaldo");
        filaBanco.add("Alok");
        filaBanco.add("Paulo");

        System.out.println(filaBanco);

        // Pool mostra qual é o primeiro elemento a ser antendido
        String clienteAtendido = filaBanco.poll();

        System.out.println("Cliente da fila a ser atendido: "+ clienteAtendido);

        //filaBanco.clear();
        // SE N TIVER NINGUEM  NA FILA ELE RETORNA NULL
        String primeiroCliente = filaBanco.peek();
        System.out.println("O primeiro cliente da fila é: "+primeiroCliente);

        // NESSE CASO É LANÇADA UMA EXCEÇÃO CASO N TENHA NINGUEM NA FILA
        // VOU DA UM CLEAR PRA LANÇAR A EXCEPTION
        //filaBanco.clear();
        String primeiroElementoOuErro = filaBanco.element();
        System.out.println("PRIMEIRO CLIENTE DA FILA OU ERRO: "+primeiroElementoOuErro);



       /* System.out.println("=-=-=-=-=-=-=-=-=-=-=- EXEMPLO COM FOREACH");
        for (String pessoasNaFila: filaBanco){

            System.out.println(pessoasNaFila);
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=- EXEMPLO COM iterator");

        Iterator <String> iterator = filaBanco.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

    }
}
