import java.util.Scanner;
public class Lab02_Task3 {
public static void main(String[] args) { Scanner s = new Scanner(System.in);
System.out.print("Enter students in class A, B and C: "); int a = s.nextInt();
int b = s.nextInt(); int c = s.nextInt();
int desks = (a + 1) / 2 + (b + 1) / 2 + (c + 1) / 2; System.out.println("Minimum number of desks = " + desks);
}
}
