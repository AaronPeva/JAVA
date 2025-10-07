import java.util.Scanner;
class BigBen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Z = sc.nextInt();
        int h = N + Z;
        int ht = h % 12;
        System.out.println(ht);
    }
}
