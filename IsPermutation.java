package leetCode;

public class IsPermutation {

	public static void main(String[] args) {
		System.out.println(perm("dog","god"));
		System.out.println(perm("bog","fog"));
		System.out.println(perm("car","carssses"));
		System.out.println(perm("cat","tca"));
		
	}
	public static boolean perm(String s,String s2) {
		s=s.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s.length() != s2.length()) {
			return false;
		}
		
		int[] ascii= new int[256];
		
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			int val=(int) c;
			
			ascii[val] += 1;
		}
		for(int i=0;i<s.length();i++) {
			char c= s2.charAt(i);
			int val=(int) c;
			
			ascii[val] -= 1;
		}
		for(int i=0;i<ascii.length;i++) {
			if(ascii[i]!=0) {
				return false;
			}
		}
		
		
		return true;
	}
}
