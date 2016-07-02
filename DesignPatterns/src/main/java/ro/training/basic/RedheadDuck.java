package ro.training.basic;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() { 
		quackBehaviour = new Quack();
		flyBehaviour   = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm a Redhead duck");
	}

}
