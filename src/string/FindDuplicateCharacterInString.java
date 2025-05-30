package string;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) {
		String str="PunePune";
		char ch[]=str.toLowerCase().toCharArray();
		 boolean isNotDuplicate=false;
		 
		 for(int i=0;i<str.length();i++)
		 {
			 boolean isDuplicate=true;
			 for(int j=i+1;j<str.length();j++)
			 {
				 if(ch[i]==ch[j]) {
					 isDuplicate=true;
					 break;
				 }
			}
			 
			 if(isDuplicate) {
				 System.out.println(ch[i]);
				 isNotDuplicate=true;
			 }				 
		 }
		 
		 if(!isNotDuplicate) {
			 System.out.println("No Duplicate are Found!");
		 }

	}

}
