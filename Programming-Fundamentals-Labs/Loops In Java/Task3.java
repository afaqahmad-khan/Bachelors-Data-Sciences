import java.util.Scanner; public class Lab04_Task2 {
public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter n: ");
int n = s.nextInt(); long fact = 1;
for (int i = 1; i <= n; i++) fact *= i; System.out.println("Factorial = " + fact);
}
}
