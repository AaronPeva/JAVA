import java.util.Scanner;

class Llums {
 public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean llums = sc.nextBoolean();
      boolean llums2 = sc.nextBoolean();
      boolean llums3 = sc.nextBoolean();
      boolean llums4 = sc.nextBoolean();
      boolean solucion =  !llums && !llums2 && !llums3 && !llums4;
      System.out.println(solucion);
      sc.close();
    }
}
