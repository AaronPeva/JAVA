import java.util.Scanner;

class Paella {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer datos de entrada
        int comensales = scanner.nextInt();
        float precioArrosPorKg = scanner.nextFloat();
        float precioGambasPorKg = scanner.nextFloat();
        
        // Calcular cantidades necesarias
        // Por cada 4 personas: 0.5 kg arroz y 0.25 kg gambas
        float kgArros = (comensales * 0.5f) / 4.0f;
        float kgGambas = (comensales * 0.25f) / 4.0f;
        
        // Calcular costos
        float costoArros = kgArros * precioArrosPorKg;
        float costoGambas = kgGambas * precioGambasPorKg;
        float costoTotal = costoArros + costoGambas;
        
        // Mostrar resultados
        System.out.println(kgArros + " kg arros");
        System.out.println(kgGambas + " kg gambes");
        System.out.println(costoArros + " euros arros");
        System.out.println(costoGambas + " euros gambes");
        System.out.println("TOTAL: " + costoTotal + " euros");
        
        scanner.close();
    }
}