import java.util.Scanner;


public class Lab7Task2 {


public static int reverse(int number) { int rev = 0;
number = Math.abs(number); while (number > 0) {
rev = rev * 10 + number % 10; number /= 10;
}
return rev;
 
}


public static boolean isPalindrome(int number) { return number == reverse(number);
}


public static void main(String[] args) { Scanner in = new Scanner(System.in);

System.out.print("Enter a number: "); int n = in.nextInt();

System.out.println("Reversed: " + reverse(n)); System.out.println("Palindrome: " + isPalindrome(n));
}
}


Output:
Enter a number: 121 Reversed: 121 Palindrome: true
