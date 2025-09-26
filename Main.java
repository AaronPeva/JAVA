import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a tu agenda de contactos, por favor seleccione una opcion:");
        System.out.println(" 1. Añadir contacto");
        System.out.println(" 2. Buscar contacto");
        System.out.println(" 3. Eliminar contacto");
        System.out.println(" 4. Actualizar un contacto");
        System.out.println(" 5. Salir");

        int opcionEscogida = sc.nextInt();

        System.out.print("Has escogido la opcion " + opcionEscogida);

        sc.close();
    }
}
