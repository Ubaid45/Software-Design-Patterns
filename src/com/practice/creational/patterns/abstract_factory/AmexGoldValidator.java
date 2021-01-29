package com.practice.creational.patterns.abstract_factory;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {

		return false;
	}

}
