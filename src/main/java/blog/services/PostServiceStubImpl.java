package blog.services;

import blog.models.Post;
import blog.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Objects;
import java.util.stream.Collectors;

public class PostServiceStubImpl implements PostService {
    private List<Post> posts = new ArrayList<Post>() {{
        add(new Post(1L, "First Post", "<p>Line #1.</p><p>Line #2</p>", null));
        add(new Post(2L, "Second Post",
                "Second post content:<ul><li>line 1</li><li>line 2</li></p>",
                new User(10L, "pesho10", "Peter Ivanov")));
        add(new Post(3L, "Post #3", "<p>The post number 3 nice</p>",
                new User(10L, "merry", null)));
        add(new Post(4L, "Forth Post", "<p>Not interesting post</p>", null));
        add(new Post(5L, "Post Number 5", "<p>Just posting</p>", null));
        add(new Post(6L, "Sixth Post", "<p>Another interesting post</p>", null));
    }};
    @Override
    public List<Post> findAll() {
        return this.posts;
    }
    @Override
    public List<Post> findLatest5() {
        return this.posts.stream().sorted((a, b) -> b.getDate().compareTo(a.getDate()))
                .limit(5)
                .collect(Collectors.toList());
    }
    @Override
    public Post findById(Long id) {
        return this.posts.stream()
                         .filter(p -> Objects.equals(p.getId(), id))
                         .findFirst()
                         .orElse(null);

    }
}