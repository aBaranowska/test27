package com.rec.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Foo {

	@Autowired
	@Cold
	@Creamy
	private Dessert dessert;

	public Dessert getDessert() {
		return dessert;
	}

}
