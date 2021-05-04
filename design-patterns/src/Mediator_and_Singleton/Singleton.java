package Mediator_and_Singleton;

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	
	public boolean messageForForbiddenWord(String message) {
		if(message.contains("cat")) {
			System.out.println("Warning!!!Forbidden word!!!");
			return true;
		}else {
			return false;
		}
		
	}

}
