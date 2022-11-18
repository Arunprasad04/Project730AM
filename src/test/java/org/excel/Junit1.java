package org.excel;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Junit1 extends  BaseClass1{

	@Test
	public void tc01() {
		System.out.println("tc01");
		Assert.assertTrue(false);
		System.out.println("tc01");
	}
}

