/**
 * Created by Dave on 4/25/17.
 */
public class Post {

    // Field variables for what each object "has"
    private int likes;
    private String comment;
    private  String description;

    // constructors
    Post(String description) {
        this.description = description;
        likes = 0;
        comment = null;
    }

    public void setLikes(int l) {
        likes = l;
    }

    public int getLikes() {
        return likes;
    }

    public void setComment(String c) {
        comment = c;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return description;
    }
}

class Tester {
    public static void main(String[] args) {
        Post firstPost = new Post("CS1 is boring");
        //System.out.println(firstPost);
        System.out.println(firstPost.toString());
        System.out.println(firstPost.getLikes());
        firstPost.setLikes(5);
        System.out.println(firstPost.getLikes());
        firstPost.setComment("This is a comment");
        System.out.println(firstPost.getComment());

    }
}
