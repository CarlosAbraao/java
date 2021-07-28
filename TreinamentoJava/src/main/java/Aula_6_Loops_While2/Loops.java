package Aula_6_Loops_While2;

public class Loops {
    public static void main(String[] args) {
        // criando uma tabuada com while

       int numero = 0;
       int tabuada = 7;
       int multiplica = 0;


        while (numero <= 10){
            multiplica = tabuada * numero;
            System.out.println("Tabuada do " + tabuada  + " x " +numero + " = " + multiplica);

            numero++;
        }



    }
}
