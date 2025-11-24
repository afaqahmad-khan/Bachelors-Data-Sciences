import java.util.Scanner;
public class Lab02_Task5 {
public static void main(String[] args) { Scanner s = new Scanner(System.in);
System.out.print("Enter total milk produced (liters): "); double total = s.nextDouble();
double capacity = 3.78;
int cartons = (int)Math.round(total / capacity); double cost = total * 0.38;
double profit = cartons * 0.27;
System.out.println("Cartons needed (rounded) = " + cartons); System.out.println("Cost of producing milk = $" +
String.format("%.2f", cost));
System.out.println("Profit = $" + String.format("%.2f", profit));
}
}
