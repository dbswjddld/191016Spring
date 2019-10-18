package www.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service 
@Aspect
class AfterReturningAdvice {
	@Pointcut("execution(* www..*Impl.*(..))")
	public void allPointCut() {};
	
	@AfterReturning(pointcut="allPointCut()", returning="returnObj")
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		System.out.println("[사후처리] 비즈니스 로직 수행 후 동작");
		System.out.println("- method : " + method);
		System.out.println("- return : " + returnObj);
		
	}
}
