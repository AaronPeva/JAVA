import java.util.Locale;
import java.util.Scanner;

class suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String palabra = sc.nextLine();
        char a = palabra.charAt(0);
        char b = palabra.charAt(1);
        char c = palabra.charAt(2);
        char d = palabra.charAt(3);
        char e = palabra.charAt(4);
        int A = (int) a; 
        int B = (int) b; 
        int C = (int) c; 
        int D = (int) d; 
        int E = (int) e; 
        System.out.print(A + B + C + D + E);
        sc.close();
    }
}
