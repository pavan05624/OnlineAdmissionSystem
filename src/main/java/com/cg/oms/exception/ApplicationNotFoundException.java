package com.cg.oms.exception;

public class ApplicationNotFoundException extends RuntimeException{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String msg;
		public ApplicationNotFoundException(String msg) {
			this.msg = msg;
		}
		
	  @Override
	  public String getMessage() {
		return msg;
		  
		  
	  }

	}

