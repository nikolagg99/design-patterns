package Mediator_and_Singleton;

public class ChatRoomMain {

	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User ivan = new ChatUser(chat, "Ivan");
		User nikola = new ChatUser(chat, "Nikola");
		User petko = new ChatUser(chat, "Petko");
		
		nikola.send("hi guys");
		nikola.send("addBot");
		petko.send("I love my cat");
		nikola.send("omg he uses forbidden word");
		ivan.send("hello there. The chatbot will delete him from the chatroom");
	}

}
