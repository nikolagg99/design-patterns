package Mediator_and_Singleton;

public class ChatUser extends User {

	Singleton connection = Singleton.getInstance();
	private boolean createdBot = false;
	
	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {		
		
		if(message == "addBot") {
			System.out.println(this.name + " sends: " + message);
			System.out.println("Chatbot added");
			createdBot = true;
		}
		System.out.println(createdBot);
		if(createdBot && connection.messageForForbiddenWord(message)) {
			System.out.println("User " + name + " was removed from the chat because he uses forbidden words!!!");
			mediator.deleteUser(this);
			this.deleted();
			return;
		}
		
		System.out.println(this.name + " sends: " + message);		
		mediator.sendMessage(message, this);
		
		
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " recieved: " + message);
	}
	
	public void deleted() {
		this.mediator = null;
	}

}
