import java.util.ArrayList;
import java.util.Iterator;

class employee{
	int id;
	String name;
	int salary;
	employee(int id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
public class ArrayList{
	public static void main(String args[]) {
		employee e1 = new employee(1, "Peter", 30000);
		employee e2 = new employee(2, "John", 40000);
		employee e3 = new employee(3, "Harry", 20000);
		employee e4 = new employee(4, "Hagrid", 70000);
		employee e5 = new employee(5, "Ron", 10000);
		ArrayList<employee> al1 = new ArrayList<employee>();
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		al1.add(e4);
		al1.add(e5);
		Iterator itr = al1.iterator();
		while(itr.hasNext()) {
			employee emp = (employee)itr.next();
			System.out.println(emp.id + " " + emp.name + " " + emp.salary);
		}

        System.out.println("----------------------");

		al1.remove(e4);
		Iterator itr1 = al1.iterator();
		while(itr1.hasNext()) {
			employee emp1 = (employee)itr1.next();
			System.out.println(emp1.id + " " + emp1.name + " " + emp1.salary);
		} 
	} 
}
