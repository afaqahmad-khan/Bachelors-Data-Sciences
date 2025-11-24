import java.util.Scanner;


public class Lab7Task8 {


public static int countVowels(String s) { int count = 0;
s = s.toLowerCase();
for (char c : s.toCharArray()) { if ("aeiou".indexOf(c) != -1) {
count++;
}
}
return count;
}
 
public static void main(String[] args) { Scanner in = new Scanner(System.in); System.out.print("Enter a string: "); String s = in.nextLine();

System.out.println("Number of Vowels in the string: " + countVowels(s));
}
}


Output:
Enter a string: Welcome to Java Number of Vowels in the string: 6
