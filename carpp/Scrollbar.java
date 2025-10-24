package carpp;
import java.util.Locale;
import java.util.Scanner;

class Scrollbar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float flechas = c * 2;
        float thumbSpace = a - flechas;
        float thumbHeight = (a * thumbSpace) / b;
        float hidden = b - a;
        float blanco = thumbSpace - thumbHeight;
        float scroll = hidden / blanco;
        System.out.println((int)thumbHeight);
        System.out.println((int)scroll);
        sc.close();
    }
}
