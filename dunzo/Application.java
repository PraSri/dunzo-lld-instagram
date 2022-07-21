package dunzo;

import java.time.LocalDateTime;

public class Application {

    /**      User 	Following
             U1	    U2, U3
             U2	    U3
              U3	U4
              U4	NONE

     */



    public static void main(String[] args) {
        User u1 = new User("User1", 20);
        User u2 = new User("User2", 24);
        User u3 = new User("User3", 29);
        User u4 = new User("User4", 23);

        u1.follow(u2); u2.addFollower(u1);
        u1.follow(u3); u3.addFollower(u1);
        u2.follow(u3); u3.addFollower(u2);
        u3.follow(u4); u4.addFollower(u3);

        Post p1 = new Post("Post1", "Pic1", LocalDateTime.now());
        Post p2 = new Post("Post2", "Pic2", LocalDateTime.now());
        Post p3 = new Post("Post3", "Pic3", LocalDateTime.now());
        Post p4 = new Post("Post4", "Pic4", LocalDateTime.now());

        u1.post(p1);
        u2.post(p2);
        u3.post(p3);
        u4.post(p4);

        System.out.println("User 1 homefeed");
        u1.getHomeFeed().printHomeFeed();

        System.out.println("User 2 homefeed");
        u2.getHomeFeed().printHomeFeed();

        System.out.println("User 3 homefeed");
        u3.getHomeFeed().printHomeFeed();

        System.out.println("User 4 homefeed");
        u4.getHomeFeed().printHomeFeed();

    }
}
