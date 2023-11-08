package practical6d;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
public class IllegalVoterAspect {
	@AfterThrowing(pointcut = "execution(* aop_voter.voter.setAge(int))", throwing = "ex")
	public void handleIllegalVoterException(Exception ex) {
		System.out.println("After-throwing advice: " + ex.getMessage());
	}
}