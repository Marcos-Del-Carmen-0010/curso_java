package s14_POO;

public enum TipoMotor {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 4),
    WATCHBACK("Watchback", "Auto compacto", 4),
    PICKUP("Copue","auto pequeño", 4),
    COUPE("Convertible", "Auto deportivo", 4),
    FURGON("Furgon", "Auto utilitario", 4);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuerta;

    TipoMotor(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuerta = numeroPuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }
}
