import java.util.Scanner;
public class Lab02_Task4 {
public static void main(String[] args) { Scanner s = new Scanner(System.in);
System.out.print("Enter minutes since midnight: "); int N = s.nextInt();
int hours = (N / 60) % 24; int minutes = N % 60;
System.out.println(hours + " " + minutes);
}
}
