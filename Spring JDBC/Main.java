package practical7a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		SportsDAO sportsDAO = (SportsDAO) context.getBean("sportsDAO");
		System.out.println("inserting 3 records \n" + "Football " + "Team " + 11 + "\n" + "Basketball " + "Team " + 5 + "\n" + "Tennis " + "Singles " + 2);
		
		//Insert records
		sportsDAO.insertSportsRecord("Football", "Team", 11);
		sportsDAO.insertSportsRecord("Basketball", "Team", 5);
		sportsDAO.insertSportsRecord("Tennis", "Singles", 2);

		//Display records after inserting
		System.out.println("\ndisplay table after inserting 3 records");
		sportsDAO.displayAllSportsRecords();
		
		//Update a record
		sportsDAO.updateSportsRecord(1, "Cricket", "Team", 11);
		
		//Display records after updating
		System.out.println("\ndisplay table after updating Football -> Cricket");
		sportsDAO.displayAllSportsRecords();

		//Delete a record
		sportsDAO.deleteSportsRecord(1);

		//Display records after deleting
		System.out.println("\ndisplay table after deleting id = 1 ");
		sportsDAO.displayAllSportsRecords();
	}
}
