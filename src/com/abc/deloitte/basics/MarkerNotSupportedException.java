package com.abc.deloitte.basics;

public class MarkerNotSupportedException extends IllegalArgumentException {
	public MarkerNotSupportedException() {
		super();
	}

	public MarkerNotSupportedException(String message) {
		super(message);

	}

	public MarkerNotSupportedException(Throwable throwable) {
		super(throwable);

	}

	public MarkerNotSupportedException(String message, Throwable throwable) {
		super(message, throwable);

	}

}
