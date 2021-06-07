package lab8assignments.Exercise1;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;

	public class Exercise1main{

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				File source=new File("source.txt"); 
				File target=new File("target.txt"); 
				ThreadClass cdt = new ThreadClass(source,target);
				cdt.start();
			}
	    }
	

