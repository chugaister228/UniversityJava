import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Введіть довжину першого катету: ");
        double a = input.nextDouble();
        
        System.out.print("Введіть довжину другого катету: ");
        double b = input.nextDouble();
        
        double c = Math.hypot(a, b);
        double alpha = Math.toDegrees(Math.asin(a / c));
        double beta = 90 - alpha;
        
        System.out.printf("Кут альфа: %.2f градусів\n", alpha);
        System.out.printf("Кут бета: %.2f градусів\n", beta);
    }
}
