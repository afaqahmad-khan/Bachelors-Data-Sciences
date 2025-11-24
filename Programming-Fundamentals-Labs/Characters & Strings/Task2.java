



import java.util.Scanner;


public class Lab7Task2 {
public static void main(String[] args) { Scanner input = new Scanner(System.in);

System.out.print("Enter an ASCII code: "); int code = input.nextInt();

if (code >= 0 && code <= 127) {
System.out.println("The character for ASCII code " + code + " is " + (char) code);
} else {
System.out.println("Invalid ASCII code");
}


input.nextLine(); System.out.print("Enter a character: "); char ch = input.nextLine().charAt(0);

System.out.println("The Unicode for character " + ch + " is " + (int) ch);
}
}
 
Output:
Enter an ASCII code: 69
The character for ASCII code 69 is E Enter a character: E
The Unicode for character E is 69

