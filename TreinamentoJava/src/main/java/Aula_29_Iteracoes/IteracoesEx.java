package Aula_29_Iteracoes;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IteracoesEx {
    public static void main(String[] args) {
        String[] nomes = {"Joao", "Maria", "Carlos", "Ana", "Mateus"};

        imprimirNomesFiltrados(nomes);
        imprimirTodosOsNomes(nomes);


    }

    public static void imprimirNomesFiltrados(String... nomes){

        String nomeParaImprimir= "";
        for (int i = 0; i<nomes.length;i++){
            if(nomes[i].equals("Joao")){
                nomeParaImprimir+=" "+nomes[i];
            }
        }

        System.out.println("Nome do FOR:" +nomeParaImprimir);

        // usando a Stream para filtrar o nome

        String nomeParaImprimirDaStream =  Stream.of(nomes)
                .filter(nome -> nome.equals("Joao"))
                .collect(Collectors.joining()); // PEGA UM ARRAY DE STRING E SEPARA UM VALOR COM ESPAÇO
        System.out.println("NOmes do STREAM: "+nomeParaImprimirDaStream);



    }
// PERCORRENDO O VETOR COM STREAMS
    public static void imprimirTodosOsNomes(String... nomes){

        for(String nome : nomes){
            System.out.println("Imprimido pelo foreach: "+nome);
        }
        System.out.println("");
        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+__+_+_");
        System.out.println("");
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido com o Stream: "+nome));

    }

}
