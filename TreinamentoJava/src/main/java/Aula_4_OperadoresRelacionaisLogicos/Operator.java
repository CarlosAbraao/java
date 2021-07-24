package Aula_4_OperadoresRelacionaisLogicos;

public class Operator {
    public static void main(String[] args) {
        //igual ==
        //diferente !=
        //maior q >
        //menor q <
        //maior ou igual >=
        //menor ou igual <=

        //&& quando condiçõe forem verdadeiras
        // || quando pelo menos umas das opções for verdadeira

        /* ALGUNS EXEMPLOS SIMPLES **/

        int numero1  = 5;
        int numero2 = 7;

        // como o retorno é booleano ele só pode ter os valores True ou False
        boolean resultado, resultado2;

        // O numero1 é difente do numero2 ?
        resultado = numero1 != numero2;
        // O resutado será True
        System.out.println(resultado);


        // Alguma dessa condições de numero 2 é igual?
        resultado2 = numero2==numero1 || numero1 == numero2 ;
        System.out.println(resultado2);

    }
}


