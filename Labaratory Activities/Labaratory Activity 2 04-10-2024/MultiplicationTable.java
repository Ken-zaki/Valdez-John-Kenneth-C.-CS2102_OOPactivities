import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        int [][] table = new int [size + 1][size + 1];
        System.out.println("Multiplication Table:");

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++){ 
                table[i][j] = i * j;
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}
