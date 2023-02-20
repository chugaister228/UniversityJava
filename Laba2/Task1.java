import java.util.*;

class Task1
{
    public static void main(String args[])
    {
        double degrees = 30;
  
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);

        System.out.println("sin(" + degrees + ") = " + sin);
        System.out.println("cos(" + degrees + ") = " + cos);
    }
}