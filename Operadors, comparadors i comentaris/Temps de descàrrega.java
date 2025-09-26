import java.util.Scanner;
class Temps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int KBs = sc.nextInt();
        int MBt = sc.nextInt();

        int MB = MBt * 1024;
        
        System.out.print(MB / KBs);
        sc.close();
    }
}
