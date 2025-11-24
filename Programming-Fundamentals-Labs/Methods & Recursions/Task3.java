import java.util.Arrays; import java.util.Scanner;
 
public class Lab7Task3 {


public static void displaySortedNumbers(double a, double b, double c) { double[] arr = { a, b, c };
Arrays.sort(arr);
System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
}


public static void main(String[] args) { Scanner in = new Scanner(System.in);

System.out.print("Enter three numbers: "); double a = in.nextDouble();
double b = in.nextDouble(); double c = in.nextDouble();

displaySortedNumbers(a, b, c);
}
}
Output:
Enter three numbers: 3 1 2
1.0 2.0 3.0
