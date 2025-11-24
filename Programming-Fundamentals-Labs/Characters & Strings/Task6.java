import java.util.Scanner;


public class Lab6Task6 {
public static void main(String[] args) { Scanner input = new Scanner(System.in); System.out.print("Input: ");
String line = input.nextLine();


String[] parts = line.split(" ", 2);


if (parts.length == 2) { System.out.println(parts[1] + " " + parts[0]);
} else {
System.out.println("Invalid input");
}
}
}
Output:
Input: Hello, world! world! Hello,
