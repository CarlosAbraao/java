package Aula_33_Thread;

public class ExThread {

    public static void main(String[] args) {

       Carregamento2 carregamento2 = new Carregamento2();
        Carregamento2 carregamento22 = new Carregamento2();

        carregamento2.start();
        carregamento22.start();


    }

}

class GerarPdf implements Runnable{
    @Override
    public void run(){
        System.out.println("Gerar Pdf");
    }
}
class BarraDeCarregamento implements Runnable{

    @Override
    public void run(){
        System.out.println("loading...");
    }

}
class Carregamento2 extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("rodei..: "+ this.getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
