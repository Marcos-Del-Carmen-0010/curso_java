package s24_EstructuraDeDatos.ejercicio;

import java.util.Date;

public class Vuelo{
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private int numPasajeros;

    public Vuelo() {
    }

    public Vuelo(String nombre, String origen, String destino, Date fechaLlegada, int numPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.numPasajeros = numPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }
}
