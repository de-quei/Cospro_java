package D0405;

class Solution1{
	public String solution(String[] words) {
		String answer = "";
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() >= 5) {
				answer += words[i];
			}
		}
		if(answer == "") {
			answer = "empty";
		}
		return answer;
	}
}
public class pastingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 sol = new Solution1();
		
		String[] words1 = {"my ", "favorite ", "color ", "is ", "violet "};
		String ret1 = sol.solution(words1);
		System.out.println("Solution : return value of the method is " + ret1 + ". ");
		
		String[] words2 = {"Yes", "I", "am"};
		String ret2 = sol.solution(words2);
		System.out.println("Solution : return value of the method is " + ret2 + ". ");
	}

}
