import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ratings[] = new int[10];
        int sum = 0;

        System.out.println("Enter 10 ratings (1 to 10):");
        for (int i = 0; i < 10; i++) {
            ratings[i] = input.nextInt();
            sum += ratings[i];
        }

        double average = sum / 10.0;

        int max = ratings[0];
        int min = ratings[0];

        for (int i = 1; i < 10; i++) {
            if (ratings[i] > max) max = ratings[i];
            if (ratings[i] < min) min = ratings[i];
        }

        System.out.println("\n--- Summary of Poll ---");
        System.out.println("Average Rating: " + average);
        System.out.println("Highest Rating: " + max);
        System.out.println("Lowest Rating: " + min);
    }
}
      