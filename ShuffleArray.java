package leetCode;

//	1470. Shuffle the Array
//	https://leetcode.com/problems/shuffle-the-array/
public class ShuffleArray {

	public int[] shuffle(int[] nums, int n) {
        int[] ret=new int[nums.length];
        int i=0;
        
        for(int j=0;j<nums.length;j++){
            if(j%2==0){
                ret[j]=nums[i];
                i++;
            }
            if(j%2==1){
                ret[j]=nums[n];
                n++;
            }
        }
        return ret;
    }
	public int[] shuffleFaster(int[] nums, int n) {
        int[] ret=new int[nums.length];
        int i=0;
        
        for(int j=0;j<nums.length;j+=2){
            ret[j]=nums[i];
            i++;
            ret[j+1]=nums[n];
            n++;
            
        }
        return ret;
    }
}
