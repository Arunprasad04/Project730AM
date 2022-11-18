package org.excel;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class JunitTest1 extends BaseClass{

@Test
public void tc01() {
	String s="Java";
	System.out.println("tc01"+s);
	
}
@Test
public void tc02() {
	String s="Java";
	System.out.println("tc02 "+s);
}
}