package semicolon.africa.myBlogApplication.data.repositories;

import semicolon.africa.myBlogApplication.data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository{
    List<Comment> comments = new ArrayList<>();
    @Override
    public Comment save(Comment comment) {
        comments.add(comment);
        return findCommentById(comment.getCommentId());
    }

    @Override
    public Comment findCommentById(String id) {
        for(Comment comment : comments){
            if(comment.getCommentId().equalsIgnoreCase(id)){
                return comment;
            }
        }
        return null;
    }

    @Override
    public void delete(Comment comment) {
        comments.remove(comment);

    }

    @Override
    public void delete(String id) {
        Comment comment = findCommentById(id);
        comments.remove(comment);

    }

    @Override
    public List<Comment> findAll() {
        return comments;
    }
}
