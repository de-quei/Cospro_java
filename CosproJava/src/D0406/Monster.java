package D0406;

class Solution{
	public int solution(int attack, int recovery, int hp) {
		int count = 0;
		while(true){
			count += 1;
			hp -= attack;
			if(hp <= 0) {
				break;
			}
			hp += recovery;
		}
		return count;
	}
}
public class Monster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		
		int attack = 30;
		int recovery = 10;
		int hp = 60;
		
		int ret = sol.solution(attack, recovery, hp);
		System.out.println("Solution : return value of the method is : " + ret + ". ");
	}

}
