package com.ktn.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.ktn.utils.DataProviderUtils;

/**
 * Implements {@link org.testng.IAnnotationTransformer} to leverage certain functionality like updating the annotations of test
 * methods at runtime.
 * <pre>Please make sure to add the listener details in the testng.xml file</pre>
 * 
 * <pre>
 * <b>
 * </b>
 * </pre>
 * 
 * Jan 21, 2023 
 * @author Thrinath K
 * @version 1.0
 * @since 1.0
 * @see com.ktn.utils.DataProviderUtils
 */
public class AnnotationTransformer implements IAnnotationTransformer{

	/**
	 * Helps in setting the dataprovider, dataprovider class and retry analyser annotation to all the test methods
	 * at run time. 
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setDataProvider("getData");
		annotation.setDataProviderClass(DataProviderUtils.class);
		annotation.setRetryAnalyzer(RetryFailedTests.class);
	}

	

}
