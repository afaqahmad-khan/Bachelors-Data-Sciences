import java.util.Scanner;


public class Lab6Task9 {
public static void main(String[] args) { Scanner input = new Scanner(System.in);

System.out.print("Input: "); String s = input.nextLine();

int first = s.indexOf('h'); int last = s.lastIndexOf('h');

if (first == -1 || last == -1 || first == last) { System.out.println(s);
return;
}


StringBuilder result = new StringBuilder();


result.append(s.substring(0, first + 1));


for (int i = first + 1; i < last; i++) { char c = s.charAt(i); result.append(c == 'h' ? 'H' : c);
}
 
result.append(s.substring(last));


System.out.println(result.toString());
}
}
Output:
Input: In the hole in the ground there lived a hobbit In the Hole in tHe ground tHere lived a hobbit


