package Aula_16_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class ExMap {
    public static void main(String[] args) {

        // OS MAPS TEM UMA ESTRUTURA CHAVE VALOR

        Map<String, Integer> campeoesMundiais = new HashMap<>();
        // O METODO PUT É SEMELHANTE AO ADD, PORÉM RECEBE 2 ARGUMENTOS
    campeoesMundiais.put("Brasil", 15);
        campeoesMundiais.put("Russia", 1);
        campeoesMundiais.put("Noruega", 4);
        campeoesMundiais.put("Japão", 8);
        campeoesMundiais.put("Italia", 2);
        campeoesMundiais.put("Portugal", 3);
        campeoesMundiais.put("Equador", 5);

        // mostrando os campeoes
        System.out.println(campeoesMundiais);

        // SE EU COLOCAR O PUT PRA UMA CHAVE QUE JA EXISTE ELE ATUALIZA O VALOR
        //EX:

        campeoesMundiais.put("Brasil", 18);
        System.out.println(campeoesMundiais);

        // VAI RETORNA ARGENTINA COMO PARAMETRO
        System.out.println(campeoesMundiais.get("Russia"));

        // MOSTRA SE O VALOR EXISTE OU N
        System.out.println(campeoesMundiais.containsKey("Noruega"));

        // REMOVE UMA CHAVE
        System.out.println(campeoesMundiais.remove("Noruega"));

        // retorna se tem alguem com um valor especifico
        System.out.println(campeoesMundiais.containsValue(8));

        //NAVEGAR EM TODAS A CHAVES ITERATOR

        Iterator<String> iterator = campeoesMundiais.keySet().iterator();

        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+ " ---- " + campeoesMundiais.get(key));
        }

        // PEGANDO A CHAVE COM O FOREACH EX1

        for(String campeoes : campeoesMundiais.keySet()){
            System.out.println(campeoes + " ___ " +campeoesMundiais.get(campeoes));
        }

        // PEGANDO A CHAVE COM O FOR EX2

        for(Map.Entry<String, Integer> campeoes: campeoesMundiais.entrySet()){
            System.out.println(campeoes.getKey() + "----" + campeoes.getValue());
        }
        // depois vou adicionar mais exemplos






    }
}
