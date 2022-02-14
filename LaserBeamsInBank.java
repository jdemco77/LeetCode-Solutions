package leetCode;

//	2125. Number of Laser Beams in a Bank
//	https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
public class LaserBeamsInBank {

	public int numberOfBeams(String[] bank) {
        int[] devices= new int[bank.length];
        String row="";  
        for(int i=0;i<bank.length;i++){                                 //count ones in each string add to new int[]
            row= bank[i];
            int ones= row.length() - row.replaceAll("1", "").length();
            devices[i]= ones;
        }   
       
        int nonZerocount=0;
        for(int i=0;i<bank.length;i++){  
            if(devices[i]!=0){
                nonZerocount++;
            }
        }
        
        int[] nonZero=new int[nonZerocount];
        int index=0;
        
        for(int i=0;i<bank.length;i++){         //remove zero value rows   [3,2,1]
            if(devices[i]!=0){
                nonZero[index] = devices[i];
                index++;
            }    
        }
        if(index==1|| index==0){
            return 0;
        }
        
        boolean done=false;
        int rowN=0;
        int nextrow=0;
        int i=0;
        int lasers=0;
        
        while(done==false){
            rowN=nonZero[i];
            nextrow= nonZero[i+1];
            lasers+= rowN*nextrow;
            i++;
            if((i+1)== index ){
                done=true;
            }
        }
        return lasers;
    }
}
