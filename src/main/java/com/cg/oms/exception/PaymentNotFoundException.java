package com.cg.oms.exception;

public class PaymentNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
    public PaymentNotFoundException(String msg)
    {
        this.msg=msg;
    }
   
    @Override
    public String getMessage()
    {
        return msg;
    }
	

}
