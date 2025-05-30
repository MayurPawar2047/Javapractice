package string;

public class ReverseStringAtSamePosition {

	public static void main(String[] args) {
		        
	        String str="abc xyz";
	        //output cba zyx
	        String str1[]=str.split(" "); //abc  //xyz
	        String revstr="";
	        for(String s:str1)
	        {
	            StringBuilder sb= new StringBuilder(s);
	            sb.reverse();
	            revstr+=sb+" ";
	        }
	        System.out.println(revstr);
	}

}
