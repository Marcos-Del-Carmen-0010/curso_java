package s25_HilosConcurrencia;

public class c251_EjemSyschronize {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new VueloSys("Hola","¿que hace?"));
        t1.start();
        t1.sleep(200);
        Thread t2 = new Thread(new VueloSys("Muy buenas señor","¿Como la en este día tan bello?"));
        t2.start();
        t2.sleep(300);
        Thread t3 = new Thread(new VueloSys("Hay algo por haya","¿Vamos a ver?"));
        t3.start();
    }

    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print(frase1);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(frase2);
    }
}
