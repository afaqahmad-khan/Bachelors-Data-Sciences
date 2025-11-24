import java.util.Scanner;


public class Lab7Task3 {
public static void main(String[] args) { Scanner input = new Scanner(System.in);

System.out.print("Enter a decimal value (0 to 15): "); int val = input.nextInt();

if (val >= 0 && val <= 15) {
System.out.println("The hex value is " + Integer.toHexString(val).toUpperCase());
} else {
System.out.println("Invalid input");
}


input.nextLine(); System.out.print("Enter a hex digit: ");
String hex = input.nextLine().toUpperCase();
 
if (hex.matches("[0-9A-F]")) {
int number = Integer.parseInt(hex, 16);
System.out.println("The binary value is " + Integer.toBinaryString(number));
} else {
System.out.println(hex + " is an invalid input");
}
}
}
Output:
Enter a decimal value (0 to 15): 11 The hex value is B
Enter a hex digit: B
The binary value is 1011
