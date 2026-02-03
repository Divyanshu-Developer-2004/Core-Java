package Day2_Assignment.Level2;
import java.util.*;
public class reversePolishNotation {
	public static void main(String[] args) {
		String s="23 3 * 1 *";
		System.out.println(evaluate(s));
	}
	
	public static double evaluate(String s) {
	    Stack<Double> st = new Stack<>();
	    String[] tokens = s.split("\\s+");
	    String operators="+-/*%";

	    for (String token : tokens) {
	        if (token.matches("-?\\d+")) {
	            st.push(Double.parseDouble(token));
	        } else if(token.length()==1 && operators.contains(token)){
	        	
	            double a = st.pop();
	            double b = st.pop();
	            switch (token) {
	                case "+" -> st.push(b + a);
	                case "-" -> st.push(b - a);
	                case "*" -> st.push(b * a);
	                case "/" -> st.push(b / a);
	                case "%" -> st.push(b % a);
	            }
	        }
	    }
	    if(st.size()==1)
	    	return st.pop();
	    else {
	    	System.out.println("Expression is Invalid");
	    	return Integer.MIN_VALUE;
	    }
	}
}
