package com.cozentus.design;

public class SingletonClass {
	
	private static final SingletonClass link = new SingletonClass(); //using static reference while making object
	
	private SingletonClass() {} //Private Constructor 
	
	public static SingletonClass getLink() //Public Factory Method -> Classtype is used instead of int/float/string or void type
	{    
		return link;
	}
}