import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PracticeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123# !_4 . 39464565!...  2";
		String str2 = "2478 4 3 21";
		String str3 = "-10 - 2 + (2 -1)";//-1 - 2
		
		System.out.println("Total is equal to: " + basicCalculator(str3));
	}

	
	public static int basicCalculator(String str) {
		
		Stack<Integer> integerStack = new Stack<>();
		String currentNumber = "";
		Integer total = 0;
		int operator = 1;
		
		for (int i = 0; i < str.length(); i++) {
			
			//2+3 (1+2+3-3) - 4
		
			if(str.charAt(i) == '+') {
				operator = 1;
				//System.out.println("Setting to 1 ");
			}
			else if(str.charAt(i) == '-') {
				operator = -1;
				//System.out.println("Setting to -1 ");
			}
			
			else if(str.charAt(i) == '(') {
				integerStack.push(total);
				integerStack.push(operator);
				total = 0;
				operator = 1;
				
			}
			else if(str.charAt(i) == ')') {
				//22
				//+
				//2
				total = integerStack.pop() * total;
				total += integerStack.pop();
			}
			
			else if(Character.isDigit(str.charAt(i))) {
				while(i < str.length() && Character.isDigit(str.charAt(i))) {
					currentNumber += str.charAt(i);
					i++;
				}
				
				total += Integer.valueOf(currentNumber) * operator;
				i--;
				//integerStack.push(total);
					
				currentNumber = "";
			}
			
			else {
				continue;
			}
		}	
		return total;
	}
	
	
	
}
