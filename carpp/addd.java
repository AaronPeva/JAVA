package carpp;
import java.util.Scanner;
class notacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a += 96;
        char re = (char)a;
        System.out.print("" + (char)(a) + b);
        System.out.print(re); 
        sc.close();
    }
}
