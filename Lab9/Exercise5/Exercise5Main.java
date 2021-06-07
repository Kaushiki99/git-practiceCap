package lab9Assignments.Exercise5;

	public class Exercise5Main {
	    public static int calculateFactorial(int n) {
	        int fac = 1;
	        for (int i = 1; i <= n; i++)
	            fac = fac*i;
	        return fac;
	    }

	    public static void main(String[] args) {
	        Factorial f = Exercise5Main::calculateFactorial;
	        System.out.println(f.test(5));
	    }
	}

