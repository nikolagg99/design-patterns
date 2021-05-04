package Mediator_and_Singleton;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}
	
	@Override
	public void sendMessage(String message, User user) {	
		for(User chatUser: this.users) {
			if(user != chatUser) {
				chatUser.receive(message);				
			}	
		}
	}

	@Override
	public void deleteUser(User user) {
		this.users.remove(user);
		
	}

	
}
