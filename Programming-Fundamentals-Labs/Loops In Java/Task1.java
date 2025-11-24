import java.util.Scanner; public class Lab04_Task1 {
public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter A and B: "); int A = s.nextInt(), B = s.nextInt();
System.out.println("Numbers from A to B:"); if (A <= B) {
for (int i = A; i <= B; i++) System.out.print(i + " ");
} else {
for (int i = A; i >= B; i--) System.out.print(i + " ");
}
System.out.println();
}
}
