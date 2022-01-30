package leetCode;

public class Urlify {
		public static void main(String[] args) {
			System.out.println(urlify("hey   there   ",14));
			System.out.println(urlify("you   are   pretty   ",20));
		}
		
		public static String urlify(String s,int k) 
		{
			int l=0;
			String retString="";
			for(int i=0;i<k;i++)
			{
				
				if(Character.isWhitespace(s.charAt(i))) 
				{
					String sub= s.substring(l,i);
					i+=3;
					l+= sub.length()+3;
					retString+=sub;
					retString+="%20";
				}
				
			}
			return retString;
		}
}
