package Aula_27_Predicados;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        //USEI PRIMEIRO ESSE MODELO
       // Predicate <String> estaVazio = valor -> valor.isEmpty();

        // VOU SAUR ABAIXO O METODO DE REFERENCIA
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Carlos"));
    }
}
