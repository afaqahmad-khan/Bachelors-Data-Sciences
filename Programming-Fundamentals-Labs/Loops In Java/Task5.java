import java.util.Scanner; public class Lab04_Task5 {
public static void main(String[] args) { Scanner s = new Scanner(System.in); int max = Integer.MIN_VALUE;
while (true) {
int n = s.nextInt(); if (n == 0) break;
if (n > max) max = n;
}
System.out.println("Maximum number: " + max);
}
}
