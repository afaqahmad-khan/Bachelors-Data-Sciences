import java.util.Scanner; public class Lab05_Task3 {
public static void main(String[] args) { Scanner s = new Scanner(System.in); int prev = s.nextInt();
int count = 0; while (true) {
int n = s.nextInt(); if (n == 0) break;
if (n > prev) count++; prev = n;
}
System.out.println("Numbers greater than previous: " + count);
}
}
