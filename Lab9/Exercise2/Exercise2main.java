package lab9Assignments.Exercise2;


	import java.util.Scanner;

	public class Exercise2main {
		   public static void main(String[] args) {
			   
			Space sp = ()->{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the string: ");
				return sc.next().replace(""," ").trim();
			};
			System.out.println("Output string: "+ sp.addSpace());
		}
	}

