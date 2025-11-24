import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr1[] = new int[10];
        int arr2[] = new int[10];

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr1[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            arr2[i] = arr1[9 - i];
        }

        System.out.println("Reversed Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}