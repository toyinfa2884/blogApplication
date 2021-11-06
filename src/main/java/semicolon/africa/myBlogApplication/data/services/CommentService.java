package semicolon.africa.myBlogApplication.data.services;

import semicolon.africa.myBlogApplication.data.models.Comment;
import semicolon.africa.myBlogApplication.dtos.requests.AddCommentRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddCommentResponse;

public interface CommentService {
    AddCommentResponse addComment(AddCommentRequest addCommentRequest);
    Comment findCommentById(String id);
    void delete(Comment comment);
    void delete(String id);

}
