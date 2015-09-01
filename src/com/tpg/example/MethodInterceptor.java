package com.tpg.example;

import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class MethodInterceptor implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods,
			ITestContext context) {
		List<IMethodInstance> finalListOfMethods = new ArrayList<IMethodInstance>();
		
		for(IMethodInstance m :methods)
		{
			String testMethodName = m.getMethod().getMethodName();
			//System.out.println(testMethodName);
			if(testMethodName.equalsIgnoreCase("test1") )
			{
				finalListOfMethods.add(m);
			}
		}
		
		return finalListOfMethods;
	}

}
