package org.company;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogBeforeAndAfter {

	@Before("execution(* LoanService.*(..))")
	public void before(JoinPoint jp) {
		System.out.println("Entered : " + jp.getSignature().getDeclaringTypeName()+ " : " + jp.getSignature().getName());
	}

	@After("execution(* LoanService.*(..))")
	public void after(JoinPoint jp) throws Throwable {

		System.out.println("Exit : " + jp.getSignature().getDeclaringTypeName()+ " : " + jp.getSignature().getName());
	}

}
