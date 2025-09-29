package s31_PatronesDisenio.decoradorBebida;

public class Chocolate implements Bebida {
    Bebida bebida;

    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return this.bebida.getDescripcion() + " + Chocolate";
    }

    @Override
    public double getCosto() {
        return this.bebida.getCosto() + 4.0;
    }
}
