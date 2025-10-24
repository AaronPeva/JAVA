import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Bienvenido a tu agenda de contactos, por favor seleccione una opcion:");
      System.out.println(" 1. Añadir contacto");
      System.out.println(" 2. Buscar contacto");
      System.out.println(" 3. Eliminar contacto");
      System.out.println(" 4. Actualizar un contacto");
      System.out.println(" 5. Salir");
      int var2 = var1.nextInt();
      System.out.print("Has escogido la opcion " + var2);
      var1.close();
   }
}