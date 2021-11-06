package semicolon.africa.myBlogApplication.utils;

import semicolon.africa.myBlogApplication.data.models.Comment;
import semicolon.africa.myBlogApplication.dtos.requests.AddCommentRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddCommentResponse;

public class CommentModelMapper {
    public static Comment map(AddCommentRequest addCommentRequest) {
        Comment comment = new Comment();

        comment.setCommentId(addCommentRequest.getCommentId());
        comment.setCommenterName(addCommentRequest.getCommenterName());
        comment.setContent(addCommentRequest.getContent());

        return comment;
    }
    public  static AddCommentResponse map(Comment savedComment){
        AddCommentResponse response = new AddCommentResponse();

        response.setCommentId(savedComment.getCommentId());
        response.setCommenterName(savedComment.getCommenterName());
        response.setContent(savedComment.getContent());
        return response;
    }
}
