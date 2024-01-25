package Data_Structures;
import java.util.Stack;
public class stack {

	public static void main(String[] args) {
		Stack <Integer> stk1=new Stack <>();
		
		
		stk1.add(12);
		stk1.add(90);
		stk1.add(67);
		
		System.out.println("last value = "+stk1.peek());//print last value
		
		stk1.pop();//delete last value
		System.out.println(stk1);
		

	}

}
