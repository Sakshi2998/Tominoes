package com.sms.tominoes.Beans;

public class GetCategoryRequestBean {

	private String name;

	public GetCategoryRequestBean(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
