package Lab3Package;

public class Lab3Circle {
	public static void main(String[] args)
    {
     final double PI = 3.14159;
     
     int radius1 = 10;
     double area1 = PI * radius1 * radius1;
     double circumference1 = 2 * radius1;

     System.out.println("The area of a circle with radius " + radius1 + " is " + area1);
     System.out.println("The circumference of a circle with radius " + radius1 + " is " + circumference1 + "\n");

     int radius2 = 20;
     double area2 = PI * radius2 * radius2;
     double circumference2 = 2 * radius2;

     System.out.println("The area of a circle with radius " + radius2 + " is " + area2);
     System.out.println("The circumference of a circle with radius " + radius2 + " is " + circumference2 + "\n");
     
     double deltaArea = area2/area1;
     
     System.out.println("The area increased by a factor of " + deltaArea);
     
     double deltaCircumference = circumference2/circumference1;
     
     System.out.println("The circumference increased by a factor of " + deltaCircumference);

    }

}
