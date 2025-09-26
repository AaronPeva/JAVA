package Scanner;
import java.util.Scanner;
class Codi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nom1 = sc.next();
        String tip1= sc.nextLine();
        
        String nom2 = sc.next();
        String tip2= sc.nextLine();
        
        String nom3 = sc.next();
        String tip3= sc.nextLine();
        
        String nom4 = sc.next();
        String tip4 = sc.nextLine();
        
        System.out.println(tip4 + " " + nom4);
        System.out.println(tip3 + " " + nom3);
        System.out.println(tip2 + " " + nom2);
        System.out.println(tip1 + " " + nom1);
        sc.close();
    }
}