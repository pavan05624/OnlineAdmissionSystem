package com.cg.oms.exception;

public class ProgramScheduledNotFoundException extends RuntimeException {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String msg;
		public ProgramScheduledNotFoundException(String msg)
		{
			this.msg=msg;
		}
		
	    @Override
	    public String getMessage()
	    {
	    	return msg;
	    }
	}


