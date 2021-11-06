package semicolon.africa.myBlogApplication.data.services;

import semicolon.africa.myBlogApplication.data.models.Comment;
import semicolon.africa.myBlogApplication.data.repositories.CommentRepository;
import semicolon.africa.myBlogApplication.data.repositories.CommentRepositoryImpl;
import semicolon.africa.myBlogApplication.dtos.requests.AddCommentRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddCommentResponse;
import semicolon.africa.myBlogApplication.utils.CommentModelMapper;

public class CommentServiceImpl implements CommentService{
    private CommentRepository commentRepository = new CommentRepositoryImpl();
    @Override
    public AddCommentResponse addComment(AddCommentRequest addCommentRequest) {
        Comment comment = CommentModelMapper.map(addCommentRequest);
        Comment savedComment = commentRepository.save(comment);
        AddCommentResponse response = CommentModelMapper.map(savedComment);
        return response;
    }

    @Override
    public Comment findCommentById(String id) {
        return commentRepository.findCommentById(id);
    }

    @Override
    public void delete(Comment comment) {

    }

    @Override
    public void delete(String id) {

    }
}
