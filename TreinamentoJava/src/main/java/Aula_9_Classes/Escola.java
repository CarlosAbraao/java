package Aula_9_Classes;

public class Escola {

    public static void main(String[] args) {
    // INSTANCIANDO UM ALUNO
    Aluno aluno = new Aluno();

    aluno.nomeAluno = "Carlos";
    aluno.matricula = 245;
    aluno.sala = 5;


        System.out.println("Nome do Aluno: "+aluno.nomeAluno);
        System.out.println("Matricula do Aluno: "+aluno.matricula);
        System.out.println("Sala: "+aluno.sala);

    }
}
