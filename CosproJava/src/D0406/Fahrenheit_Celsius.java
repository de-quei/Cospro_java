package D0406;

class Solution2{
	public int solution(int value, String unit) {
		int converted = 0;
		if(unit == "C") {
			converted = (int) ((value * 1.8) + 32);
		}
		else if(unit == "F") {
			converted = (int) ((value - 32) / 1.8);
		}
		return converted;
	}
}
public class Fahrenheit_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 sol = new Solution2();
		
		int value = 527;
		String unit = "C";
		
		int ret = sol.solution(value, unit);
		System.out.println("Solution : return value of the method is : " + ret + unit + ". ");
	}

}
