package com.home.string;

public class PhoneNumRegEx {

	public static void main(String[] args) {
		System.out.println(validatePhoneNumber("12345j 67890"));
		
	/*	String phoneNumber = "1234567893";
		String pattern = "\\d{10}";
		boolean test=phoneNumber.matches(pattern);
		try {
			if (test==false) {
				System.out.println("Given phone number is Invalid");
			}else if (test==true) {
				System.out.println("Given phone number is valid");
			}
		} catch (Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		}*/
	
	}

		private static boolean validatePhoneNumber(String phoneNo) {
			//validate phone numbers of format "1234567890"
			if (phoneNo.matches("\\d{10}"))
				return true;
			//validating phone number with -, . or spaces
			else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
				return true;
			//validating phone number with extension length from 3 to 5
			else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))
				return true;
			//validating phone number where area code is in braces ()
			else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))
				return true;
			//return false if nothing matches the input
			else return false;
			
		}

}
