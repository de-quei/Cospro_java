package Test;

import java.util.*;
import java.util.Arrays;
public class Clothes_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
		int[] ret = sol.solution(shirtSize);
		// Press run button to receive output.
		System.out.println("Solution : retrun value of the method is " + Arrays.toString(ret));
	}

}
class Solution{
	public int[] solution(String[] shirtSize) {
		
		int[] answer = new int[6];
		
		for(int i = 0; i < answer.length; i++) {
			if(shirtSize[i].equals("XS")){
				answer[0]++;
			}else if(shirtSize[i].equals("S")) {
				answer[1]++;
			}else if(shirtSize[i].equals("M")) {
				answer[2]++;
			}else if(shirtSize[i].equals("L")) {
				answer[3]++;
			}else if(shirtSize[i].equals("XL")) {
				answer[4]++;
			}else if(shirtSize[i].equals("XXL")) {
				answer[5]++;
			}
		}
		
		return answer;
	}
	
}