import java.util.Scanner; public class Lab02_Task1 {
public static void main(String[] args) { Scanner input = new Scanner(System.in);
System.out.print("Enter an amount in dollars (e.g. 11.56): "); double amount = input.nextDouble();
int cents = (int)Math.round(amount * 100); int dollars = cents / 100;
cents = cents % 100;
int quarters = cents / 25; cents = cents % 25;
int dimes = cents / 10; cents = cents % 10;
int nickels = cents / 5; cents = cents % 5;
int pennies = cents; System.out.println("Dollars: " + dollars); System.out.println("Quarters: " + quarters); System.out.println("Dimes: " + dimes); System.out.println("Nickels: " + nickels); System.out.println("Pennies: " + pennies);
}
}
