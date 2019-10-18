package www.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service // 자동으로 bean 등록 됨
@Aspect // pointcut설정 + advice
public class LogAdvice {
	@Pointcut("execution(* www..*Impl.*(..))")
	public void allPointCut() {}
	
	@Before("allPointCut()")
	public void printLog(JoinPoint jp) {
		String method = jp.getSignature().getName(); // 메소드 이름
		Object[] args = jp.getArgs(); // 매개변수
		String longString = jp.getSignature().toLongString();
		String shortString = jp.getSignature().toShortString();
		System.out.println("[공통로그]비즈니스 로직 수행 전 동작");
		System.out.println("- method : " + method);
		System.out.println("- toLongString :" + longString);
		System.out.println("- toShortString : " + shortString);
		System.out.println("- arguments " + (args != null && args.length > 0 ? args[0] : ""));
		
	}
}
