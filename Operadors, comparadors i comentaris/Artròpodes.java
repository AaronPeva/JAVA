import java.util.Scanner;
class Artròpodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = sc.nextInt();
        int S1 = sc.nextInt();

        int f = sc.nextInt();
        int S2 = sc.nextInt();

        int I = 6 * a;
        int A = 8 * b;
        int C = 10 * c;
        int M1 = 2 * d * S1;
        int M2 = 4 * f * S2;

        System.out.print(I + A + C + M1 + M2);
        sc.close();
    }
}