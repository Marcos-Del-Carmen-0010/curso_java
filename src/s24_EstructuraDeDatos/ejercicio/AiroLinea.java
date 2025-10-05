package s24_EstructuraDeDatos.ejercicio;

import java.util.*;

public class AiroLinea {
    public static void main(String[] args) {

        Vuelo vul1 = new Vuelo(
                "AAL 933",
                "New York",
                "Santiago",
                new Date(2025, 8, 5, 5, 20, 0),
                65);

        Vuelo vul2 = new Vuelo(
                "LAT 755",
                "San Pualo",
                "Santiago",
                new Date(2025, 8, 3, 10, 10, 0),
                42);

        Vuelo vul3 = new Vuelo(
                "SKU 876",
                "Barcelona",
                "Santiago",
                new Date(2025, 8, 2, 2, 0, 0),
                52);

        Vuelo vul4 =  new Vuelo(
                "DAL 147",
                "Bogota",
                "Santiago",
                new Date(2025, 8, 4, 5, 10, 20),
                59
        );

        Vuelo vul5 =  new Vuelo(
                "AVA 241",
                "Matrid",
                "Santiago",
                new Date(2025, 8, 8, 8, 30, 0),
                25);

        List<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(vul1);
        vuelos.add(vul2);
        vuelos.add(vul3);
        vuelos.add(vul4);
        vuelos.add(vul5);

        vuelos.sort(Comparator.comparingInt(Vuelo::getNumPasajeros));
        System.out.println("....:::::: VUELOS CON MENOS PASAJEROS ");
        System.out.println("VUELO \t\t ORIGEN \t\t\t DESTINO \t\t FECHA LLEGADA \t\t\t\t\t NUMERO DE PASAJEROS");
        vuelos.forEach((v) -> {
            System.out.println(v.getNombre() + " |\t " + v.getOrigen() + " \t\t\t| " + v.getDestino()+ " |\t " + v.getFechaLlegada() + " |\t " + v.getNumPasajeros());
        });

        vuelos.sort(Comparator.comparing(Vuelo::getFechaLlegada));
        System.out.println("....:::::: VUELOS PROXIMOS");
        System.out.println("VUELO \t\t ORIGEN \t\t\t DESTINO \t\t FECHA LLEGADA \t\t\t\t\t NUMERO DE PASAJEROS");
        vuelos.forEach((v) -> {
            System.out.println(v.getNombre() + " |\t " + v.getOrigen() + " \t\t\t| " + v.getDestino()+ " |\t " + v.getFechaLlegada() + " |\t " + v.getNumPasajeros());
        });
    }
}
