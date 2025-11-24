import java.util.Scanner; public class Lab6Task1 {
public static void main(String[] args) { Scanner input = new Scanner(System.in);
 
System.out.print("Enter point 1 (latitude and longitude) in degrees: "); double lat1 = input.nextDouble();
double lon1 = input.nextDouble();


System.out.print("Enter point 2 (latitude and longitude) in degrees: "); double lat2 = input.nextDouble();
double lon2 = input.nextDouble();


double r = 6371.01;


double distance = r * Math.acos(
Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(lon1 - lon2))
);


System.out.println("The distance between the two points is " + distance + " km");
}
}


Output:
Enter point 1 (latitude and longitude) in degrees: 39.55 -116.25 Enter point 2 (latitude and longitude) in degrees: 41.5 87.37 The distance between the two points is 10691.79183231593 km
 
