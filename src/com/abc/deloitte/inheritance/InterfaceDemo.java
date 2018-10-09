package com.abc.deloitte.inheritance;

public interface InterfaceDemo {

	

	public class Cat extends Animal implements Hunter, Jumper, Runner {

		@Override
		public void run(int distance) {
			System.out.println("Cat jumping:" +distance+ " distance");
			
		}

		@Override
		public void jump(int distance) {
			System.out.println("Cat running " +distance+ " distance");
			
		}

		@Override
		public void hunt() {
			System.out.println("Cat is hunting");
			
		}

		@Override
		public void move(int distance) {
			System.out.println("Cat is moving " +distance+ " distance");
			
		}

		
	}

	
}


