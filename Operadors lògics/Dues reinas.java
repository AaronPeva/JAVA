import java.util.Scanner;
class reinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Reina1X = sc.nextInt();
        int Reina1Y = sc.nextInt();
        int Reina2X = sc.nextInt();
        int Reina2Y = sc.nextInt();
        boolean mismaFila = Reina1Y == Reina2Y;
        boolean mismaColumna = Reina1X == Reina2X;
        int diferenciaX = Reina1X - Reina2X;
        int diferenciaY = Reina1Y - Reina2Y;
        boolean mismaDiagonal = (diferenciaX * diferenciaX == diferenciaY * diferenciaY);
        boolean solucion = (mismaFila && !mismaColumna && !mismaDiagonal) || (!mismaFila && mismaColumna && !mismaDiagonal) || (!mismaFila && !mismaColumna && mismaDiagonal);
        System.out.print(solucion);
        sc.close();
    }
}
