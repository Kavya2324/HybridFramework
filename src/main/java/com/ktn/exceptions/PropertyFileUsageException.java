package com.ktn.exceptions;


/**
 * Runtime Exception occurs when the key or value fetched from the property file is null
 * Jan 21, 2023 
 * @author Thrinath K
 * @version 1.0
 * @since 1.0
 * @see com.ktn.constants.FrameworkConstants
 * @see com.ktn.utils.PropertyUtils
 */
@SuppressWarnings("serial")
public class PropertyFileUsageException extends FrameworkException{
	
	/**
	 * Pass the message that needs to be appended to the stacktrace
	 * @param message Details about the exception or custom message
	 */
	public PropertyFileUsageException(String message) {
		super(message);
	}
	
	/**
	 * 
	 * @param message Details about the exception or custom message
	 * @param cause Pass the enriched stacktrace or customised stacktrace
	 */
	public PropertyFileUsageException(String message,Throwable cause) {
		super(message,cause);
	}

}
