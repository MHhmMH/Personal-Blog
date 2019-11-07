package blog.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Post {
    public Post() {
    }

    @Setter
    @Getter
    private Long id;

    @Setter
    @Getter
    private String title;

    @Setter
    @Getter
    private String body;

    @Setter
    @Getter
    private User author;

    @Setter
    @Getter
    private Date date = new Date();


    public Post(Long id, String title, String body, User author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", author=" + author +
                ", date=" + date +
                '}';
    }
}
