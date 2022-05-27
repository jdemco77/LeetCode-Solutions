class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        
        alt=0
        highestAlt=0
        
        
        for diff in gain:
            
            alt = alt+ diff         #get new altitude
            
            if alt > highestAlt:   
                highestAlt=alt
            
        return highestAlt