package Aula_22_ParadigmaFuncional;


import java.util.function.UnaryOperator;

public class Paradigma {
    public static void main(String[] args) {

        //PARADIGMA INPERATIVO

   /*     int valor = 10;
        int resultado = valor * 3;
        System.out.println("Resultado: "+resultado);
    */

        UnaryOperator <Integer> valorVezesTrinta = valor -> valor*30;
        int valor = 10;

        System.out.println("Resultado é:: "+valorVezesTrinta.apply(10));


    }
}
