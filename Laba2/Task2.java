import java.util.*;
import java.util.Scanner;

class Task2
{
    public static void main(String args[])
        {
            System.out.println("Value: ");
            Scanner sc = new Scanner(System.in);
            double degrees = sc.nextDouble();
    
            double radians = Math.toRadians(degrees);
            double sin = Math.sin(radians);
            double cos = Math.cos(radians);

            System.out.println("sin(" + degrees + ") = " + sin);
            System.out.println("cos(" + degrees + ") = " + cos);
        }
}