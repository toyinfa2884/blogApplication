package semicolon.africa.myBlogApplication.data.repositories;


import semicolon.africa.myBlogApplication.data.models.Post;

import java.util.List;

public interface PostRepository {
    Post save(Post post);
    Post findPostById(String id);
    void delete(Post post);
    void delete(String id);
    List<Post> findAll();
}
