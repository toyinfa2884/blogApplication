package semicolon.africa.myBlogApplication.data.repositories;


import semicolon.africa.myBlogApplication.data.models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment save(Comment comment);
    Comment findCommentById(String id);
    void delete(Comment comment);
    void delete(String id);
    List<Comment> findAll();
}
