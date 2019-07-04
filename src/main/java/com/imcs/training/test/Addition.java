package com.imcs.training.test;

public class Addition {
	
	private Helper helper;
	
	
	public int add(int a, int b) {
		
		return helper.convertToPositive(a)+helper.convertToPositive(b);
	}


	public Helper getHelper() {
		return helper;
	}


	public void setHelper(Helper helper) {
		this.helper = helper;
	}

}
