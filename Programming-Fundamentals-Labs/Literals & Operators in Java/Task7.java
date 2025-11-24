import java.util.Scanner;
public class Lab02_Task7 {
public static void main(String[] args) { Scanner s = new Scanner(System.in);
System.out.print("Enter tickets sold for Class A, B, C and D:
 
");


 

int a = s.nextInt(); int b = s.nextInt(); int c = s.nextInt(); int d = s.nextInt(); int incomeA = a * 20; int incomeB = b * 15; int incomeC = c * 10; int incomeD = d * 5;
int total = incomeA + incomeB + incomeC + incomeD; System.out.println("Income from Class A: $" + incomeA); System.out.println("Income from Class B: $" + incomeB); System.out.println("Income from Class C: $" + incomeC); System.out.println("Income from Class D: $" + incomeD); System.out.println("Total income = $" + total);

}
}