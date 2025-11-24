import java.util.Scanner; public class Lab01_Task2 {
public static void main(String[] args) { Scanner console = new Scanner(System.in); System.out.print("Enter the length: "); int length = console.nextInt(); System.out.print("Enter the width: "); int width = console.nextInt();
int area = length * width;
int perimeter = 2 * (length + width); System.out.println("Area = " + area); System.out.println("Perimeter = " + perimeter);
}
}
