import java.util.Locale;
import java.util.Scanner;

class Inicials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String nombre = sc.next();
        String apellido = sc.next();
        char a = nombre.charAt(0);
        char b = apellido.charAt(0);
        char c = Character.toUpperCase(a);
        char d = Character.toUpperCase(b);
        System.out.print(c);
        System.out.print(d);
        sc.close();
    }
}
