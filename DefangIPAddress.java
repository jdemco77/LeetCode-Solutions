package leetCode;

//	1108. Defanging an IP Address
//	https://leetcode.com/problems/defanging-an-ip-address/


public class DefangIPAddress {

	 public String defangIPaddr(String address) {
	        String ans="";
	    
	        for(int i=0;i<address.length();i++){
	            
	            if(address.charAt(i) == '.'){
	                ans+= "[.]";
	            }else{
	                ans+=address.charAt(i);
	            }
	        }
	       
	         return ans;
	    
	    }
}
