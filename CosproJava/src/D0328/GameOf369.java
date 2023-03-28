package D0328;

class Solution{
	public int solution(int number) {
		int count = 0;
		for(int i = 1; i <= number; i++) {
			int current = i;
			while(current != 0) {
				if(current%10 == 3 | current%10 == 6 | current%10 == 9) {
					count++;
					System.out.println("pair");
				}
				current = current / 10;
			}
			//System.out.println(i);
		}
		return count;
	}
}
public class GameOf369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int number = 40;
		int ret = sol.solution(number);
		
	}

}
