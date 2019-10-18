package www.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[before] around 수행 전");
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		// 서비스 메소드
		Object returnObj = pjp.proceed();
		
		stopWatch.stop();
		
		System.out.println("[after] around 수행 후");
		System.out.println("- method : " + pjp.getSignature().getName());
		System.out.println("- 메소드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");
		return returnObj;
	}
}
