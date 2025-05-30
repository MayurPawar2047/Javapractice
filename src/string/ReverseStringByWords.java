package string;

public class ReverseStringByWords {

	public static void main(String[] args) {
		
		String s="Life is beautiful enjoy it";
		String parts[]=s.split(" ");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
