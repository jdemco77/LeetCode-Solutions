# 1725. Number Of Rectangles That Can Form The Largest Square

class Solution:
    def countGoodRectangles(self, rectangles: List[List[int]]) -> int:
        
        itr=0
        rectangle= [0]*len(rectangles)
        
        
        for rect in rectangles:
            val = rect[0]
            val2 =  rect[1]
            
            if val >= val2:
                curr = val2
            else:
                curr=val
            
            
            rectangle[itr] = curr
            itr=itr+1
            
            #[5,3,5,5]
        highest=0
        highCount=0
        
        for i in rectangle:
            if i >= highest:
                highest=i
            
        for i in rectangle:
            if highest == i:
                highCount= highCount +1
                
        return highCount
                