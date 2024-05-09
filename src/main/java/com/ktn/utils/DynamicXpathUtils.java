package com.ktn.utils;

/**
 * Constructs a dynamic xpath at run time.
 * 
 * <pre>
 * <b>
 * </b>
 * </pre>
 * 
 * Jan 22, 2023 
 * @author Thrinath K
 * @version 1.0
 * @since 1.0
 */
public final class DynamicXpathUtils {
	
	/**
	 * Private constructor to avoid external instantiation
	 */
	private DynamicXpathUtils() {}
	
	/**
	 * Receives a wildcard string, replace the wildcard with the value and return to the caller
	 * @author Thrinath K
	 * Jan 22, 2023
	 * @param xpath Xpath with wildcard string
	 * @param value value to be replaced in place of wildcard
	 * @return dynamic xpath string
	 * 
	 */
	public static String getXpath(String xpath, String value) {
		return String.format(xpath, value);//a[text()='%s'] 
	}
	
	/**
	 * Receives a wildcard string, replace the wildcard with the value and return to the caller
	 * @author Thrinath K
	 * Jan 22, 2023
	 * @param xpath Xpath with wildcard string
	 * @param value1 value to be replaced in place of wildcard
	 * @param value2 value to be replaced in place of wildcard
	 * @return dynamic xpath string
	 */
	public static String getXpath(String xpath, String value1, String value2) {
		return String.format(xpath, value1,value2);
	}

	
	
}
