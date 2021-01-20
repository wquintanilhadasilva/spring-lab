package com.lab.purchaselist.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.lab.purchaselist.exceptions.PurchaseItemException;

@ControllerAdvice
public class PurchaseItemAdvice {

	@ResponseBody
	@ExceptionHandler(PurchaseItemException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String employeeNotFoundHandler(PurchaseItemException ex) {
		return ex.getMessage();
	}

}
