package Lab6Assignments;


	import java.util.*;

	public class Exercise2 {
	    static HashMap<Character, Integer> countChars(char[] arr) {
	        HashMap<Character, Integer> charCountMap = new HashMap<>();
	        for (char c: arr) {
	            if (charCountMap.containsKey(c))
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            else
	                charCountMap.put(c, 1);
	        }
	        return charCountMap;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the char array: ");
	        int size=sc.nextInt();
			if(size<1)
				System.out.println("Size cannot be less than 1");
			else {
			char arr[]=new char[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter Character Number"+(i+1)+" : ");
				arr[i]=sc.next().charAt(0);
			}
			Map<Character,Integer> map=countChars(arr);
			System.out.println("The number of times each character appears in the array is given below: ");
			for(Map.Entry<Character, Integer> m : map.entrySet()) {
				System.out.println("Character : "+m.getKey()+", Frequency : "+m.getValue());
			}
			}
			sc.close();

	    }
	}

