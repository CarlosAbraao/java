package Aula_23_ExpressoesLambdas;




public class SitaxeLambda {
    public static void main(String[] args) {

        Funcao mostrarUmaString = valor -> valor;
        System.out.println(mostrarUmaString.gerar("Carlos Abraão"));



      /*
      * caso o  retono da funcção fosse void ficaria assim o codigo
      *  funcao mostraUmaString = System.out.println(valor);*/
    }
}
