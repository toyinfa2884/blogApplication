package semicolon.africa.myBlogApplication.dtos.responses;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
@Data
public class AddPostResponse {
    private String postTitle;
    private String postContent;
    private String postId;
    private  String authorId;





}
