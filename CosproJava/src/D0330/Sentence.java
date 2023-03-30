package D0330;

class Solution{
	public String solution(String characters) {
		String res = "";
		res += characters.charAt(0);
		for(int i = 0; i < characters.length() - 1; i++) {
			if(characters.charAt(i) != characters.charAt(i+1)) {
				res += characters.charAt(i+1);
			}
		}
		return res;
	}
}
public class Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sol = new Solution();
		String characters = "senteeeencccccceeee";
		String ret = sol.solution(characters);
		
		System.out.println("Solution : return value of the method is " + ret + ". ");
	}

}
