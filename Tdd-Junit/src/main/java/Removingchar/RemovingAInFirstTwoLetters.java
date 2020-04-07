package Removingchar;

public class RemovingAInFirstTwoLetters {

	

		public String removeA(String str)
		{
			String ans="";
			int l=str.length();
		if(l>2) {
			if(str.charAt(0)!='A') {
				ans+=str.charAt(0);
			}
			if(str.charAt(1)!='A') {
				ans+=str.charAt(1);
			}
			ans+=str.substring(2);
			
					}
			
		else {
			
			if(str.charAt(0)!='A') {
				ans+=str.charAt(0);
			}
		}
			
			
			
			
			
			
			
			
		return ans;	
		}
		
	}

	
	

