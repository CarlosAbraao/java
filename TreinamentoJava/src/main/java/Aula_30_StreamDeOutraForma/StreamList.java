package Aula_30_StreamDeOutraForma;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamList {
    public static void main(String[] args) {
        //EXEMPLO DE USO DE LIST/ ARRAYLIST

        List <String> profissoes = new ArrayList<>();

        profissoes.add("Professor");
        profissoes.add("Mecanico");
        profissoes.add("Gerente de Producao");
        profissoes.add("Gerente de Vendas");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);




    }

}
