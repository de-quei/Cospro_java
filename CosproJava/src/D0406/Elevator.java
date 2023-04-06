package D0406;

class Solution1{
	public int solution(int[] floors) {
		int dist = 0;
		int length = floors.length;
		for(int i = 1; i < length; i++) {
			dist += java.lang.Math.abs(floors[i] - floors[i-1]);
			// floors[i] - floors[i-1]의 절댓값을 누적
		}
		return dist;
	}
}
public class Elevator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution1 sol = new Solution1();
		
		int[] floors = new int[]{1, 2, 5, 4, 3};
		
		int ret = sol.solution(floors);
		System.out.println("Solution : return value of the method is : " + ret + ". ");
	}

}
