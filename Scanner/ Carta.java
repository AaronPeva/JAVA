package Scanner;
import java.util.Scanner;

class Carta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tract = sc.nextLine();
        String nom = sc.nextLine();
        String cog1 = sc.nextLine();
        String cog2 = sc.nextLine();

        System.out.print(tract + " ");
        System.out.print(cog1 + " " );
        System.out.print(cog2 + ", ");
        System.out.println(nom);
        System.out.println("");
        System.out.print("El principal objectiu de la present carta...");
    }
}
