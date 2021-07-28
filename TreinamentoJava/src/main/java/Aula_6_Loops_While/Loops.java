package Aula_6_Loops_While;

public class Loops {
    public static void main(String[] args) {
        // nesse exemplo mostro um pouco do While e 2 exercicios

        int numero = 0;
        // enquanto o numero for menor do que 10 o loop vai ficar repetindo, logo após vai sair e exibir uma
        // mensagem
        while (numero < 10){
        System.out.println("Conferindo: "+ numero);
            // existe outra formar de escrever a linha de baixo -> "numero++;" seria uma outra solução
            numero = numero + 1;

        }

        // assim que contar até 10 ele vem para essa linha fora do loop

        System.out.println("saiu do loop");
    }
}
