/*Murray Jones
 *Compute the volume of a cylinder
 */

import java.util.Scanner;

public class CylinderVolume {
  
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  //Scanner to get input from user
		
		System.out.println("Enter the Radius and Lenth of your Cylinder");
		
		double radius = input.nextDouble(); // get radius from user
		double length = input.nextDouble(); // get length from user
		
		/*Variables for computing area and length */
		final double pi = 3.14;
		double area = radius * radius * pi;
		double volume = area * length;
		
		System.out.println("The Area is: " + area);
		System.out.println("The volume is: " + volume);
		
	
	input.close();
}
}