package semicolon.africa.myBlogApplication.data.services;

import semicolon.africa.myBlogApplication.data.models.Author;
import semicolon.africa.myBlogApplication.data.repositories.AuthorRepository;
import semicolon.africa.myBlogApplication.data.repositories.AuthorRepositoryImpl;
import semicolon.africa.myBlogApplication.dtos.requests.AddAuthorRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddAuthorResponse;
import semicolon.africa.myBlogApplication.utils.AuthorModelMapper;

import java.util.List;

public class AuthorServiceImpl implements AuthorService{
    private AuthorRepository authorRepository = new AuthorRepositoryImpl();
    @Override
    public AddAuthorResponse addAuthor(AddAuthorRequest addAuthorRequest) {
        Author author = AuthorModelMapper.map(addAuthorRequest);
        Author savedAuthor = authorRepository.save(author);
        AddAuthorResponse response = AuthorModelMapper.map(savedAuthor);
        return response;
    }

    @Override
    public AddAuthorResponse updateAuthor(AddAuthorRequest addAuthorRequest) {
        return null;
    }

    @Override
    public Author findAuthorById(String id) {
        return authorRepository.findAuthorById(id);
    }

    @Override
    public void deleteAuthor(Author author) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<Author> findAll(AddAuthorRequest addAuthorRequest) {
        return null;
    }
}
