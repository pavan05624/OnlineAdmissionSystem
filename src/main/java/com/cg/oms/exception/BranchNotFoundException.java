package com.cg.oms.exception;

public class BranchNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
    public BranchNotFoundException(String msg)
    {
        this.msg=msg;
    }
   
    @Override
    public String getMessage()
    {
        return msg;
    }

}
