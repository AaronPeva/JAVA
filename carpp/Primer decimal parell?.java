package carpp;
import java.util.Scanner;
class primer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        a *= 10;
        a %= 10;
        boolean re = a % 2==0;
        System.out.print(re); 
        sc.close();
    }
}