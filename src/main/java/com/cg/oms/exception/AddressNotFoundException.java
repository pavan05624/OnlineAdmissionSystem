package com.cg.oms.exception;

public class AddressNotFoundException extends RuntimeException {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String msg;
	    public AddressNotFoundException(String msg)
	    {
	        this.msg=msg;
	    }
	   
	    @Override
	    public String getMessage()
	    {
	        return msg;
	    }

	}

