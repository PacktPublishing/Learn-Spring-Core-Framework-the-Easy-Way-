package org.company;

import java.net.URL;
import java.util.Currency;

public class SampleBean {

	private Integer integer;
	private Double doubleVal;
	private Character character;
	private String String;
	private Currency currency;
	private URL url;

	public SampleBean(Integer integer, Double doubleVal, Character character, java.lang.String string,
			Currency currency, URL url) {
		super();
		this.integer = integer;
		this.doubleVal = doubleVal;
		this.character = character;
		String = string;
		this.currency = currency;
		this.url = url;
	}

	@Override
	public String toString() {
		return "SampleBean [integer=" + integer + ", doubleVal=" + doubleVal + ", character=" + character + ", String="
				+ String + ", currency=" + currency + ", url=" + url + "]";
	}

}
