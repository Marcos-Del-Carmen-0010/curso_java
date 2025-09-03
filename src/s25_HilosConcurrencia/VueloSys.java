package s25_HilosConcurrencia;

import static s25_HilosConcurrencia.c251_EjemSyschronize.imprimirFrases;

public class VueloSys implements Runnable {
    private String frase1;
    private String frase2;

    public VueloSys(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        imprimirFrases(this.frase1, this.frase2);
    }
}
