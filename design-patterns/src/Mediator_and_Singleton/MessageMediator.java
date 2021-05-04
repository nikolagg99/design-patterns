package Mediator_and_Singleton;

public interface MessageMediator {
	void addUser(User user);
	
	void deleteUser(User user);
	
	void sendMessage(String message, User user);

}
