package Data_Structures;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		
		map.put(90, "England");
		map.put(37, "India");
		map.put(55, "Australia");
		
		Set set=map.entrySet();
		Iterator itr1=set.iterator();
		while(itr1.hasNext()) {
			Map.Entry entry=(Map.Entry) itr1.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		

	}

}
