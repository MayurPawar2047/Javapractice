package string;

public class ReverseWord {

	public static void main(String[] args) {

		String a = "I love Java";

//		String b[] = a.split(" ");
//		String reverse = "";
//		for (int i = b.length - 1; i >= 0; i--) {
//			reverse = reverse + (b[i] + " ");
//		}
//		// System.out.println(reverse);
		System.out.println(reversceString(a));
	}

	public static String reversceString(String str) {
		String res = "";
		String[] split = str.split(" ");
		for (int j = 0; j < split.length; j++) {
			for (int i = split[j].length() - 1; i >= 0; i--) {
				res += split[j].charAt(i);
			}
			res += " ";
		}
		return res;
	}

}
