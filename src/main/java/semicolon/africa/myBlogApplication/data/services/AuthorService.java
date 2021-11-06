package semicolon.africa.myBlogApplication.data.services;

import semicolon.africa.myBlogApplication.data.models.Author;
import semicolon.africa.myBlogApplication.data.models.Post;
import semicolon.africa.myBlogApplication.dtos.requests.AddAuthorRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddAuthorResponse;


import java.util.List;

public interface AuthorService {
    AddAuthorResponse addAuthor(AddAuthorRequest addAuthorRequest);
    AddAuthorResponse updateAuthor(AddAuthorRequest addAuthorRequest);
    Author findAuthorById(String id);
    void deleteAuthor(Author author);
    void deleteById(Integer id);
    List<Author> findAll(AddAuthorRequest addAuthorRequest);
}
