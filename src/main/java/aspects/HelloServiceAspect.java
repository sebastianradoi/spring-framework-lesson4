package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {
/*
	@Before("execution(* services.HelloService.hello(..))")
	public void beforeHello(){
		System.out.println("Before");
	}

	@After("execution(* services.HelloService.hello(..))")
	public void afterHello(){
		System.out.println("After");
	}

	@AfterReturning("execution(* services.HelloService.hello(..))")
	public void afterReturningHello(){
		System.out.println("AfterReturning");
	}

	@AfterThrowing("execution(* services.HelloService.hello(..))")
	public void afterThrowingHello(){
		System.out.println("AfterThrowing");
	}
*/

	@Around("execution(* services.HelloService.hello(..))")
	public Object around(ProceedingJoinPoint jointPoint) {
		System.out.println("Before");
		Object result = null;
		try {
			result = jointPoint.proceed(new Object[]{"Bill"});
			System.out.println("After");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return result;
	}
}
