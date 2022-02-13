package leetCode;

//	151. Reverse Words in a String
//	https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWordsInSentence {

	 public String reverseWords(String s) {
	        
	        String[] words= s.split("\\s+");
	        String ret="";
	        for(int i=words.length-1;i>=0;i--){
	            ret+= words[i];
	            ret+=" ";   
	        }
	        return ret.trim();
	    }
}
