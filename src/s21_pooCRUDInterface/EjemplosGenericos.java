package s21_pooCRUDInterface;

import s21_pooCRUDInterface.Modelo.Cliente;
import s21_pooCRUDInterface.Modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemplosGenericos {
    public static void main(String[] args) {
        List clientesSoftura = new ArrayList();
        clientesSoftura.add(new Cliente("Marcos", "Del Carmen"));
        clientesSoftura.add(new Cliente("Brenda", "Vazquez"));
        clientesSoftura.add(new Cliente("Briseida", "Garcia"));
        clientesSoftura.add(new Cliente("Yair", "Sánchez"));
        clientesSoftura.add(new Cliente("Govanny", "Benites"));

        clientesSoftura.forEach(System.out::println);

        Integer[] enteros = {23, 34, 56, 81};
        String[] nombres = {"Marcos", "Brenda", "Yair", "Govanny", "Briseida"};
        List<String> nombresList = fromArrayToList(nombres);
        nombresList.forEach(System.out::println);

        List<String> listaClientes = fromArrayToList(nombres, enteros);
        listaClientes.forEach(System.out::println);

        List<ClientePremium> clientesPremium = fromArrayToList(new ClientePremium[]{
                new ClientePremium("Emilio", "Sánchez"),
                new ClientePremium("Hernezto", "Perez"),
                new ClientePremium("Panfilo", "Garcia"),
        });

        imprimirClientes(clientesPremium);
        imprimirClientes(clientesSoftura);


        System.out.println("===== MAXIMO DE TRES DATOS");
        System.out.println("¿Cual es mayor? \n 1, 28, 10 \n> " + maximo(1,28,10));
        System.out.println("¿Cual es mayor? \n 1.2, 8.2, 11.23 \n> " + maximo(1.2, 8.2, 11.23));
        System.out.println("¿Cual es mayor? \n zanahoria, calabaza, pepino\n> " + maximo("zanahoria", "calabaza", "pepino"));

    }

    public static <T> List<T> fromArrayToList(T[] array) {
        System.out.println("===== CONVERSION DE ARREGLO A LISTA CON UNO TIPO");
        return Arrays.asList(array);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] array) {
        System.out.println("===== CONVERSION DE ARREGLO A LISTA CON UNO TIPO NUMERICO");
        return Arrays.asList(array);
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] array) {
        System.out.println("===== CONVERSION DE ARREGLO A LISTA CON UNO TIPO CLIENTE Y COMPARABLE");
        return Arrays.asList(array);
    }

    public static <T, G> List<T> fromArrayToList(T[] array, G[] x) {
        System.out.println("===== CONVERSION DE ARREGLO A LISTA CON DOS TIPOS ");
        for (G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(array);
    }

    public static void imprimirClientes(List <? extends Cliente> clientes) {
        System.out.println("IMPRIMIR CLIENTES DE " + clientes.getClass().getSimpleName());
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if(b.compareTo(max) > 0) {
            max = b;
        }

        if(c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
}


