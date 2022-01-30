package leetCode;
//	2011. Final Value of Variable After Performing Operations
//	https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class FinalValAfterOperations {

	
    public int finalValueAfterOperations(String[] operations) {
        
        int count=0;
        for(int i=0 ; i<operations.length ; i++){
            if(operations[i].contains("-")){
                count--;
            }else{
                count++;
            }
        }
        
        return count;
        
    }
}
