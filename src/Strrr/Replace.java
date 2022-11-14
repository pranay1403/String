package Strrr;

public class Replace {

	public static void main(String[] args) {

		String str = "P#RAN#AY";
//
//		str=str.replace('#', ' ');
//		String str2=str.replaceAll("\\s", "");
//		System.out.println(str2);
		
		String str1="";
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!='#') {
				str1=str1+str.charAt(i);
				
			}
			
		}
		
		System.out.println(str1);
		
		

	}

}
