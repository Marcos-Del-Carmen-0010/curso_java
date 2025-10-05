package s29_Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class t35_calcularEdad {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Hoy estamos a " + hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.print("Ingresa tu fecha de nacimiento \n>");
            String fechaNacimientoStr = entrada.nextLine();

            LocalDate fechaNacimientoDate = LocalDate.parse(fechaNacimientoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Period periodo = Period.between(fechaNacimientoDate, hoy);
            System.out.printf("Tienes %d años con %d días", periodo.getYears(), periodo.getDays());
        } catch (Exception e){
            System.out.println("Error al ingresar el fecha de nacimiento");
        }
    }
}
