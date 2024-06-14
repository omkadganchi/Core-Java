package com.march18;

public class LoginCheck {
	private String username;
	private long mobileNo;
	private static String password = " Pass@123";

	LoginCheck(String uname, long mobno){
		username = uname;
		mobileNo = mobno;
	}
	
	public String login(String uname) {
		return uname + password;
	}
	
	public String login(long mobno) {
		return mobno + password;
	}
}
