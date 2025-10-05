package s30_Annotations.models;

import s30_Annotations.JsonAtribute;

import java.time.LocalDate;
import java.util.Date;

public class Producto {
    @JsonAtribute(capitalizar = true)
    private String nombre;
    @JsonAtribute
    private Long precio;
    private LocalDate fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
