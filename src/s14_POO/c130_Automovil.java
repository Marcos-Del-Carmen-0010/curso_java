package s14_POO;

import java.util.Arrays;

public class c130_Automovil {

    public static void main(String[] args) {

        // OBJETO DE PERSONA 1
        Motor mot1 = new Motor(3000, TipoMotor.SEDAN);
        Estanque est1 = new Estanque(100);
        Persona per1 = new Persona("Marcos", "Del Carmen");

        Rueda[] ruedas1 = {
                new Rueda("Mustan", 19, 8.1),
                new Rueda("Mustan", 19, 8.1),
                new Rueda("Mustan", 19, 8.1),
                new Rueda("Mustan", 19, 8.1)
        };
        Automovil car1 = new Automovil("Mustang","Shelby", Color.ROJO, mot1, est1, per1);
        car1.setRuedas(ruedas1);
        car1.setAtributos(TipoMotor.COUPE);


        // OBJETO DE PERSONA 2
        Motor mot2 = new Motor(3000, TipoMotor.WATCHBACK);
        Estanque est2 = new Estanque(120);
        Persona per2 = new Persona("Qennia", "Barrera");
        Automovil car2 = new Automovil("Nissan","Skyline",  Color.VERDE, mot2, est2, per2);
        Rueda[] ruedas2 = new Rueda[5];
        for (int i = 0; i < ruedas2.length; i++) {
            car2.addRueda(new Rueda("Yokohama", 16, 7.5));
        }
        car2.setAtributos(TipoMotor.FURGON);

        // OBJETO DE PERSONA 3
        Motor mot3 = new Motor(3000, TipoMotor.COUPE);
        Estanque est3 = new Estanque(150);
        Persona per3 = new Persona("Kenedy", "Vázquez");
        Automovil car3 = new Automovil("Dodge","Charger",  Color.MORADO, mot3, est3, per3);
        Rueda[] ruedas3 = new Rueda[5];
        for (int i = 0; i < ruedas3.length; i++) {
            car3.addRueda(new Rueda("Michelin", 18, 10.5));
        }
        car3.setAtributos(TipoMotor.PICKUP);

//        System.out.println(car1.detalle());
//        System.out.println("------------------");
//        System.out.println(car2.detalle());
//        System.out.println("------------------");
//        System.out.println(car3.detalle());
//        System.out.println("------------------");

        System.out.println("- - - - - CICLO FOR - - - - -");
        Automovil[] autos = new Automovil[3];
        autos[0] = car1;
        autos[1] = car2;
        autos[2] = car3;

        Arrays.sort(autos);

        for(int i = 0; i < autos.length; i++) {
            System.out.println(autos[i].toString());
        }
    }
}
