package semicolon.africa.myBlogApplication.data.models;

import lombok.Data;

@Data
public class Comment {
    private String content;
    private String commentId;
    private String commenterName;

}
