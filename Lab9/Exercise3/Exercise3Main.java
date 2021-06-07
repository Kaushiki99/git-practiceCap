package lab9Assignments.Exercise3;

	import java.util.Scanner;

	public class Exercise3Main {
	   public static void main(String[] args) {
		
		   User us = ()->{
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Enter username: ");
			   String username = sc.next();
			   System.out.println("Enter password");
			   String password = sc.next();
			   if(username.equals("Kaushiki") && password.equals("Pass@123")) 
				   return true;
			   return false;
		   };
		   
		   if(us.checkUserName()) {
			   System.out.println("It is a valid user name and password");
		   }else {
			   System.out.println("Invalid credentials");
		   }
	   }
	}

