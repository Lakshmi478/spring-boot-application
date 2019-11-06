package io.github.parj.hello;

import java.io.Serializable;

public class Addition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numberOne;
	private int numberTwo;

	public int getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}

}
