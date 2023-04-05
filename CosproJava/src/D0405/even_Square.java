package D0405;

class Solution{
	public int solution(int N, int M) {
		int total = 0;
		for(int i = N; i <= M; i++) {
			if(i%2 == 0) {
				total += i * i;
			}
		}
		return total;
	}
}
public class even_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int N = 4;
		int M = 7;
		int ret = sol.solution(N, M);
		System.out.println("Solution : return value of the method is " + ret + ". ");
	}

}
