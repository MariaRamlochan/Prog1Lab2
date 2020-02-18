import java.util.*;

//Giving the first and last name of a user.
public class Naming{

	public static void main(String[] args){

		System.out.println("\n**** NAMING ****");
		
		
		Scanner sc = new Scanner(System.in);
		String st = new String();
		
		System.out.println("Enter lastname: ");
		String lastName = sc .next();
		System.out.println("Enter firstname: ");
		String firstName = sc .next();
		
		System.out.println("Full Name: " + firstName + " " + lastName);
		
	
	}
}