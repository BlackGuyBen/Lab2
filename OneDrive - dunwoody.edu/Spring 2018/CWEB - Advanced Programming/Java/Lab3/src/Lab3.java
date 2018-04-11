/**
 * 
 */

/**
 * @author olubeno
 *
 */
import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Lab3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// The main program (this one) will run through each problem according to what the user choose
		// 
		
		//Declarations
		// input : user selected problem (1-4)
		System.out.println("This program will run the 4 problems in Lab 3.");
		System.out.println("Please select the problem you'd like to run. \n ");
		System.out.println("1. Password");
		System.out.println("2. Word Counter");
		System.out.println("3. Phone Number");
		System.out.println("4. ID Creater");
		
		Scanner input = new Scanner(System.in);
		
		String selected = input.nextLine();
		
		if (selected == "1") {
			password(args);
		}
		else if (selected =="2") {
			counter();
		}
		else if (selected == "3") {
			phoneNum();
		}
		else if (selected == "4") {
			idNum();
		}
		/*else {
			System.out.println("Please try that again");
			main(args);
		}*/
		password(args); 	
		
		input.close();
	}
	
	public static void password(String[] args) {
		//First Problem called by the main. User enters a password between 6-10 chars.
		
		System.out.println("Please enter a password 6-10 characters long.");
		
		//InputStreamReader in = new InputStreamReader(System.in);
		//BufferedReader input = new BufferedReader(in);
		Scanner input = new Scanner (System.in);
		
		String password = input.nextLine();
		List<String> passError = new ArrayList<String>();
		
		while (!isValid(password,passError)) {
			System.out.println("The password is invalid");
			for(String error:passError) {
				System.out.println(error);
			}
			System.out.println("Please entera password 6-10 characters long.");
			password = input.nextLine();
		}
		System.out.println("Here is your password:" + password);
		
		input.close();
		
	}
	public static boolean isValid(String password, List<String> passError) {
		
		Pattern specialChar = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Pattern upperCaseChar = Pattern.compile("[A-Z]");
		Pattern lowerCaseChar = Pattern.compile("[a-z");
		Pattern digit = Pattern.compile("[0-9]");
		
		boolean valid = true;
		
		if (password.length() >= 6 && password.length() <= 10) {
			passError.add("Password does not meet length requirements");
			valid = false;
		}
		if (!specialChar.matcher(password).find()) {
			passError.add("Password does not have special Characters.");
			valid = false;
		}
		if (!upperCaseChar.matcher(password).find()) {
			passError.add("Password must have at least 1 uppercase.");
			valid = false;
		}
		if (!lowerCaseChar.matcher(password).find()) {
			passError.add("Password must have at least 1 lowercase.");
			valid = false;
		}
		if(!digit.matcher(password).find()) {
			passError.add("Password must have a number.");
			valid = false;
		}
		return valid;
	}
		
		//First IF statement just to see if the password is too long or too short
		
	
	
	public static void counter() {
		//Second Problem to be called by main. Counting how many words are in a string.
		
		Scanner s = new Scanner(System.in);
		char ch;
		int x;
		int count = 0;
		int length;
		boolean prevCharPunk = false;
		
		String userIn = s.nextLine();
		
		for (x = 0; x<userIn.length(); x++) {
			ch = (char) userIn.indexOf(x);
			
			if (ch == "")
			
		}
		
		int count = userIn.split(",").length;
		
		
	}
	
	public static void phoneNum() {
		//Third program for main. Creating a phone number from digits entered by user
	}
	
	public static void idNum() {
		//Forth program for main. Creating an ID from user inputed data
	}

}
