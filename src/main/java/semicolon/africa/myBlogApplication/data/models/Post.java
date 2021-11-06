package semicolon.africa.myBlogApplication.data.models;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Post {
    private String content;
    private String title;
    private String postId;
    private List<Comment> comments = new ArrayList<>();
    private Author author;
    private String postDate;


    public void postDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }
}
