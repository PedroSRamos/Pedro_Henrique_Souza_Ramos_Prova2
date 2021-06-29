package br.edu.univas.controller;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

import br.edu.univas.exception.exception;
import br.edu.univas.model.Modelo;
import br.edu.univas.vo.AccountDebit;
import br.edu.univas.vo.BankSlip;
import br.edu.univas.vo.CreditCard;
import br.edu.univas.vo.PaymentMethod;
import br.edu.univas.vo.Pix;

public class CustomerController {
	
	private Scanner sc;
	private Random rd;
	
	public Modelo createCustomer() {
		
		try {
			sc = new Scanner(System.in);			
			
			rd = new Random();
			
			Modelo customer = new Modelo();
			
			System.out.println("Gerando ID...");
			customer.setId(rd.nextLong());
			
			System.out.println("Digite um nome:");
			customer.setName(sc.nextLine());
			
			System.out.println("Digite o CPF:");
			customer.setCpf(sc.nextLine());
			
			System.out.println("Digite um método de pagamento:");
			String s = sc.nextLine();
			PaymentMethod pm = null;
			
			if(s.equals(CreditCard.class.getSimpleName())) {
				CreditCard creditCard = new CreditCard();
				pm = creditCard;
			}
			else if(s.equals(AccountDebit.class.getSimpleName())) {
				AccountDebit accountDebit = new AccountDebit();
				pm = accountDebit;
			}
			else if(s.equals(Pix.class.getSimpleName())) {
				Pix pix = new Pix();
				pm = pix;
			}
			else if(s.equals(BankSlip.class.getSimpleName())) {
				BankSlip bankSlip = new BankSlip();
				pm = bankSlip;
			}
			
			customer.setPaymentMethod(pm);
			
			System.out.println("Customer criado com sucesso!");
			return customer;
			
		} catch (exception e) {
			e.setMessage("Erro na opção de pagamento!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			sc = new Scanner(System.in);
		}
		finally {
			sc.close();
		}
		
	return null;
	
	}

}