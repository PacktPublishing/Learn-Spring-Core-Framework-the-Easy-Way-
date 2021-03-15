package org.company;

public class SampleBean {

	private AnotherBean anotherBean;

	public SampleBean() {
	}

	public SampleBean(AnotherBean anotherBean) {

		System.out.println("Constructor of SampleBean Called!");
		this.anotherBean = anotherBean;
	}

	public void sampleMethod(String message) {
		anotherBean.displayMessage(message);
	}
}
