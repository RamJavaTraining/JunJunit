package com.imcs.training.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnit44Runner;

import junit.framework.Assert;
import junit.framework.TestCase;

@RunWith(MockitoJUnit44Runner.class)
public class AdditionTest{
	private Addition addition;
	@Mock
	private Helper helper;
	
	@Before
	public void setUp() {
	 addition= new Addition();
	 addition.setHelper(helper);
	}
	
	
	@Test
	public void addPositve() {
		
		
		int actual=addition.add(-1, 1);
		Mockito.when(helper.convertToPositive(1)).thenReturn(1);
		Mockito.when(helper.convertToPositive(-1)).thenReturn(1);
		
		int expected=2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addNeg() {
	
		int actual=addition.add(1, -3);
		int expected=-2;
		Assert.assertEquals(expected, actual);
	}
}
