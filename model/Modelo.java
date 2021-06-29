package br.edu.univas.model;

import br.edu.univas.exception.exception;
import br.edu.univas.vo.PaymentMethod;

public class Modelo {
	
	private long id;
	private String name;
	private String cpf;
	private PaymentMethod paymentMethod;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) throws exception {
		if(paymentMethod == null)
		throw new exception("Erro!");		
		
		this.paymentMethod = paymentMethod;
	}
	
}