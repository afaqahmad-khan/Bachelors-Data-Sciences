import java.util.Scanner; public class Lab03_Task4 {
public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter two integers: "); int a = s.nextInt();
int b = s.nextInt();
System.out.println("Minimum of two numbers: " + Math.min(a,
 
b));

}
 

System.out.print("Enter integer for sign test: "); int x = s.nextInt();
if (x > 0) System.out.println("1");
else if (x < 0) System.out.println("-1"); else System.out.println("0"); System.out.print("Enter three integers: ");
int p = s.nextInt(), q = s.nextInt(), r = s.nextInt(); int min = Math.min(p, Math.min(q, r)); System.out.println("Minimum of three: " + min);
 
}
