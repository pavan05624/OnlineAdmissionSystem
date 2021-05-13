package com.cg.oms.exception;

public class AdmissionNotFoundException extends RuntimeException{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String msg;
	    public AdmissionNotFoundException(String msg)
	    {
	        this.msg=msg;
	    }
	   
	    @Override
	    public String getMessage()
	    {
	        return msg;
	    }

	}
