package com.register.test.nsc;

public class RegisterBean {
	private static final long serialVersionUID = 1L; 
	private static String firstName;
	private static String lastName;
	private static String email;
	private static String password;
	private static String contactNo;
	
	
	public static String getFirstName() {
		return firstName;
	}
	public static void setFirstName(String firstName) {
		RegisterBean.firstName = firstName;
	}
	public static String getLastName() {
		return lastName;
	}
	public static void setLastName(String lastName) {
		RegisterBean.lastName = lastName;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		RegisterBean.email = email;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		RegisterBean.password = password;
	}
	public static String getContactNo() {
		return contactNo;
	}
	public static void setContactNo(String contactNo) {
		RegisterBean.contactNo = contactNo;
	}
	
	

}
