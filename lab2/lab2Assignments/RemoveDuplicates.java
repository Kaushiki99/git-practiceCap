package lab2Assignments;
import java.util.*;
public class RemoveDuplicates {
	static int[] modifyArray(int[] arr) {
		int n = arr.length;
		boolean[] visit = new boolean[n];
		for (int i = 0; i < n; i++) {
			visit[i] = true;
		}
		int ct = 0;
		for (int i = 0; i < n; i++) {
			if (visit[i] == true) {
				for (int j = i+1; j < n; j++) {
					if (arr[i] == arr[j]) {
						visit[j] = false;
						ct += 1;
					}
				}
			}
		}
		int k = 0;
		int[] ans = new int[n-ct];
		for (int i = 0; i < visit.length; i++) {
			if (visit[i] == true) {
				ans[k] = arr[i];
				k += 1;
			}
		}
		
		for (int i = 0; i < ans.length; i++) {
			for (int j = i+1; j < ans.length; j++) {
				if (ans[i] < ans[j]) {
					int x = ans[i];
					ans[i] = ans[j];
					ans[j] = x;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println(Arrays.toString(modifyArray(arr))); //to change the input into string
		
		sc.close();
	}

}
