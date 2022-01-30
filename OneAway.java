package leetCode;

public class OneAway {
	public static void main(String[] args) {
		System.out.println(oneaway("pale","bale"));
		System.out.println(oneaway("pales","pale"));
		System.out.println(oneaway("pale","bale"));
		System.out.println(oneaway("pale","bake"));
		System.out.println(oneaway("cake","bait"));
		
	}
	public static boolean oneaway(String s, String s2) {
		boolean b= insertedOne(s,s2);
		boolean b2= removedOne(s,s2);
		boolean b3= swappedOne(s,s2);
		
		if(b==true || b2==true || b3==true) {
			return true;
		}
			return false;		
	}
	
	public static boolean insertedOne(String s, String s2) {
		int poscount=0;
		int negcount=0;
		int[] ascii= new int[256];
		
		for(int i =0;i<s.length();i++){
			int val = (int) s.charAt(i);
			ascii[val]+=1;
		}
		for(int j =0;j<s2.length();j++){
			int val2= (int) s2.charAt(j);
			ascii[val2]-=1;
		}
		for(int y =0;y<ascii.length;y++){
			if(ascii[y]>0 ) {
				poscount++;
			}
			if(ascii[y]<0 ) {
				negcount++;
			}
		}
		if(poscount == 1) {
			return true;
		}
		return false;
		
	}
	public static boolean removedOne(String s, String s2) {
		int poscount=0;
		int negcount=0;
		int[] ascii= new int[256];
		
		for(int i =0;i<s.length();i++){
			int val = (int) s.charAt(i);
			ascii[val]+=1;
		}
		for(int j =0;j<s2.length();j++){
			int val2= (int) s2.charAt(j);
			ascii[val2]-=1;
		}
		for(int y =0;y<ascii.length;y++){
			if(ascii[y]>0 ) {
				poscount++;
			}
			if(ascii[y]<0 ) {
				negcount++;
			}
		}
		if(poscount == 1) {
			return true;
		}
		return false;
	}

	public static boolean swappedOne(String s, String s2) {
		int poscount=0;
		int negcount=0;
		int[] ascii= new int[256];
		
		for(int i =0;i<s.length();i++){
			int val = (int) s.charAt(i);
			ascii[val]+=1;
		}
		for(int j =0;j<s2.length();j++){
			int val2= (int) s2.charAt(j);
			ascii[val2]-=1;
		}
		for(int y =0;y<ascii.length;y++){
			if(ascii[y]>0 ) {
				poscount++;
			}
			if(ascii[y]<0 ) {
				negcount++;
			}
		}
		if(poscount==1 && negcount==1) {
			return true;
		}
		return false;
		
	}
	
	
	
}
