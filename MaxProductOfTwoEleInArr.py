class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        high=0
        second=0
        itr=0
        
        for i in nums:
            if i>high:
                high=i
                indx=itr
            
            itr=itr+1
            
        nums.pop(indx)
        
        for i in nums:    
            if high>=i and i> second:
                second=i
            
        ans= (high-1)*(second-1)
        return ans