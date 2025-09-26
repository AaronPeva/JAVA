import java.util.Scanner;
class Autobuses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int r1 = c * b;
        int r2 = c * a;
        int r3 = r1 + r2;

        System.out.print(r3);
        sc.close();
    }
}