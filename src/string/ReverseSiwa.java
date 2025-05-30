package string;

public class ReverseSiwa {
	public static String reverseSingleWord(String input) {
		String split[] = input.split(" ");
		String fs = split[0];
		String ls = split[1];
		String res = "";
		for (int i = 0; i < fs.length(); i++) {
			res = fs.charAt(i) + res;
		}
		res = res + " " + ls;
		return res;
	}

	public static void main(String[] args) {
		String input = "siwa prasad";

		String result = reverseSingleWord(input);
		System.out.println(result);
	}
}
