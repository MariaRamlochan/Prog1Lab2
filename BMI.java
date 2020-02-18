import java.util.*;

//Program that calculate's the Body Mass Index of a person.
public class BMI{

	public static void main(String[] args){

		System.out.println("\n**** CALCULATING BODY MASS INDEX ****");

		//Variables
		double weight, height, kg, m, BMI;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight in pounds: ");
		weight = sc .nextDouble();
		
		System.out.println("Enter your height in feet: ");
		height = sc .nextDouble();
		
		String st = new String();
		//Converting the entered weight from pounds to kilograms.
		kg = weight * 0.453592;
		System.out.println("\nWeight in kilograms is: ");
		System.out.printf("%.2f", kg);
		
		//Converting the enteredheight from feet to meters.
		m = height * 0.3048;
		System.out.println("\nHeight in meters is: ");
		System.out.printf("%.2f", m);
		
		//Calculating the Body Mass Index by dividing the kg by m^2.
		m = Math.pow(m,2); 		//Making m to the power of 2.
		BMI = kg/m;
		System.out.println("\nThe Body Mass Index is: ");
		System.out.printf("%.2f", BMI);
	}
}