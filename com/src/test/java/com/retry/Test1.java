package com.retry;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.*;

public class Test1 {
	
	@Test
	public void test()
	{
		
	}
	@Test 
	public void firstTest(){
		System.out.println("My First Test");
	}

	@Test 
	public void secondTest(){
		int i = 1/0;
		System.out.println("My second Test");
	}
	
	
	
	/*
	 * public static void main(String[] args) { int i ; }
	 */
}
