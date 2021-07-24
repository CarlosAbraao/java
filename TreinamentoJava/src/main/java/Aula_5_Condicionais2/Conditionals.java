package Aula_5_Condicionais2;

public class Conditionals {
    public static void main(String[] args) {

        // crie uma um programa que classifique um aluno de média 7 como aprovado e vice versa,
        // sendo que o mesmo possui 4 matérias


       // notas do aluno

       double matematica = 6;
       double portugues = 9;
       double ciencias = 5;
       double historia = 0;

       // nota que pode aprovar ou reprovar o aluno

       int notaCorte= 7;
       int qtdMaterias = 4;

      double  mediaAluno = (portugues + matematica + ciencias + historia) / qtdMaterias;

      if(mediaAluno >=notaCorte){
          System.out.println("aluno aprovador!!");
      }else if(mediaAluno < notaCorte && mediaAluno >= 5){
          System.out.println("possivel recuperação");

      }else{
          System.out.println("ALUNO reprovado");
      }
        System.out.println("Media do aluno = "+ mediaAluno);


    }



}
