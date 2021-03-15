package org.company;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TransactionAspect {

	@Around("execution(* LoanService.*(..))")
	public void aroundAdive(ProceedingJoinPoint pjp) throws Throwable {

		try {
			System.out.println("Begin Transaction..");
			pjp.proceed();
			System.out.println("Commit Transaction..");
		} catch (Exception e) {
			System.out.println("Rollback Transaction..");
		}
	}

}
