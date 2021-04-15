package observer;

public class UserFollower implements Observer {
	
	private String name;
	private Observable followed;

	public UserFollower(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		
		if(this.followed == null) {
			System.out.println(this.getName() + " has no new followers!!!");
			return;
		}
		
		String newFollower = this.followed.getUpdate();
		System.out.println(this.getName()+ " received a new user: " + newFollower + " started following you");

	}

	@Override
	public void setUser(Observable user) {
		this.followed = user;

	}

	public String getName() {
		return name;
	}

}
