package com.cg.oms.exception;

public class DocumentNotFoundException extends RuntimeException{
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String msg;
		public DocumentNotFoundException(String msg)
		{
			this.msg=msg;
		}
		
	    @Override
	    public String getMessage()
	    {
	    	return msg;
	    }
}