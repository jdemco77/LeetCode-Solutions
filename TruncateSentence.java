package leetCode;

//	1816. Truncate Sentence
//	https://leetcode.com/problems/truncate-sentence/	

public class TruncateSentence {

	 public String truncateSentence(String s, int k) {
	        
	        String[] strArr= s.split(" ");
	        String ans="";
	        
	        for(int i=0;i<k-1;i++){
	            ans+=strArr[i]+" ";
	        }
	        ans+=strArr[k-1];
	        return ans;
	    }
	 
}
