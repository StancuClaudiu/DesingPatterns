package ro.training.basic;


public class DecoyDuck extends Duck {

	public DecoyDuck() { 
		quackBehaviour = new MuteQuack();
		flyBehaviour   = new FlyNoWay();
	}
	public void display() {
		System.out.println("I'm a decoy duck");
	}
	
}
