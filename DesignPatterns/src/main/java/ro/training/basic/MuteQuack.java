package ro.training.basic;

public class MuteQuack implements QuackBehaviour {
	
	public MuteQuack(){
		
	}

	public void quack() {
		System.out.println("<<Silence>>");
	}
}
