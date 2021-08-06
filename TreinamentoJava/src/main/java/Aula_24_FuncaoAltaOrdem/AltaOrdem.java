package Aula_24_FuncaoAltaOrdem;

public class AltaOrdem {

    public static void main(String[] args) {

        Calculo soma = (a, b) -> a + b;

        // EXECUÇÃO DA FUNÇÃO
        System.out.println(calcularOperacao(soma,4 ,8));



    }


    public static int calcularOperacao(Calculo calculo,int a, int b){

        return calculo.calcular(a, b);
    }
}

@FunctionalInterface
interface Calculo{

    int calcular(int a, int b);

}