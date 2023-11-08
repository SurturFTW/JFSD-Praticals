package practical6d;

public class voter {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Age must be at least 18 to vote.");
		} else {
			System.out.println("You are eligible to vote");
		}
		this.age = age;
	}
}
