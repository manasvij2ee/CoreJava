package com.home.string;

public class EmailRegEx {

	public static void main(String[] args) {
		String givenEmail = "ivsanam25@gmail.com";
		String pattern = 
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		boolean expression=givenEmail.matches(pattern);
		 try {
			 if (expression==false) {
				System.out.println("Email address is Invalid ");
			}else if (expression==true) {
				System.out.println("Email address is valid ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
