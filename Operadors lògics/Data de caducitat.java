import java.util.Locale;
import java.util.Scanner;

class caducitat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int año = sc.nextInt();
        int dia2 = sc.nextInt();
        int mes2 = sc.nextInt();
        int año2 = sc.nextInt();
        boolean añoC = año > año2;
        boolean añoC2 = año == año2;
        boolean mesC = mes > mes2;
        boolean mesC2 = mes == mes2;
        boolean diaC = dia > dia2;
        boolean caducitat = añoC || añoC2 && mesC || añoC2 && mesC2 && diaC;
        System.out.println(!caducitat);
        sc.close();
    }
}

