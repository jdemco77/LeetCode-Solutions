package leetCode;
//	1748. Sum of Unique Elements
//	https://leetcode.com/problems/sum-of-unique-elements/
public class SumOfUniqueElements {

	 public int sumOfUnique(int[] nums) {
	        int[] unique= new int[101];
	        
	        for(int i=0;i<nums.length;i++){
	            int val= nums[i];
	            unique[val]+=1;
	        }
	        
	        int sum=0;
	        
	        for(int j=0;j<unique.length;j++){
	            if(unique[j]==1){
	                sum += j;
	            }
	        }
	        return sum;
	    }
}
