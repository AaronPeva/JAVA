import java.util.Scanner;

class Contractar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean java = sc.nextBoolean();
        int experiencia = sc.nextInt();
        boolean phyton = sc.nextBoolean();
        int experiencia2 = sc.nextInt();
       
    
        boolean solucion = java && experiencia >=1 || phyton && experiencia2 >=3;
        System.out.println(solucion);
        sc.close();
    }
}