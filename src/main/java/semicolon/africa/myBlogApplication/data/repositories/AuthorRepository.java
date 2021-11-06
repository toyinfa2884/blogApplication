package semicolon.africa.myBlogApplication.data.repositories;

import semicolon.africa.myBlogApplication.data.models.Author;

import java.util.List;

public interface AuthorRepository {
    Author save(Author author);
    Author findAuthorById(String id);
    void delete(Author author);
    void delete(String id);
    List<Author> findAll();

}
