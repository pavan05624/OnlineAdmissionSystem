package com.cg.oms.exception;

public class CollegeNotFoundException extends RuntimeException{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String msg;
	    public CollegeNotFoundException(String msg)
	    {
	        this.msg=msg;
	    }
	   
	    @Override
	    public String getMessage()
	    {
	        return msg;
	    }

	}

