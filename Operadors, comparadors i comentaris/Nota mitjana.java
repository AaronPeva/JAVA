import java.util.Scanner;
class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();


        float NT = N1 + N2 + N3;
        float NF = NT / 3;

        System.out.print(NF);
        sc.close();
    }
}