package s31_PatronesDisenio.decoradorBebida;
public class Cafe implements Bebida {
    @Override
    public String getDescripcion() {
        return "Cafe";
    }

    @Override
    public double getCosto() {
        return 20.0;
    }
}
