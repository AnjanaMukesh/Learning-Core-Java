package com.abc.deloitte.inheritance;

public abstract class Animal extends Object {
	boolean alive;{
		alive=true;  //initializer block (non-static)
	}
	
	
	public void eat(){
		System.out.println("Animal is eating.");
		
	}
	
	/*public void move(int distance){
		System.out.println("Animal is moving " +distance+ " distance.");
	}*/
	public abstract void move(int distance);	
	

}
