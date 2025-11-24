
      import java.util.Scanner;

public class LabTask2 {

    public static void modify(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 3;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        modify(arr);

        System.out.println("Modified array (each multiplied by 3):");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}