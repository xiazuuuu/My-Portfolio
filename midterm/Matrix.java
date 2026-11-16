import java.util.Scanner;
 
public class Matrix {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        char again;
 
        do {
 
            int[][] num = new int[3][3];
            int[] rowSum = new int[3];
            int[] colSum = new int[3];
 
            int diagonal1 = 0;
            int diagonal2 = 0;
 
            System.out.println("Input 9 elements:");
 
            // Input 9 elements
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    num[i][j] = input.nextInt();
                }
            }
 
            // Calculate row and column sums
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    rowSum[i] += num[i][j];
                    colSum[j] += num[i][j];
                }
            }
 
            // Calculate diagonal sums
            for (int i = 0; i < 3; i++) {
                diagonal1 += num[i][i];
                diagonal2 += num[i][2 - i];
            }
 
            // Display matrix and row sums
            System.out.println("\nDisplay Here are the Numbers and the required outputs:");
 
            System.out.println("-----------------------------------------");
            System.out.printf("%15s %10s\n", "", "Row Sum");
 
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%10d", num[i][j]);
                }
 
                System.out.printf("%10d\n", rowSum[i]);
            }
 
            // Display column sums
            System.out.println();
 
            System.out.printf("%-10s", "Column sum:");
 
            for (int j = 0; j < 3; j++) {
                System.out.printf("%10d", colSum[j]);
            }
 
            // Display diagonal sums
            System.out.println("\n");
            System.out.println("-----------------------------------------");
            System.out.println("Diagonal sum 1: " + diagonal1);
            System.out.println("Diagonal sum 2: " + diagonal2);
 
            // Ask user to try again
            System.out.print("\nTry Again [y/n]: ");
            again = input.next().charAt(0);
 
        } while (again == 'y' || again == 'Y');
 
        input.close();
    }
}