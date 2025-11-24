import java.util.Scanner;
public class Lab02_Task6 {
public static void main(String[] args) { Scanner s = new Scanner(System.in);
System.out.print("Enter pay rate per hour: "); double payRate = s.nextDouble(); System.out.print("Enter hours worked per week: "); double hoursPerWeek = s.nextDouble();
int weeks = 5;
double incomeBefore = payRate * hoursPerWeek * weeks; double incomeAfterTax = incomeBefore * (1 - 0.14); double clothes = incomeAfterTax * 0.10;
double supplies = incomeAfterTax * 0.01;
double remaining = incomeAfterTax - clothes - supplies; double savings = remaining * 0.25;
double parents = savings * 0.50; System.out.println("Income before tax = $" +
String.format("%.2f", incomeBefore)); System.out.println("Income after tax = $" +
String.format("%.2f", incomeAfterTax)); System.out.println("Money spent on clothes = $" +
String.format("%.2f", clothes));
System.out.println("Money spent on school supplies = $" + String.format("%.2f", supplies));
System.out.println("Money spent on savings bonds = $" + String.format("%.2f", savings));
System.out.println("Money parents spend on bonds = $" + String.format("%.2f", parents));
}
}
