package semicolon.africa.myBlogApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import semicolon.africa.myBlogApplication.data.models.Comment;
import semicolon.africa.myBlogApplication.data.services.CommentService;
import semicolon.africa.myBlogApplication.data.services.CommentServiceImpl;
import semicolon.africa.myBlogApplication.dtos.requests.AddCommentRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddCommentResponse;

public class CommentController {
    private CommentService commentService = new CommentServiceImpl();
    @PostMapping("/api/addComment")
    public AddCommentResponse addComment(@RequestBody AddCommentRequest addCommentRequest){
        return  commentService.addComment(addCommentRequest);
    }
    @GetMapping("/api/comment/{id}")
    public Comment findCommentById(@PathVariable("id") String id){
        return commentService.findCommentById(id);
    }
}
