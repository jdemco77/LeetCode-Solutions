package leetCode;

//	2114. Maximum Number of Words Found in Sentences
//	https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class MaxNumWordsInSentence {

	 public int mostWordsFound(String[] sentences) {
	        int max=0;
	        
	        
	        for(int i=0;i< sentences.length;i++){
	            String[] words = sentences[i].split(" ");
	            int count= words.length;
	            
	            if(count>max){
	                max=count;
	            }    
	        }
	        return max;
	        
	    }
}
