import java.util.*;

//Program that calculate's seconds and display it under the format minutes: seconds.
public class SecondsConvert{

	public static void main(String[] args){

		System.out.println("\n**** CALCULATING SECOND INTO MITUNES: SECONDS ****");

		//Variables
		int totalSeconds, seconds, minutes;
		
		
		Scanner sc = new Scanner(System.in);
		String st = new String();
		
		System.out.println("Enter nomber of seconds: ");
		totalSeconds = sc .nextInt();
		
		//Calculating minutes and seconds from the totalSeconds input.
		minutes = totalSeconds/60;
		seconds = totalSeconds % 60;
		System.out.println("Total time is: " + minutes + "min" + ":" + seconds + "sec");
	}
}