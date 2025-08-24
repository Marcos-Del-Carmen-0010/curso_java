package s18_herencia.compania;

public class Compania {
    public static void main(String[] args) {
        Gerente ge1 = new Gerente("Gerardo", "Sánchez Hernandez", "SHG101091", 40000d);
        System.out.println(ge1.toString());

        Empleado em1 = new Empleado("Marcos", "Del Carmen", "SDM091001ABC", 12000d);
        em1.aumentarRemuneracion(0);
        System.out.println(em1.toString());

        Empleado em2 = new Empleado("Hannia Magdalena", "Martinez Casarrubias", "MCHM072201XYZ", 14000d);
        em2.aumentarRemuneracion(90);

        System.out.println(em2.toString());

        Cliente cl1 = new Cliente("Daniel" ,"Torres", "TGD101098AJK");
        System.out.println(cl1.toString());
    }
}
