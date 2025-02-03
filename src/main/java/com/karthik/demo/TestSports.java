package com.karthik.demo;

class Sports
{
	public void play()
	{
		
	}
}

class Football extends Sports
{
	public void play()
	{
		System.out.println("You're Playing Football");
	}
}
class Basketball extends Sports
{
	public void play()
	{
		System.out.println("You're playing Basketball");
	}
}
class Rugby extends Sports
{
	public void play()
	{
		System.out.println("You're Playing Rugby");
	}
}
class TestSports
{
	public static void main(String args [])
	{
		Football f = new Football();
		Basketball b = new Basketball();
		Rugby r = new Rugby();
		f.play();
		b.play();
		r.play();
	}
}