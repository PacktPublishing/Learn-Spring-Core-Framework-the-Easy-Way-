package org.company;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogBeforeAndAfter {

	@Before("execution(* LoanService.*(..))")
	public void before(JoinPoint jp) {
		System.out.println("Entered : " + jp.getSignature().getDeclaringTypeName()+ " : " + jp.getSignature().getName());
	}

	@AfterReturning("execution(* LoanService.*(..))")
	public void after(JoinPoint jp) throws Throwable {

		System.out.println("Exit : " + jp.getSignature().getDeclaringTypeName()+ " : " + jp.getSignature().getName());
	}
	
	@AfterThrowing("execution(* LoanService.*(..))")
	public void afterThrowing(JoinPoint jp) throws Throwable {

		System.out.println("Exception : " + jp.getSignature().getDeclaringTypeName()+ " : " + jp.getSignature().getName());
	}
	
}
