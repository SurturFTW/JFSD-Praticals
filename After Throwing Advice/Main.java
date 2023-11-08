package practical6d;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
			voter voter1 = (voter) context.getBean("voter");
			voter1.setName("Pushkar");
			voter1.setAge(16);

		} catch (Exception e) {
			// Exception is handled by the aspect
		}
	}
}
