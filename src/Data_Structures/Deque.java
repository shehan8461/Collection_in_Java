package Data_Structures;
import java.util.ArrayDeque;

public class Deque {
	public static void main(String[] args) {
		
		ArrayDeque <Integer> de1=new ArrayDeque<>();
		
		de1.add(12);
		de1.add(90);
		de1.add(45);
		de1.add(56);
		
		System.out.println(de1);
		
		de1.addFirst(2);//add first value 
		System.out.println(de1);
		
		de1.addLast(30);//add last value
		System.out.println(de1);
		
		de1.removeFirst();//remove first value
		System.out.println(de1);
		
		de1.removeLast();//remove last value
		System.out.println(de1);
		
		
		System.out.println("first value="+de1.peek());//print first value
		
		de1.poll();//delete first value
		System.out.println(de1);
		
		
	}
}
