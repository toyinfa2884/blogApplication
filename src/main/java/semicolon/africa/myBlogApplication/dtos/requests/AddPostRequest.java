package semicolon.africa.myBlogApplication.dtos.requests;

import lombok.Data;



@Data
public class AddPostRequest {
    private String postTitle;
    private String postContent;
    private String postId;



}


