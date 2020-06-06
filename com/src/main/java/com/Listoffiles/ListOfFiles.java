package com.Listoffiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListOfFiles {
	
	public static void main(String[] args) throws IOException {
		String[] pathname;
		String path = "C:\\Automation\\ListOffiles.txt";
		File newFile = new File(path);
		if(!newFile.exists())
		{
			newFile.createNewFile();
			
		}
		
		FileOutputStream fos = new FileOutputStream(newFile);
		FileWriter fwriter = new FileWriter(newFile);
		
		
		File file = new File("C:\\Automation\\integration-tests-master\\carriyo_api_tests\\src\\main\\resources\\shipments\\carriers");
		pathname = file.list();
		for(String fileName:pathname)
		{
			fwriter.write(fileName);
			System.out.println(fileName);
			Files.write(Paths.get(path),fileName.getBytes());

		}
		
		
	}
	

}
