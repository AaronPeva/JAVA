import java.util.Scanner;

class llibres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int N = sc.nextInt();
        boolean r = P * Q * R >= N;
        System.out.print(r);
        sc.close();
    }
}
