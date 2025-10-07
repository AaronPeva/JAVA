import java.util.Scanner;
class senars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        boolean solucion = numero % 2 == 1;
        boolean solucion2 = numero2 % 2 == 1;
        boolean solucion3 = numero3 % 2 == 1;
        boolean solucion4 = (solucion && solucion2 && solucion3) || (!solucion && !solucion2 && !solucion3);
        System.out.println(solucion4);
        sc.close();
    }
}
