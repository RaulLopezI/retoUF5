import java.util.ArrayList;
import java.util.Scanner;
 
public class Start {
 
    public static void main(String[] args) {
 
        int d = 0;
        int numEmpleados = 0;
        Scanner datos = new Scanner(System.in);
        String empleado;
        float sueldo;
        float salarioTotal = 0;
        float salarioMedio = 0;
        
        ArrayList<String> empleados = new ArrayList<>();
        ArrayList<Float> sueldos = new ArrayList<>();
 
        System.out.println("Introduzca el número de empleados: ");
 
        try {
        	numEmpleados = datos.nextInt();
        } catch (Exception e) {
            System.out.println("Valor introducido incorrecto, debe introducir un numero");
        }
 
        if (numEmpleados > 0) {
 
            for (d = 0; d < numEmpleados; d++) {
                System.out.println("\n- Introduzca el nombre del empleado " + (d + 1) + ": ");
                empleado = datos.next();
                empleados.add(empleado);
 
                System.out.println("- Introduzca el salario de " + empleados.get(d));
                try {
                    sueldo = datos.nextFloat();
                    sueldos.add(sueldo);
                    salarioTotal = salarioTotal + sueldos.get(d);
                } catch (Exception e) {
                    System.out.println("Valor introducido incorrecto, debe introducir un número");
                    System.out.println("Revise los valores obtenidos en la media");
                }
            }
            for(d=0;d<numEmpleados;d++) {
                System.out.println(">> Empleado: " + empleados.get(d) + " || Salario: " + sueldos.get(d));
            }
 
            salarioMedio = salarioTotal / empleados.size();
            if (salarioMedio > 0) {
                System.out.printf("\n<< La media de salarios es de: %.2f ", salarioMedio);
                System.out.println(">>");
            }
 
        } else {
            System.out.println("Valor introducido erroneo, debe ser mayor que 0");
        }
 
    }
}