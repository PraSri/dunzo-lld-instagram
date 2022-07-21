package dunzo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private int likes;
    private String text;
    // url to static content
    private String multimedia;
    private List<String> comments;
    private LocalDateTime dateTime;

    public Post(String text, String multimedia, LocalDateTime dateTime) {
        this.text = text;
        this.multimedia = multimedia;
        this.dateTime = dateTime;
        this.comments = new ArrayList<>();
        this.likes = 0;
    }

    public void addComments(String comment) {
        System.out.println("Comment add : " + comment);
        this.comments.add(comment);
    }

    public void likePost() {
        System.out.println("Post liked!");
        this.likes++;
    }

    @Override
    public String toString() {
        return "Post{" +
                "likes=" + likes +
                ", text='" + text + '\'' +
                ", multimedia='" + multimedia + '\'' +
                ", comments=" + comments +
                ", dateTime=" + dateTime +
                '}';
    }
}
