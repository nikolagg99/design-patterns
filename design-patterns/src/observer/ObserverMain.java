package observer;

public class ObserverMain {

	public static void main(String[] args) {
		User user = new User();
		
		Observer follower1 = new UserFollower("gosho");
		Observer follower2 = new UserFollower("ivanIvanov");
		Observer follower3 = new UserFollower("petur.georgiev");
		Observer follower4 = new UserFollower("georgi_ivnov");
		
		user.follow(follower1);
		user.follow(follower2);
		user.follow(follower3);
		user.follow(follower4);
		
		user.setUser("petur.petrov");

	}

}
