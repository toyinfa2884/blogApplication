package semicolon.africa.myBlogApplication.dtos.requests;

import lombok.Data;

@Data
public class AddCommentRequest {
    private String commentId;
    private String commenterName;
    private String content;
}
