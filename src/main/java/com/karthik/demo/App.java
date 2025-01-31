package com.karthik.demo;


import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void addData(String Data)
	{
		System.out.println("Data "+Data);
		if(Data.equals("Karthikeeyan"))
		{
			System.out.println("Welcome");
		}
	}
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	String Data = sc.next();
    	int a = 5;
    	int b = 10;
    	add(a,b);
    	addData(Data);
        System.out.println( "Hello World!" );
    }
}

