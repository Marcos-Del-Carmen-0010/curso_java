package s18_herencia;

import java.sql.SQLOutput;

public class Clase1A {
    public static void main(String[] args) {
        Alumno l1 = new Alumno("Luis", "Ramirez", 25, "UT", 8.8);
        // l1.setNombre("Luis");
        // l1.setApellido("Ramirez");
        // l1.setNotaJava(8.8);

        Alumno l2 = new Alumno("Marcos", "Del Carmen", 23, "UT", 8.1);
        // l2.setNombre("Marcos");
        // l2.setApellido("Del Carmen");
        // l2.setNotaJava(8.1);

        Alumno alumnos[] = {l1, l2};

        AlumnoInter l3 = new AlumnoInter("Maxim", "Kovalev", 21, "RUSIAN", 8.8, "Mosku", 8.3);
        // (String nombre, String apellido, int edad,String intitucion, double notaJava, String pais,double notaIdioma)
        // l3.setNombre("Maxim");
        // l3.setApellido("Kovalev");
        // l3.setNotaJava(9.2);
        // l3.setPais("Russia");
        // l3.setNotaIdioma(8.2);

        Profesor p1 = new Profesor();
        p1.setNombre("Juan");
        p1.setApellido("Martín");
        p1.setAsginatura("Logica de programacion en JAVA");

        System.out.println("DATOS DEL PROFESOR");
        System.out.println("Nombre completo: " + l1.getNombre() + " " + l1.getApellido());
        System.out.println("Asignatura: " + p1.getAsginatura());
        System.out.println("______________________________");
        System.out.println("DATOS DE ALUMNOS");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Nombre completo: " + alumnos[i].getNombre() + " " + alumnos[i].getApellido() + "\t\t" + "Calificacion: "+ alumnos[i].getNotaJava());
        }
        System.out.println("Nombre completo: " + l3.getNombre() + " " + l3.getApellido() + "\t\t" + "Calificacion: "+ l3.getNotaJava());
        System.out.println("País: " + l3.getPais() + " \t Nota idoma: " + l3.getNotaIdioma());
    }
}