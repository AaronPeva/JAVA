import java.util.Scanner;

class Paruales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P1 = sc.next();
        String P2 = sc.next();
        boolean Resultado = P1.equals(P2);
        System.out.print(Resultado);
        sc.close();
    }
}