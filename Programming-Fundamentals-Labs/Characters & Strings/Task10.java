import java.util.Scanner;


public class Lab6Task10 {
public static void main(String[] args) { Scanner input = new Scanner(System.in); System.out.print("Input: ");
String s = input.nextLine();


System.out.println(s.charAt(2)); System.out.println(s.charAt(s.length() - 2)); System.out.println(s.substring(0, Math.min(5, s.length()))); System.out.println(s.substring(0, s.length() - 2));

for (int i = 0; i < s.length(); i += 2)
 
System.out.print(s.charAt(i)); System.out.println();

for (int i = 1; i < s.length(); i += 2) System.out.print(s.charAt(i));
System.out.println();


System.out.println(new StringBuilder(s).reverse());


for (int i = s.length() - 1; i >= 0; i -= 2) System.out.print(s.charAt(i));
System.out.println(); System.out.println(s.length());
}
}
Output: Input: Hello l
l Hello Hel Hlo el olleH olH 5
