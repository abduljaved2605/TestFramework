package com.retry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.IIOException;

public class MyTestResults {
	
	int passed;
	int failed;
	int skipped;
	
	public int getPassed()
	{
		return this.passed;
	}
	
	public int getFailed()
	{
		return this.failed;
	}
	
	
	public int getSkipped()
	{
		return this.skipped;
	}
	
	public int totalTest()
	{
		return (this.passed+this.failed+this.skipped);
	}
	
	public void incrementPassed()
	{
		this.passed++;
	}
	
	public void incrementFailed()
	{
		this.failed++;
	}
	
	public void incrementSkipped()
	{
		this.skipped++;
	}
	
	public void write() throws IOException
	{
		//FileInputStream fr = new FileInputStream("");
		//File file;
		FileWriter fw = new FileWriter("C:\\Automation\\new.txt");
		BufferedWriter fro = new BufferedWriter(fw);
		fro.write("pass"+this.passed);
		fro.write("failed"+this.failed);
		fro.write("Total"+this.totalTest());

		
	}

	private String tostring(int passed2) {
		// TODO Auto-generated method stub
		return null;
	}

	private FileOutputStream FileOutputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
