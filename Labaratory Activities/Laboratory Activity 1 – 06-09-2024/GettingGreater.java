import java.util.Scanner;

public class GettingGreater {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Getting the Greater Value"); 

        System.out.println("Enter first character: ");
        char chValue = scanner.next().charAt(0);

        System.out.println("Enter second character: ");
        char chValue2 = scanner.next().charAt(0);

        char maxValue = (char) Math.max(chValue, chValue2);

        System.out.println("----------------------------------------");
        System.out.println("The character with the greater value is : " + maxValue);
        System.out.println("----------------------------------------");
        System.out.println("Showing the ASCII Codes");
        System.out.println(chValue + " : " + (int)chValue);
        System.out.println(chValue2 + " : " + (int)chValue2);

        scanner.close();
    }
}
