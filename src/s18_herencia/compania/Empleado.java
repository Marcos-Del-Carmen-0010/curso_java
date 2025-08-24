package s18_herencia.compania;

public class Empleado extends Persona {
    private int idEmpleado = 1;
    private Double remuneracion;
    private Double calculoRemuneracion;

    Empleado(String nombre, String apellido, String numeroFiscal) {
        super(nombre, apellido, numeroFiscal);
    }

    Empleado(String nombre, String apellido, String numeroFiscal, Double remuneracion) {
        super(nombre, apellido, numeroFiscal);
        this.remuneracion = remuneracion;
        this.idEmpleado++;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public Double aumentarRemuneracion(int porcentaje) {
        if (remuneracion != null) {
            this.calculoRemuneracion = porcentaje > 0 && porcentaje < 101 ? this.remuneracion/porcentaje : 0;
        }
        return this.calculoRemuneracion;
    }

    @Override
    public String toString() {
        String info = "";
        info += "ID Empleado: " + this.idEmpleado;
        info += super.toString();
        if(this.remuneracion != null && this.calculoRemuneracion != null) {
            info += "\nRemuneracion: " + this.remuneracion;
            info += "\nCalculo de remuneracion: " + this.calculoRemuneracion;
        } else {
            info += "\nRemuneracion no encontrada";
        }
        info += "\n-------------------------------------";
        return info;
    }
}
