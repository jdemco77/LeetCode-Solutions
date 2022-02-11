package leetCode;

//	1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
//  https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/

//  description: A decimal number is called deci-binary if each of its digits is either 0 or 1 
//	without any leading zeros.
//	For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.

//	Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.



public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

	 public int minPartitions(String n) {
	        
	        int highest=0;
	        int size= n.length();
	        char curr;
	        int val;
	        
	        if(size==1){
	            curr= n.charAt(0);
	            val= Character.getNumericValue(curr);
	            highest=val;
	            return highest;
	        }
	        
	        for(int i=0;i< size ;i++){
	            curr= n.charAt(i);
	            val= Character.getNumericValue(curr);	//remove ascii code
	            
	            if(val>highest){
	                highest=val;
	            }
	        }
	        return highest;
	        
	    }
}

//	explanation: The highest digit in any spot is the minimum number of positive deci-binary numbers
//  since we cannot use a value greater than 1 at any spot.
//  solution: find the highest int value in the string and return that value
//	avoid returning ascii code for that integer
