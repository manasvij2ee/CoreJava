package com.home.string;

public class IpAddressRegEx {

	public static void main(String[] args) {
		String ipaddress = "1.1.1";
		String pattern = 
				"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
						"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
						"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
						"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		boolean test=ipaddress.matches(pattern);
		 try {
			 if (test==false) {
				System.out.println("Ip address is Invalid ");
			}else if (test==true) {
				System.out.println("Ip address is valid ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
