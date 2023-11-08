import java.util.HashMap;
import java.util.Iterator;
class Customer {
    private Integer Account_no;
    private String Name;
    public Customer(Integer accountNo, String name) {
        this.Account_no = accountNo;
        this.Name = name;
    }
    public Integer getAccountNo() {
        return Account_no;
    }
    public String getName() {
        return Name;
    }
    @Override
    public String toString() {
        return "Account_no = " + Account_no + ", Name = " + Name;
    }
}
public class MapInterface {
    public static void main(String[] args) {
    	
        HashMap<Integer, Customer> cMap = new HashMap<>();

        // Adding customers
        cMap.put(101, new Customer(101, "Saitama"));
        cMap.put(102, new Customer(102, "Genos"));
        cMap.put(103, new Customer(103, "King"));

        // Print the elements in the HashMap
        System.out.println("Customers :");
        Iterator<Customer> customerIterator = cMap.values().iterator();
        while (customerIterator.hasNext()) {
            Customer customer = customerIterator.next();
            System.out.println(customer);
        }

        // Check if Account_no 101 is present
        int Check = 101;
        if (cMap.containsKey(Check)) {
            System.out.println("Customer with Account_no " + Check + " is present.");
        } else {
            System.out.println("Customer with Account_no " + Check + " is not present.");
        }

        // print the value of  Customer 101
        Customer customer101 = cMap.get(Check);
        if (customer101 != null) {
            System.out.println("Value for Customer 101: " + customer101);
        } else {
            System.out.println("Customer 101 not found in the HashMap.");
        }
    }
}
