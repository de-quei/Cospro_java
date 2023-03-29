package D0329;

class Solution1{
	boolean solution1(String sentence) {
		String str = "";
		for(int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if(c != ' ' && c != '.' && c != ',') {
				str += c;
			}
		}
		int len = str.length();
		for(int i = 0; i < len / 2; i++) {
			if(str.charAt(i) != str.charAt(len-1-i)) {
				return false;
			}
		}
		return true;
	}
}
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 sol1 = new Solution1();
		String sentence1 = "never odd or even";
		boolean ret1 = sol1.solution1(sentence1);
		
		System.out.println("Solution : return value of the method is " + ret1 + ". ");
		
		String sentence2 = "palindrome";
		boolean ret2 = sol1.solution1(sentence2);
		
		System.out.println("Solution : return value of the method is " + ret2 + ". ");
	}

}
