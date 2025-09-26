package Scanner;
import java.util.Scanner;
class Contractar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();
        sc.nextLine();  
        sc.nextLine();  
        sc.nextLine();  
        String tipo = sc.nextLine();
        System.out.print("El formulari de " + nom + " s'ha completat. Et contactarem si necessitem un xef de cuina " + tipo + ".");

    }
}