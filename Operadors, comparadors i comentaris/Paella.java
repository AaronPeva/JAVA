import java.util.Scanner;

class Paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int C = sc.nextInt(); // Comensals cantidad
        float A = sc.nextFloat(); // Arroz precio kg
        float G = sc.nextFloat(); // Gambas precio kg
        
        // Calcular cantidades necesarias
        // Por cada 4 personas: 0.5 kg arroz, 0.25 kg gambas
        float kg_arroz = (C / 4.0f) * 0.5f;
        float kg_gambas = (C / 4.0f) * 0.25f;
        
        // Calcular costos
        float costo_arroz = kg_arroz * A;
        float costo_gambas = kg_gambas * G;
        float costo_total = costo_arroz + costo_gambas;
        
        // Imprimir resultados con formato correcto
        System.out.println(formatNumber(kg_arroz) + " kg arros");
        System.out.println(formatNumber(kg_gambas) + " kg gambes");
        System.out.println(formatNumber(costo_arroz) + " euros arros");
        System.out.println(formatNumber(costo_gambas) + " euros gambes");
        System.out.println("TOTAL: " + formatNumber(costo_total) + " euros");
        
        sc.close();
    }
    
    // Función para formatear números (eliminar .0 innecesario)
    public static String formatNumber(float num) {
        if (num == (int)num) {
            return String.valueOf((int)num);
        } else {
            return String.valueOf(num);
        }
    }
}