package semicolon.africa.myBlogApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import semicolon.africa.myBlogApplication.data.models.Post;
import semicolon.africa.myBlogApplication.data.services.PostService;
import semicolon.africa.myBlogApplication.data.services.PostServiceImpl;
import semicolon.africa.myBlogApplication.dtos.requests.AddPostRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddPostResponse;

public class PostController {
    private PostService postService = new PostServiceImpl();
    @PostMapping("/api/addPost")
    public AddPostResponse addPost(@RequestBody AddPostRequest addPostRequest){
        return  postService.addPost(addPostRequest);
    }
    @GetMapping("/api/post/{id}")
    public Post findPostById(@PathVariable("id") String id){
        return postService.findPostById(id);
    }
}
