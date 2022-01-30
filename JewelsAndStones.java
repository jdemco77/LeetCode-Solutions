package leetCode;
//	771. Jewels and Stones
//	https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {

	
	public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        int total=0;
        
        for(int i=0;i<jewels.length();i++){
            char c= jewels.charAt(i);
            count = helper(c,stones);
            total+=count;
        }
        return total;
    }
        
    
    public int helper(char c,String stones){
        int count=0;
        
        for(int i=0;i<stones.length();i++){
            if(stones.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
    
	
	
}
