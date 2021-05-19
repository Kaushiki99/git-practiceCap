package lab2Assignments;
//question3
import java.util.*;
public class SortedInteger{
	// Method to reverse a String
		public static String reverse(int num) {
			String s=""+num;
			String rev="";
			for(int i=s.length()-1;i>=0;i--) {
				rev=rev+s.charAt(i);
			}
			return rev;
		}

		// Method to sort an array after reversing its elements
		public static int[] getSorted(int[] arr) {
			String[] num=new String[arr.length];
			for(int i=0;i<arr.length;i++) {
				num[i]=""+reverse(arr[i]);
				arr[i]=Integer.parseInt(num[i]);
			}
			int temp;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			return arr;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in); 
			System.out.print("Enter the size of the array : ");
			int size=sc.nextInt(); // input the of size for first array
			int a[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter Element "+(i+1)+" : "); // input elements of array
				a[i]=sc.nextInt();
			}
			System.out.println("The array after reversing it's elements is given below : ");
			for(int i=0;i<size;i++) {
				System.out.print(reverse(a[i])+" ");
			}
			System.out.println();
			a=getSorted(a); //method get sorted is called to sort the reversed array
			System.out.println("The sorted array is given below : ");
			for(int i=0;i<size;i++) {
				System.out.print(a[i]+" ");
			}
			
			sc.close();
		}

	}


