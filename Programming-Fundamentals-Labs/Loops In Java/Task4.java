import java.util.Scanner; public class Lab04_Task4 {
public static void main(String[] args) { Scanner s = new Scanner(System.in); int count = 0;
while (true) {
int n = s.nextInt(); if (n == 0) break; count++;
}
System.out.println("Length of sequence: " + count);
}
}
