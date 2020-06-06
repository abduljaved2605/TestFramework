package com.Thread;



public class ThreadDemo {
	
	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(() ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hi");
				try {
				Thread.sleep(100); } catch (Exception e) { }
			}
		});
		
		Thread t2 = new Thread(() ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello");
				try {
				Thread.sleep(100); } catch (Exception e) { }
				}
				});
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
	t1.start();
	
	
	try {
		Thread.sleep(100); } catch (Exception e) { }
	
	t2.start();
		
	}

}
