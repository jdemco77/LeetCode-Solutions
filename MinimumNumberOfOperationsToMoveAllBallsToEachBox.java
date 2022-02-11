package leetCode;


//	1769. Minimum Number of Operations to Move All Balls to Each Box
//	https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {

	 public int[] minOperations(String boxes) {
	        boolean[] hasBall= fillHasBall(boxes);
	        int[] ret= new int[boxes.length()];
	        
	        
	        for(int i=0;i<hasBall.length;i++){
	            for(int k=0;k<hasBall.length;k++){
	                if(hasBall[k]==true){
	                     if(i<k && i!=k ){ 
	                         ret[i]+= k-i;
	                    }
	                    if(i>k && i!=k){
	                      ret[i]+= i-k;
	                     }
	                 }
	              }//end k
	         } //end i
	       return ret;
	    }//end minOperations
	    
	    public boolean[] fillHasBall(String boxes){
	        boolean[] hasBall= new boolean[boxes.length()];
	        int val=0;
	        
	        boolean ball;
	        for(int i=0;i<boxes.length();i++){
	            char c = boxes.charAt(i);
	            val= Character.getNumericValue(c);
	           
	            if(val==1){
	                hasBall[i]=true;
	            }
	        }
	        return hasBall;
	    }
}
