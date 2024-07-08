import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // TODO: 04-07-2024 calculate Circle Area
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the radius of the circle: ");
      double radius = scanner.nextDouble();
      double area = Math.PI * Math.pow(radius, 2);
    System.out.println("Area of the circle with radius " + radius + " units: " + area);
      scanner.close();

    }
}
