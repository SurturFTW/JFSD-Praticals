package practical7b;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		CricketerTemplate cricketerTemplate = (CricketerTemplate) context.getBean("cricketerTemplate");
		System.out.println("inserting 5 records");
		cricketerTemplate.insert("Pushkar", 50, 100);
		cricketerTemplate.insert("Prasad", 45, 100);
		cricketerTemplate.insert("Anish", 70, 110);
		cricketerTemplate.insert("Shreya", 30, 200);
		cricketerTemplate.insert("Mrudula", 60, 80);
		System.out.println("Listing Records...");
		List<cricketer> cricketers = cricketerTemplate.listCricketers();
		for (cricketer record : cricketers) {
			System.out.print("Name : " + record.getName());
			System.out.print(", Runs : " + record.getRuns());
			System.out.println(", Best score : " + record.getBestRuns());
		}
	}
}