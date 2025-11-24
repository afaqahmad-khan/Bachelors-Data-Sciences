import java.util.Scanner;
public class Lab02_Task2 {
public static void main(String[] args) { Scanner s = new Scanner(System.in);
System.out.print("Enter number of students (N) and apples (K):
 
");
 

int N = s.nextInt(); int K = s.nextInt(); int perStudent = K / N; int remaining = K % N;
System.out.println("Each student gets: " + perStudent); System.out.println("Apples remain in the basket: " +
 
remaining);
}
}
