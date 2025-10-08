import java.util.Scanner;
class space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xA = sc.nextInt();
        int yA = sc.nextInt();
        int wA = sc.nextInt();
        int hA = sc.nextInt();
        int xB = sc.nextInt();
        int yB = sc.nextInt();
        int wB = sc.nextInt();
        int hB = sc.nextInt();
        boolean solucion = xA >= xB + wB || xA + wA <= xB || yA >= yB + hB || yA + hA <= yB;
        System.out.print(!solucion);
        sc.close();
    }
}
