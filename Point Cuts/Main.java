package practical6b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Deposit deposit = (Deposit) context.getBean("deposit");
		Withdraw withdraw = (Withdraw) context.getBean("withdraw");
		Beneficiary beneficiary = (Beneficiary) context.getBean("beneficiary");
		deposit.payment();
		withdraw.drawout();
		beneficiary.addBeneficiary();
	}
}
