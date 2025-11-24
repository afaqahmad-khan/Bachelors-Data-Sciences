import java.util.Scanner; public class Lab05_Task2 {
public static void main(String[] args) { Scanner s = new Scanner(System.in); int count = 0;
while (true) {
int n = s.nextInt(); if (n == 0) break;
if (n % 2 == 0) count++;
}
System.out.println("Even numbers: " + count);
}
}
