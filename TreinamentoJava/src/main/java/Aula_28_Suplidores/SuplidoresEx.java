package Aula_28_Suplidores;

import java.util.function.Supplier;

public class SuplidoresEx {
    public static void main(String[] args) {
        // usando metodo normal
        //Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();

        //usando metodo referencia
        Supplier<Pessoa> novaPessoa = Pessoa::new;
        System.out.println(novaPessoa.get());

    }

}


    class Pessoa {
        private String nome;
        private Integer idade;


        public Pessoa() {
            nome = "Carlos";
            idade = 20;
        }

        @Override
        public String toString() {
            return String.format(" nome: %s, idade: %d", nome, idade);
        }


    }




