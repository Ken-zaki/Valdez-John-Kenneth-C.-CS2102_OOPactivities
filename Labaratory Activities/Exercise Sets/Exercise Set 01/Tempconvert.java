import java.util.Scanner;

public class Tempconvert {
    public static void main (String[] args ){
     Scanner scanner = new Scanner (System.in);

     String m = "Celcius to Fahrenheit";
     System.out.println(m);

     System.out.println("Enter Calculus Value: ");
     float value = scanner.nextFloat();
     
     float F = value * 9/5 + 32;
     System.out.println(value + " Celcius is " + F + " Fahremheit");
     scanner.close();
    }
}