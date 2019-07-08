/*Murray Jones
 *Program to compute Body Mass Index
 */

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("I will calculate your Body Mass Index");
		
		System.out.println("Please enter your weight in pounds");
		double weight = input.nextDouble() * 0.45359237;
		
		System.out.println("Please enter your height in inches");
		double height = input.nextDouble() * 0.0254 ;
		
		
		System.out.println("Your BMI is: " + (weight * height) / 2);
		
		
input.close();
	}

}
