package semicolon.africa.myBlogApplication.data.services;

import semicolon.africa.myBlogApplication.data.models.Post;
import semicolon.africa.myBlogApplication.dtos.requests.AddPostRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddPostResponse;

import java.util.List;

public interface PostService {
    AddPostResponse addPost(AddPostRequest addPostRequest);
    AddPostResponse updatePost(AddPostRequest addPostRequest);
    Post findPostById(String id);
    void deletePost(Post post);
    void deleteById(Integer id);
    List<Post> findAll(AddPostRequest addPostRequest);
}
