package semicolon.africa.myBlogApplication.utils;

import semicolon.africa.myBlogApplication.data.models.Post;
import semicolon.africa.myBlogApplication.dtos.requests.AddPostRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddPostResponse;

public class PostModelMapper {
    public static Post map(AddPostRequest addPostRequest) {
        Post post = new Post();

        post.setPostId(addPostRequest.getPostId());
        post.setTitle(addPostRequest.getPostTitle());
        post.setContent(addPostRequest.getPostContent());;
        return post;
    }
    public static AddPostResponse map(Post savedPost){
        AddPostResponse response = new AddPostResponse();

        response.setPostId(savedPost.getPostId());
        response.setPostTitle(savedPost.getTitle());
        response.setPostContent(savedPost.getContent());;
        return response;
    }
}
