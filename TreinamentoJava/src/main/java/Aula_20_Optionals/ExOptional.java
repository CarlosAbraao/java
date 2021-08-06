package Aula_20_Optionals;

import java.util.Optional;

public class ExOptional {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("Valor Opcional que esta presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não esta presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que nao esta presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = nao esta presente"));

        Optional<String> optionalEmpty   = Optional.empty();

        System.out.println("Valor opcional que nao esta presente");
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = nao esta presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que nao esta presente");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("Erro = nao esta presente"));





    }
}
