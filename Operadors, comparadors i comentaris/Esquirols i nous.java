import java.util.Scanner;
class EsquirolsNous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int e = sc.nextInt();
        int n = sc.nextInt();

        int resultado = n % e;

        System.out.print(resultado);
        sc.close();
    }
}