package week5.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class LearnLsitener implements IRetryAnalyzer,IAnnotationTransformer {
	int iMaxRetry =1;
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && iMaxRetry<2) {
			iMaxRetry++;
			return true;
		}
		return false;
	}
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(this.getClass());		
	}
}
