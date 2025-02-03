package com.karthik.demo;


/**
 * Hello world!
 *
 */
class Shape
{
	public void calculateArea()
	{
		
	}
		

}
class Circle extends Shape
{
	
	public void calculateArea(int r)
	{
		System.out.println(3.14*r*r);
	}
}
class Rectangle extends Shape
{
	
	public void calculateArea(int l, int b)
	{
		System.out.println(l*b);
	}
}
class Triangle extends Shape
{
	
	public void calculateArea(int b, int h)
	{
		System.out.println(0.5*b*h);
	}
}
class Employee 
{
	public static void main( String[] args )
    {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		c.calculateArea(5);
		r.calculateArea(5, 10);
		t.calculateArea(5,10);
    	
    }
}


