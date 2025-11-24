import java.util.Scanner;


public class Lab7Task5 {


public static int countLetters(String s) { int count = 0;
for (char c : s.toCharArray()) {
if (Character.isLetter(c)) count++;
}
return count;
}


public static void main(String[] args) { Scanner in = new Scanner(System.in); System.out.print("Enter a string: "); String s = in.nextLine();

System.out.println("Number of letters: " + countLetters(s));
}
}


Output:
Enter a string: Welcome to Java Number of letters: 13
