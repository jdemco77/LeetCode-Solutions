package leetCode;
//	1961. Check If String Is a Prefix of Array
//	https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/
public class IsPrefixString {

	public static void main(String[] args) {
		String[] words = new String[] {"i","love","leetcode","apples"};
		System.out.println(isPrefixString("iloveleetcode", words));
	}
		    
	 public static boolean isPrefixString(String s, String[] words) {
			    
		        if(s.charAt(0) != words[0].charAt(0)){
		            return false;
		        }
		        
		        String check="";
		        
		        for(int i=0;i<=words.length-1;i++){
		            check = check + words[i];
		            
		            if(check.equals(s)){
		                return true;
		            }
		        }
		        return false;
		    }
		    
	    
	
}
