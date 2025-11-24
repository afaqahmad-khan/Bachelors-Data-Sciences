public class Lab02_Task10 {
public static void main(String[] args) {
System.out.printf("%-8s %-8s %-8s %-8s %-8s%n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
int degrees = 30;
double radians = Math.toRadians(degrees); System.out.printf("%-8d %-8.4f %-8.4f %-8.4f %-8.4f%n",
degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
degrees = 60;
radians = Math.toRadians(degrees);
System.out.printf("%-8d %-8.4f %-8.4f %-8.4f %-8.4f%n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
}
}
