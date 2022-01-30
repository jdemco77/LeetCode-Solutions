package leetCode;
//	896. Monotonic Array
//	https://leetcode.com/problems/monotonic-array/
public class MonotonicArray {

	public boolean isMonotonic(int[] nums) {
        return increasing(nums) || decreasing(nums);
    }//end method
    
    public boolean increasing(int[] nums){
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }//end increasing
    
    public boolean decreasing(int[] nums){
        
        for(int i=0;i<nums.length -1;i++)
        if(nums[i]<nums[i+1]){
            return false;
        }
        return true;
    }
}
