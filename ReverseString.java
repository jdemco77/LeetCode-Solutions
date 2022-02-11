package leetCode;

//	344. Reverse String
//	https://leetcode.com/problems/reverse-string/

//	task: Write a function that reverses a string. The input string is given as an array of characters s.
//  constraints: You must do this by modifying the input array in-place with O(1) extra memory.
public class ReverseString {

	 public void reverseString(char[] s) {
	        
	        int i=0;
	        int j= s.length -1;
	        char temp;
	        char temp2;
	        while(i < j){
	            temp= s[i];
	            temp2= s[j];
	            
	            s[i]= temp2;
	            s[j]= temp;
	            
	            i++;
	            j--; 
	        }
	        
	    }
	
}
