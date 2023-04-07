package loginpage;

import java.util.Scanner;

public class login {

	  public static void main(String[] args) {
		  String UserName = "nanda";
		  String PassWord = "143";
		  
		  Scanner abc = new Scanner(System.in);
	     
		 System.out.print("Enter your username: ");
		 String username = abc.nextLine();
		 
		 if(username.equals(UserName)) {
		 System.out.print("Enter your Password: ");
		 String password = abc.nextLine(); 
		 
		 if( password.equals(PassWord)) {
			 System.out.println("login success full");
		 }
		 else {System.out.println("invalid password");}
		 }
		 else {
			 System.out.println("invalid user name");
		 }
}
}