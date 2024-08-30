import java.util.Scanner;

public class Welcome{
    public static void main (String[] args ){
        String var_Welcome = "Welcome to CS 211: Object - Oriented Programming!";
        String var_Greet = "This Course will be fun ";
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(var_Welcome);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
    
        System.out.println(var_Greet + name);

        scanner.close();
    }
}