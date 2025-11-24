import java.util.Scanner;


public class Lab6Task8 {
public static void main(String[] args) { Scanner input = new Scanner(System.in);

System.out.print("Input: "); String s = input.nextLine();

int first = s.indexOf('h'); int last = s.lastIndexOf('h');

if (first != -1 && last != -1 && first < last) { System.out.println(s.substring(0, first) + s.substring(last + 1));
} else {
System.out.println(s);
}
}
}
Output:
Input: In the hole in the ground there lived a hobbit In tobbit
