import java.util.Scanner;


public class Lab6Task5 {
public static void main(String[] args) { Scanner input = new Scanner(System.in);

System.out.print("Enter a string: "); String s = input.nextLine();

String clean = s.replaceAll("\\s+", "").toLowerCase(); String rev = new StringBuilder(clean).reverse().toString();

if (clean.equals(rev)) {
System.out.println(s + " is a palindrome");
} else {
System.out.println(s + " is not a palindrome");
}
}
}
Output:
Enter a string: noon noon is a palindrome
