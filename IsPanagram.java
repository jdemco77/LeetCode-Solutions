package leetCode;

public class IsPanagram {

	
	public static void main(String[] args) {
		isPanagram("abcdefghijklmnopqrstuvwxyz");	//true
		isPanagram("hello");						//false
		isPanagram("ABbcd efghijklmnopqrstuvwxyz");//true
	
	}
	
	public static boolean isPanagram(String s) {
		int[] arr= new int[128];
		
		s= s.toLowerCase();	//remove capitals
		s.trim();			//remove spaces
		
		
		for(int i=0;i<s.length();i++) {		//convert each char to ascii value and increment value in int[]
			char c= s.charAt(i);
			int val= (int) c;
			arr[val]++;
		}
		
		for(int j=97;j<123;j++) {
			if(arr[j]< 1) {
				System.out.println(false);
				return false;
			}
		}
		System.out.println(true);
		return true;
		
	}
}
