/**
 * 
 */
package com.ktn.exceptions;

/**
 * Jan 26, 2023 
 * @author Thrinath K
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("serial")
public class BrowserInvocationFailedException extends FrameworkException{
	
	/**
	 * Pass the message that needs to be appended to the stacktrace
	 * @param message Details about the exception or custom message
	 */
	public BrowserInvocationFailedException(String message) {
		super(message);
	}
	/**
	 * 
	 * @param message Details about the exception or custom message
	 * @param cause Pass the enriched stacktrace or customised stacktrace
	 */
	public BrowserInvocationFailedException(String message,Throwable cause) {
		super(message,cause);
	}

}
