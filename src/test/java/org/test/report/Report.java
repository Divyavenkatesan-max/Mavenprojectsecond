package org.test.report;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Report {
	
	@Test
	public void finalreport() {
		Result r = JUnitCore.runClasses(A.class, B.class, C.class);
		System.out.println("Run count:"+r.getRunCount());
		System.out.println("Failed count:"+r.getFailureCount());
		System.out.println("Run Time:"+r.getRunTime());
		System.out.println("Ignore case:"+r.getIgnoreCount());
		System.out.println("suote cases"+r.wasSuccessful());
		
		List<Failure> f = r.getFailures();
		for(Failure x:f) {
		   System.out.println(x);
		   System.out.println(x.getException());
		   
			
		}
	}

	
}
