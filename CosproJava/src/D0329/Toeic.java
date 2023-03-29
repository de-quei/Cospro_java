package D0329;

class Solution{
	public int solution(int[] scores) {
		int count  = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 650 && scores[i] < 800) {
				count++;
			}
		}
		return count;
	}
}
public class Toeic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int[] scores = {650, 722, 914, 558, 714, 803, 650, 679, 669, 800};
		int ret = sol.solution(scores);
		System.out.print("Solution : return of the method is " + ret + ". ");
		
	}

}
