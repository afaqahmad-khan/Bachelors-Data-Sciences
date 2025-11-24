import java.util.Scanner;


public class Lab7Task7 {


public static void printMatrix(int n) { for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) { System.out.print((int)(Math.random() * 2) + " ");
}
System.out.println();
}
}


public static void main(String[] args) { Scanner in = new Scanner(System.in); System.out.print("Enter n: ");
int n = in.nextInt();


printMatrix(n);
 
}
}
Output:
Enter n: 3
0 1 0
1 0 1
0 0 1
