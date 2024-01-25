package Data_Structures;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> numberlist=new ArrayList <Integer>();
		
		Scanner InputNumber=new Scanner(System.in);
		int num;
		
	for(int i=1;i<=5;i++) {
		System.out.print("Enter number "+i+":");
		num=InputNumber.nextInt();
		numberlist.add(num);
		
	}
	int total=0;
	for(Integer number:numberlist) {
		
		System.out.println(number);
		total=total+number;
	}
	System.out.println("Total ="+total);

	}

}
