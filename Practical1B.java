import java.util.*;
public class Practical1B{
	public static void main(String args[]) {
		LinkedList<String> al1 = new LinkedList<String>();
		al1.add("Peter");
		al1.add("Harry");
		al1.add("Hagrid");
		al1.add("Ron");
		al1.add("John");
		System.out.println("Forward:");
		ListIterator<String> itr = al1.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nReverse:");
		while(itr.hasPrevious()) {
			while(itr.hasPrevious()) {
				System.out.println(itr.previous());
			}
		}
	}
}
