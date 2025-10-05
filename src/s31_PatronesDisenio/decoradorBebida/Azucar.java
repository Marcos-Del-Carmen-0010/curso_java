package s31_PatronesDisenio.decoradorBebida;

public class Azucar implements Bebida {
    Bebida bebida;

    public Azucar(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Azucar";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 2.0;
    }
}
