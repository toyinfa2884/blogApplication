package semicolon.africa.myBlogApplication.dtos.requests;

import lombok.Data;

@Data
public class AddAuthorRequest {
    private String authorId;
    private String firstName;
    private String lastName;
    private String authorEmail;
    private  String phoneNumber;
}
