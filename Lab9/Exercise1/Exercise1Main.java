package lab9Assignments.Exercise1;

	import java.util.Scanner;

	public class Exercise1Main{
		
	 public static void main(String[] args) {
		 //Using lambda expressions to solve this
		
		 Power obj = () ->{
			 	Scanner sc = new Scanner(System.in);
			 	System.out.println("enter x and y values:");
			 return (long) Math.pow(sc.nextInt(), sc.nextInt());
			};
			System.out.println("x power y is: "+obj.powerofX());
	 	}
	}

