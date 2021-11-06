package semicolon.africa.myBlogApplication.dtos.responses;

import lombok.Data;

@Data
public class AddAuthorResponse {
    private String authorId;
    private String firstName;
    private String lastName;
    private String authorEmail;

}
