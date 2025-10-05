package s31_PatronesDisenio.composite.cofre;

public class CasaJugador {
    public static void main(String[] args) {
        Cofre cofre = new Cofre("Herramientas");
        Cofre cofre1 = new Cofre("Alimentos vegetales");
        Cofre susquer = new Cofre("Susquer");

        ObjetoSimple item1 = new ObjetoSimple("1 x espada de diamante");
        ObjetoSimple item2 = new ObjetoSimple("2 x Tijeras");
        ObjetoSimple item3 = new ObjetoSimple("4 x Picos de hierrro");

        ObjetoSimple item4 = new ObjetoSimple("5 x manzanas de noch");
        ObjetoSimple item5 = new ObjetoSimple("64 x zanaorias");
        ObjetoSimple item6 = new ObjetoSimple("43 x remolachas");

        ObjetoSimple item7 = new ObjetoSimple("64 x adamios");
        ObjetoSimple item8 = new ObjetoSimple("64 x bloques de piedra");
        ObjetoSimple item9 = new ObjetoSimple("64 x bloques de hierro");
        ObjetoSimple item10 = new ObjetoSimple("64 x tronco de madera");

        cofre.addItem(item1);
        cofre.addItem(item2);
        cofre.addItem(item3);
        susquer.addItem(item7);
        susquer.addItem(item8);
        susquer.addItem(item9);
        susquer.addItem(item10);

        cofre.addItem(susquer);

        cofre.usar();

        cofre1.addItem(item4);
        cofre1.addItem(item5);
        cofre1.addItem(item6);
        cofre1.usar();

    }
}
