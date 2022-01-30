package leetCode;
//	1929. Concatenation of Array
//	https://leetcode.com/problems/concatenation-of-array/
public class ConcatenationOfArray {

public int[] getConcatenation(int[] nums) {
        
        int[] ans= new int[nums.length*2]; //6
        int n=nums.length; 
        
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
