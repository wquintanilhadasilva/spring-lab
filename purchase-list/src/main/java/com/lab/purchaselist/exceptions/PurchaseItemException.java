package com.lab.purchaselist.exceptions;

public class PurchaseItemException extends RuntimeException{
	
	private static final long serialVersionUID = 1392809229185822215L;

	public PurchaseItemException(Throwable ex, String msg) {
		super(msg, ex);
	}

}
