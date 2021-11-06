package semicolon.africa.myBlogApplication.data.repositories;

import semicolon.africa.myBlogApplication.data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository{
    List<Post> posts = new ArrayList<>();
    @Override
    public Post save(Post post) {
        posts.add(post);
        return findPostById(post.getPostId());
    }

    @Override
    public Post findPostById(String id) {
        for(Post post : posts){
            if(post.getPostId().equalsIgnoreCase(id)){
                return post;
            }
        }

        return null;
    }

    @Override
    public void delete(Post post) {
        posts.remove(post);

    }

    @Override
    public void delete(String id) {
        Post post = findPostById(id);
        posts.remove(post);

    }

    @Override
    public List<Post> findAll() {
        return posts;
    }
}
