package leetCode;

//	1672. Richest Customer Wealth
//	https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {

	 public int maximumWealth(int[][] accounts) {
	        
	        int wealthiest=0;
	        
	        for(int i=0;i<accounts.length;i++){
	            int val= wealth(accounts[i]);
	            if(val>wealthiest){
	                wealthiest=val;
	            }
	        }
	        return wealthiest;
	        
	    }
	    public int wealth(int[] arr){
	        int wealth=0;
	        
	        for(int i=0;i<arr.length;i++){
	            wealth += arr[i];
	        }
	        return wealth;
	    }
}
