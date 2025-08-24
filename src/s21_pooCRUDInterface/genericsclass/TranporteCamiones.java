package s21_pooCRUDInterface.genericsclass;

public class TranporteCamiones {

    public static <T> void imprimirDatosCamion(Camion<T> camion) {
        for (T a : camion) {
            if(a instanceof Animal) {
                System.out.println(((Animal)a).getNombre() + " es un " + ((Animal)a).getTipo());
            } else if (a instanceof Maquinaria) {
                System.out.println("Tipo de maquinaria "+ ((Maquinaria)a).getTipo());
            } else if (a instanceof Automovil) {
                System.out.println("Carro de marca " + ((Automovil)a).getMarca());
            }
        }
    }

    public static void main(String[] args) {
        Camion<Animal> camionAnimales = new Camion<>(5);
        camionAnimales.addElemento(new Animal("Joaquin", "Caballo"));
        camionAnimales.addElemento(new Animal("Pablo", "Caballo"));
        camionAnimales.addElemento(new Animal("Sombra", "Caballo"));
        camionAnimales.addElemento(new Animal("Rayo", "Caballo"));
        camionAnimales.addElemento(new Animal("Spiri", "Caballo"));

        System.out.println("CAMION DE ANIMALES");
        imprimirDatosCamion(camionAnimales);


        Camion<Maquinaria> camionMaquina = new Camion<>(3);
        camionMaquina.addElemento(new Maquinaria("Bulldozer"));
        camionMaquina.addElemento(new Maquinaria("Grua Horquilla"));
        camionMaquina.addElemento(new Maquinaria("Perforadora"));
        System.out.println("\nCAMION DE MAQUINARIA");
        imprimirDatosCamion(camionMaquina);

        Camion<Automovil> camionAutumoviles = new Camion<>(3);
        camionAutumoviles.addElemento(new Automovil("Ford"));
        camionAutumoviles.addElemento(new Automovil("Nissan"));
        camionAutumoviles.addElemento(new Automovil("Volkswagen"));

        System.out.println("\nCAMION DE AUTUMOVILES");
        imprimirDatosCamion(camionAutumoviles);
    }
}
