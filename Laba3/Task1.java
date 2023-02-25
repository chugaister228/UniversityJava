import java.util.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        
        System.out.println("Value: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int b = Integer.parseInt(x);

        for ( int i = 0; i < b; i++ ) {

            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c + ": ");

            switch ( c ) {
                case 'a': case 'e': case 'i':
                case 'o': case 'u':
                System.out.println("гласная");
                break;
                case 'y': case 'w':
                System.out.println("иногда гласная");
                break;
                default:
                System.out.println("согласная");
            }
        }
    }
   }
   