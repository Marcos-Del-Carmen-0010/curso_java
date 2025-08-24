package s18_herencia.compania;

public class Cliente extends Persona{
    private int idCliente = 1;
    Cliente(String nombre, String apellido, String numeroFiscal) {
        super(nombre, apellido, numeroFiscal);
        this.idCliente++;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    @Override
    public String toString() {
        return  "ID Cliente: " + idCliente +
                super.toString() +
                "\n------------------------------------";
    }
}
