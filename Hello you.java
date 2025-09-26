import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();
        System.out.print("Hola ");
        System.out.print(nom);
        System.out.println("!");
    }
}
