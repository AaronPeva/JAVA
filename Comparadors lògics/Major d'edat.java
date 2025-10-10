import java.util.Scanner;

class edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        boolean r = edad >= 18;
        System.out.print(r);
        sc.close();
    }
}