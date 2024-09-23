import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws Exception {
        //cambios

        Scanner scannerRef = new Scanner(System.in);

        int anioActual, anioNac;


        System.out.println("Escriba el año actual: ");
        anioActual = scannerRef.nextInt();

        System.out.println("Escriba su año de nacimiento: ");
        anioNac = scannerRef.nextInt();

        int edad = anioActual - anioNac;
        System.out.printf("Su edad es de %d años.\n", edad);

        scannerRef.close();




        /*
         

        anioActual = LocalDate.now().getYear();
        System.out.println("Estamos en: ",+ anioActual);
        System.out.println("Escriba su año de nacimiento: ");
        anioNac = scannerRef.nextInt();
        int edad = anioActual - anioNac;
        System.out.printf("Su edad es: %d años", edad);
        
         */

    }
}
