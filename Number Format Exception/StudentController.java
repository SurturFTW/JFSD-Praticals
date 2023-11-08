package SpringBootException1.SpringBootException1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	@GetMapping("/calculate")
	public String showForm() {
		return "student-form";
	}

	@PostMapping("/calculate")
	public String ShowResult(@RequestParam String rollNo, @RequestParam String name, @RequestParam String subject,
			@RequestParam String marks, Model model) throws NumberFormatException {
		try {
			double mark = Double.parseDouble(marks);
			double percentage = (mark / 100) * 100;
			model.addAttribute("name", name);
			model.addAttribute("rollNo", rollNo);
			model.addAttribute("subject", subject);
			model.addAttribute("marks", marks);
			model.addAttribute("percentage", percentage);
			return "result";
		} catch (NumberFormatException ex) {
			model.addAttribute("error", "Invalid marks entered");
			return "student-form";
		}
	}
}
