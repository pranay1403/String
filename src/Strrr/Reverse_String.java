package Strrr;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String P="MOM";
		String c="";
		
		for(i=((P.length()-1));i>=0;i--) {
			
			c=c+P.charAt(i);
				
		}
		System.out.println(c);
		if(c.equals(P)) {
			System.out.println("Pallandrome String");
		}else {
			System.out.println("Not palandrome String");
		}
		
	}

}
