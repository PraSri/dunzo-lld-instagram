package dunzo;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private int age;
    private List<User> followers;
    private List<User> following;
    private List<Post> postsByUser;
    private HomeFeed homeFeed;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
        this.postsByUser = new ArrayList<>();
    }

    public void follow(User user) {
        System.out.println("Started following : " + user.userName);
        following.add(user);
    }

    public void addFollower(User user) {
        System.out.println("Follower added : " + user.userName);
        followers.add(user);
    }

    public void post(Post post) {
        System.out.println(this.userName + " posted story : " + post.toString());
        postsByUser.add(post);
    }

    public HomeFeed getHomeFeed() {
        this.homeFeed = new HomeFeed(this, postsByUser);
        for (User user : following) {
            homeFeed.addPostInHomeFeed(user, user.postsByUser);
        }
        return homeFeed;
    }

    public List<User> getFollowers() {
        return this.followers;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
