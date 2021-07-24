package Aula_5_Condicionais;

public class Conditionals {
    public static void main(String[] args) {

        // Uma pessoa deseja logar no sistema, mas para isso deverá ter um usuario e senha igual a true

        boolean usuario = true;
        boolean senha = false;

        if(usuario && senha){
            System.out.println("logando no sistema!!");
        }else
            {System.out.println("não foi possivel logar!");}


    }



}
