package dunzo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeFeed {

    private List<Post> posts;

    private Map<User, List<Post>> allUserPost;

    public HomeFeed(User user, List<Post> posts) {
        this.posts = posts;
        allUserPost = new HashMap<>();
        allUserPost.put(user, posts);
    }

    public void addPostInHomeFeed(User user, List<Post> posts) {
        if (!allUserPost.containsKey(user)) {
            allUserPost.put(user, posts);
        } else {
            List<Post> postList = new ArrayList<>();
            postList.addAll(allUserPost.get(user));
            postList.addAll(posts);
            allUserPost.put(user, postList);
        }
        System.out.println("post added in homefeed by user : " + user.toString());
    }

    public void printHomeFeed() {
        for (Map.Entry<User, List<Post>> me : allUserPost.entrySet()) {
            System.out.println("User : " + me.getKey().toString());
            System.out.println("Post : " + me.getValue().toString());
        }
    }

}
