import java.util.*;

//Program that calculate's the average temperature for 3 days.
public class AverageT{

	public static void main(String[] args){

		System.out.println("\n**** Average Temperature for 3 days ****");

		//Variables
		int temperature1, temperature2, temperature3, totalT;
		
		
		Scanner sc = new Scanner(System.in);
		String st = new String();
		
		//Asking the user to input the temperature of all 3 days to then calculate the average.
		System.out.println("Enter temperature in Celcius of day 1: ");
		temperature1 = sc .nextInt();
		System.out.println("Enter temperature in Celcius of day 2: ");
		temperature2 = sc .nextInt();
		System.out.println("Enter temperature in Celcius of day 3: ");
		temperature3 = sc .nextInt();
		
		//Calculating the inputed temperature into the average for 3 day.
		totalT = (temperature1 + temperature2 + temperature3)/3;
		System.out.println("The average temperature of 3 days is: " + totalT + " degrees Celcius");
		
		
	}
}