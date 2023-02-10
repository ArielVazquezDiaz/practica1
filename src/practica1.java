import java.util.Scanner;
public class practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre=null;
        int numalum;
        short edad=0;
        long numtel=0;
        int i = 0;

        System.out.println("Dame la cantidad de alumnos");
        numalum=sc.nextInt();

        while (numalum>i){

            System.out.println("Ingrese su nombre");
            nombre=sc.next();
            System.out.println("Dame tu edad");
            edad=sc.nextShort();
            System.out.println("Dame tu numero de telefono");
            numtel=sc.nextLong();

            System.out.println("======================================");
            System.out.println("El Nomnre es: " + nombre);
            System.out.println("La Edad es: " + edad);
            System.out.println("El Numero de telefono es: " + numtel);
            System.out.println("======================================");

            i++;
        }
    }
}
