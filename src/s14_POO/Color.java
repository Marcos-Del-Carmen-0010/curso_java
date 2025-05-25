package s14_POO;

public enum Color {
    AMARRILLO("Amarillo"),
    AZUL("Azul"),
    NEGRO("Negro"),
    GRIS("Gris"),
    ROJO("Rojo"),
    VERDE("Verde"),
    MORADO("Morado");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
