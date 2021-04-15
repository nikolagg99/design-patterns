package observer;

import java.util.ArrayList;

import java.util.List;

public class User implements Observable {

	private List<Observer> followers;
	private String user;
	
	public User() {
		this.followers = new ArrayList<>();
	}
	@Override
	public void follow(Observer observer) {
		this.followers.add(observer);
		observer.setUser(this);

	}

	@Override
	public void unfollow(Observer observer) {
		this.followers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.followers) {
			observer.update();
		}

	}

	@Override
	public String getUpdate() {
		return this.user;
	}
	
	public void setUser(String user) {
		this.user = user;
		this.notifyObservers();
	}

}
