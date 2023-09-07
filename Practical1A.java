import java.util.ArrayList;
import java.util.Iterator;
public class Practical1A {
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList <Integer>();
		arr.add(100);
		arr.add(101);
		arr.add(102);
		Iterator<Integer> itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
