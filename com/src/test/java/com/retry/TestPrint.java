package com.retry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestPrint {
	
	public static String read() throws IOException
	{
		return new String(Files.readAllBytes(Paths.get("C:\\Automation\\new.txt")));
	}

	public static void main(String[] args) throws IOException {
	
		System.out.println(read());
		Files f1;
	//	 s1 = f1.readAllBytes(Paths.get(("C:\\Automation\\new.txt"));
		
		
}
}
