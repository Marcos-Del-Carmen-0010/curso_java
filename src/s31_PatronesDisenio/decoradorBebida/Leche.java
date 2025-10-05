package s31_PatronesDisenio.decoradorBebida;

public class Leche implements Bebida {
    Bebida bebida;

    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Leche";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 5.0;
    }
}
