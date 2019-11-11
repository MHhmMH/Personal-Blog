package blog.models;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

public class User {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String userName;

    @Getter
    @Setter
    private String passwordHash;

    @Getter
    @Setter
    private String fullName;

    @Getter
    @Setter
    private Set<Post> posts = new HashSet<>();

    public User(Long id, String userName, String fullName) {
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", fullName='" + fullName + '\'' +
                ", posts=" + posts +
                '}';
    }
}
