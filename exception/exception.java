package br.edu.univas.exception;

public class exception extends Exception {

	private static final long serialVersionUID = 7708811962689475611L;
	
	private String message;
	
	public exception(String message) {
		super(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}