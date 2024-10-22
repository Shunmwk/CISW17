/* This program is a recreation of ELIZA. 
 * Aurora acts as a therapist and has
 * a conversation with the user.
 * @group number : Lab 2 Partners 7
 * @author : Alicia Lunde & Shun Myat Wai Ko
 * @since : 10/17/2022
 * 
 */
import java.util.Scanner;

public class aurora {
	
	
	
	
	public void welcome() {
		
		System.out.println("AURORA: Hello. My name is Aurora.");
		
	}
	
	
	
	public void questions() {
		Scanner scnr = new Scanner(System.in);
		
		String[] auroraResponse = new String[5];
		auroraResponse[0] = "How do you feel today?";
		auroraResponse[1] = "Why are you "; /* + userResponse */
		auroraResponse[2] = "Is there anything else that makes you feel "; /* + userResponse */
		auroraResponse[3] = "Why don't you know?";
		auroraResponse[4] = "goodbye";
		
		System.out.print("USER:");
		String userResponse = scnr.nextLine();
		
			if (userResponse.equals("Hello"));{
				System.out.println("AURORA: " + auroraResponse[0]);
				System.out.print("USER: ");
				}
		String userResponse2 = scnr.nextLine();
			
			if (userResponse2.equals("Tired"));{
				if (userResponse2.equals("Goodbye")) {
					System.out.println("AURORA: Goodbye");
						}
					System.out.println("AURORA: " + auroraResponse[1] + userResponse2);
					System.out.print("USER: ");
					}
			
		String userResponse3 = scnr.nextLine();
					
			if (userResponse3.equals("Long day at school")); {
				if(userResponse3.equals("Goodbye")) {
					System.out.println("AURORA: Goodbye");
						}	
					System.out.println("AURORA: " + auroraResponse[2] + userResponse2);
					System.out.print("USER: ");
					}
			
		String userResponse4 = scnr.nextLine();
						
			if (userResponse4.equals("I don't know"));{
				if(userResponse4.equals("Goodbye")) {
					System.out.println("AURORA: Goodbye");
						}
					System.out.println("AURORA: " + auroraResponse[3]);
					System.out.print("USER: ");
					}
			
		String userResponse5 = scnr.nextLine();
		
			if (userResponse5.equals("goodbye"));{
					System.out.println("AURORA: " + auroraResponse[4]);
			
					
			scnr.close();	
			}
			}
				
	
	
	public static void main(String[] args) {
		aurora test = new aurora();
		test.welcome();
		test.questions();
		
		
		
		
		
		
		
		
		
		
		
		}
}
						
						
			
			
			
		