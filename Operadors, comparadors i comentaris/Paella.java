import java.util.Scanner;
import java.util.Locale;
class Paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        
        int C = sc.nextInt();
        float A = sc.nextFloat(); 
        float G = sc.nextFloat(); 
        
     
        float kg_arroz = (C / 4.0f) * 0.5f;
        float kg_gambas = (C / 4.0f) * 0.25f;
        
    
        float costo_arroz = kg_arroz * A;
        float costo_gambas = kg_gambas * G;
        float costo_total = costo_arroz + costo_gambas;
        
        System.out.println(kg_arroz + " kg arros");
        System.out.println(kg_gambas + " kg gambes");
        System.out.println(costo_arroz + " euros arros");
        System.out.println(costo_gambas + " euros gambes");
        System.out.println("TOTAL: " + costo_total + " euros");
        
        sc.close();
    }
}