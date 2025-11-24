import java.util.Scanner; public class Lab05_Task1 {
public static void main(String[] args) { Scanner s = new Scanner(System.in);
int max = Integer.MIN_VALUE, idx = 0, i = 0; while (true) {
int n = s.nextInt(); if (n == 0) break; i++;
if (n > max) { max = n; idx = i; }
}
System.out.println("Index of maximum: " + idx);
}
}
