package s23_manejoDeExepciones;

import javax.swing.*;

public class c225_ExepcionesNoComprobadas {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String strNumerador = JOptionPane.showInputDialog("Ingrese el valor del numerador");
        String strDivisor = JOptionPane.showInputDialog("Ingrese el valor del divisor");
        double divicion = 0;
        try {

            //int num = Integer.parseInt(valor);
            //divicion = cal.dividir(10, num);
            divicion = cal.dividir(strNumerador, strDivisor);
            System.out.println(divicion);
        } catch (NumberFormatException nf) {
            System.out.println("se detetecto una exepcion al no colocar un número " + nf.getMessage());
            main(args);
        } catch (DivicionPorZeroException ae) {
            System.out.println("Se detecto una excepción al dividir entre 0 " + ae.getMessage());
            main(args);
        } catch (FormatoNumeroException fn) {
            System.out.println("Se detecto una acepción: " + fn.getMessage());
            fn.printStackTrace(System.out);
        }
        finally {
            System.out.println("Este bloque es opcionar siempre se ejecuta");
        }
        System.out.println("El resulatdo es: " + divicion);
        System.out.println("segimos con la ejecución normal");
    }
}
