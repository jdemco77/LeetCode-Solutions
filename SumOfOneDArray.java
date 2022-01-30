package leetCode;
//	1480. Running Sum of 1d Array
//	https://leetcode.com/problems/running-sum-of-1d-array/
public class SumOfOneDArray {
 
	 public static int[] runningSum(int[] nums) {	       
		        int[] ans= new int[nums.length];           //new array to hold answer
		        
		        
		        for(int i=0; i<nums.length;i++){      //loop through array nums
		            
		           for(int j=0;j<=i;j++){
		               int val= nums[j];
		               ans[i]+=val;
		           }   
		        }
		       return ans; 
		    }
	 }

