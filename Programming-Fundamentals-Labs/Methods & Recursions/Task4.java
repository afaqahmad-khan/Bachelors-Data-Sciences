public class Lab7Task4 {


public static int numberOfDaysInAYear(int year) {
if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
return 366;
return 365;
}


public static void main(String[] args) { for (int y = 2000; y <= 2020; y++) {
System.out.println(y + ": " + numberOfDaysInAYear(y));
}
}
}
Output:
2000: 366
2001: 365
2002: 365
...
2020: 366
