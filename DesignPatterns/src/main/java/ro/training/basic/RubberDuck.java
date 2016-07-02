package ro.training.basic;

public class RubberDuck extends Duck{
	
	public RubberDuck() { 
		quackBehaviour = new Squeak();
		flyBehaviour  = new FlyNoWay();
	}
	
	public void display() { 
		System.out.println("I'm a Rubber duck");
	}

}
