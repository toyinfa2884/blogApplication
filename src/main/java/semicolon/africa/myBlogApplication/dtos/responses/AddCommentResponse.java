package semicolon.africa.myBlogApplication.dtos.responses;

import lombok.Data;

@Data
public class AddCommentResponse {
    private String commenterName;
    private String content;
    private String commentId;
}
