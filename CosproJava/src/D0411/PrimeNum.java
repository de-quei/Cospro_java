package D0411;

class Solution{
	public int solution(int number) {
		int count = 0;	//소수의 개수를 누적할 변수
		while(number > 0) {
			int n = number%10;
			if(n == 2 || n == 3 || n == 5 || n == 7) {
				count++;
			}
			number /= 10;
		}
		return count;
	}
}
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int number = 29022531;
		int ret = sol.solution(number);
		
		System.out.println("Solution : return value of the method is " + ret + ".");
	}

}
