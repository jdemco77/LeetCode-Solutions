package leetCode;

public class IsUnique {

	public static void main(String[] args) {
		boolean val= uniqueString("hello");
		System.out.println(val);
		boolean val2= uniqueString("yes");
		System.out.println(val2);
		boolean val3= uniqueString("Recked"
				+ "");
		System.out.println(val3);
	}
	
	public static boolean uniqueString(String s) {
		
		String str= s.toLowerCase();
		
		int[] ascii= new int[128];		//create int array to hold ascii values
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);		// get char for string
			int val=(int) c;			//convert char value to ascii int
			ascii[val]+=1;				//add 1 for each str value
			
			if(ascii[val]>1) {			//if a value is entered more than once return false
				return false;
			}
		}
		
		return true;
	}
}