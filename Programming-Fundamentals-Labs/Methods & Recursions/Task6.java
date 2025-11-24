import java.util.Scanner;


public class Lab7Task6 {


public static String capitalize(String word) { if (word.length() == 0) return word;
return Character.toUpperCase(word.charAt(0)) + word.substring(1);
}


public static void main(String[] args) { Scanner in = new Scanner(System.in); System.out.print("Enter a line: "); String line = in.nextLine();

String[] words = line.split(" "); StringBuilder sb = new StringBuilder();

for (String w : words) { sb.append(capitalize(w)).append(" ");
}


System.out.println(sb.toString().trim());
}
}
 
Output:
Enter a line: this is java This Is Java
