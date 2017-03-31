package testAOP;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.cglib.proxy.MethodProxy;

public class Recomend implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor, ThrowsAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("�� ������ (MethodBeforeAdvice)");
		//if (��� �� �� ��) throw new Exception();
	}

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("����� ������ (AfterReturningAdvice)");

	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//bedore
		System.out.println("�� ������ (invocation.proceed())");

		invocation.proceed();
		//after
		System.out.println("����� ������ (invocation.proceed())");
		return null;
	}
	
	public void afterThrowing(Exception ex){
		System.out.println("��������������� ����������");

	}
	
	


}
