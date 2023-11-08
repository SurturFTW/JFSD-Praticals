package SpringBootException2.SpringBootException2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankController {
	Bank bank;

	@GetMapping("/openAccount")
	public String openAccount() {
		return "openAccount";
	}

	@PostMapping("/home")
	public String StartAccount(@RequestParam int amount, @RequestParam String name, Model model) {
		bank = new Bank(amount, name);
		model.addAttribute("amount", amount);
		model.addAttribute("name", name);
		return "home";
	}

	@GetMapping("home")
	public String updatedHome(Model model) {
		model.addAttribute("amount", bank.getAmount());
		model.addAttribute("name", bank.getName());
		return "home";
	}

	@PostMapping("/deposit")
	public String DepositMoney(@RequestParam int amount, Model model) {
		bank.deposit(amount);
		model.addAttribute("message", "Deposit successful.");
		return "deposit";
	}

	@PostMapping("/withdraw")
	public String WithdrawMoney(@RequestParam int amount, Model model) {
		try {
			bank.Withdraw(amount);
			model.addAttribute("message", "Withdraw successful.");
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "withdraw";
	}

	@GetMapping("/deposit")
	public String depositForm() {
		return "deposit";
	}

	@GetMapping("/withdraw")
	public String withdrawForm() {
		return "withdraw";
	}
}