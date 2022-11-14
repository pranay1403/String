package Strrr;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str="Java Python Ruby C#";
 //print each element in next line.
			String[] str1=str.split("\\s");
			
			for(String s : str1) {
				
				System.out.println(s);
			}
		//remove white spaces from given string	
			String str2="";
			
			for(int i=0;i<str.length();i++) {
				
				if(str.charAt(i)!=' ') {
					str2=str2+str.charAt(i);
				}
				
			}
			System.out.println(str2);
	}

	
	
	

}
