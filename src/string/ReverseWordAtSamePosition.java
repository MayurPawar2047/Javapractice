package string;

public class ReverseWordAtSamePosition {

	public static void main(String[] args) {
		String a="I Love Java";
		System.out.println(reverseWords(a));

	}
	
	public static String reverseWords(String str)
	{
		String res="";
		String split[]=str.split(" ");
		for(int j=0;j<split.length;j++) {
			for(int i=split[j].length()-1;i>=0;i--) {
				res=res+split[j].charAt(i);
			}
			res+=" ";
			
		}
		return res;
	}

}
