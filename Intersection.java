package leetCode;
//	349. Intersection of Two Arrays
//	https://leetcode.com/problems/intersection-of-two-arrays/
public class Intersection {

	public static void main(String[] args) {
		
	}
	 public static int[] intersection(int[] nums1, int[] nums2) {
		int[] unique1= new int[1000];
		int[] unique2= new int[1000];
		
		
		for(int i=0;i<nums1.length;i++) {		//get unique values form nums1
			int val= nums1[i];
				if(unique1[val]==0) {
					unique1[val] += 1;	
				}
		}
		
		for(int j=0;j<nums2.length;j++) {		//get unique values form nums2
			int val= nums2[j];
				if(unique2[val]==0) {
					unique2[val] += 1;
				}
		}
		
	    int count=0;
		for(int k=0;k<1000;k++) {
			if(unique1[k]==1 && unique2[k]==1) {
				System.out.println(unique1[k]);
				count++;						//find number of matching items between arrays
			}
		}
		
		int[] ans=new int[count];				//new array to hold answers
		
		int countAdded=0;						//holder for unique values added to ans
		
		for(int k=0;k<1000;k++) {
			if(unique1[k]==1 && unique2[k]==1) {
				int val= k;
				ans[countAdded]=val;
				countAdded++;
			}
		}
		
	  
	    return ans;    
	 }
}
