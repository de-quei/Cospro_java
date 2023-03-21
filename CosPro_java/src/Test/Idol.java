package Test;

import java.util.*;
import java.util.Arrays;

public class Idol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 sol = new Solution1();
		String[] group_name = {"르세라핌", "뉴진스", "에스파", "에스파", "르세라핌","여자친구"};
		
		int[] ret = sol.solution(group_name);
		// Press run button to receive output.
		System.out.println("Solution : retrun value of the method is " + Arrays.toString(ret));
	}

}
class Solution1{
	public int[] solution(String[] group_name) {
		
		int[] answer = new int[6];
		
		for(int i = 0; i < answer.length; i++) {
			
			if(group_name[i].equals("소녀시대")){
				answer[0]++;
			}else if(group_name[i].equals("르세라핌")) {
				answer[1]++;
			}else if(group_name[i].equals("뉴진스")) {
				answer[2]++;
			}else if(group_name[i].equals("에스파")) {
				answer[3]++;
			}else if(group_name[i].equals("오마이걸")) {
				answer[4]++;
			}else if(group_name[i].equals("트와이스")) {
				answer[5]++;
			}
		}
		
		return answer;
	}
	
}