package com.kh.toy.common.exception;

public class PageNotFoundException  extends RuntimeException{

	private static final long serialVersionUID = 521587827126031031L;

	public PageNotFoundException() {
		//stackTrace를 비워준다.
		this.setStackTrace(new StackTraceElement[0]);
	}
}
