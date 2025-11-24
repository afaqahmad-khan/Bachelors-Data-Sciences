import java.util.Scanner;


public class Lab7Task1 {


public static int sumDigits(long n) { int sum = 0;
n = Math.abs(n); while (n > 0) {
sum += n % 10; n /= 10;
}
return sum;
}


public static void reverse(int number) { number = Math.abs(number);
while (number > 0) { System.out.print(number % 10);
number /= 10;
}
}


public static void main(String[] args) { Scanner in = new Scanner(System.in); System.out.print("Enter an integer: ");
 
int n = in.nextInt();


System.out.println("Sum of digits: " + sumDigits(n)); System.out.print("Reversed: ");
reverse(n);
}
}
Output:
Enter an integer: 3456 Sum of digits: 18 Reversed: 6543

