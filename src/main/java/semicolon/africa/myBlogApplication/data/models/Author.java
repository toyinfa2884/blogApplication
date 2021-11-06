package semicolon.africa.myBlogApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Author {
    private String authorId;
    private String firstName;
    private String lastName;
    private String authorUserName;
    private String authorEmail;
    private String authorPhoneNumber;
    private String authorProfession;
    private Gender gender;
    private List<Post> posts = new ArrayList<>();
}
