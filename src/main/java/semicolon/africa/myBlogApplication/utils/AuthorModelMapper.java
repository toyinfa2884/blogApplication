package semicolon.africa.myBlogApplication.utils;

import semicolon.africa.myBlogApplication.data.models.Author;
import semicolon.africa.myBlogApplication.dtos.requests.AddAuthorRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddAuthorResponse;

public class AuthorModelMapper {
    public static Author map(AddAuthorRequest addAuthorRequest) {
        Author author = new Author();

        author.setAuthorId(addAuthorRequest.getAuthorId());
        author.setLastName(addAuthorRequest.getFirstName());
        author.setLastName(addAuthorRequest.getLastName());
        author.setAuthorEmail(addAuthorRequest.getAuthorEmail());
        author.setAuthorPhoneNumber(addAuthorRequest.getPhoneNumber());
        return author;
    }
    public static AddAuthorResponse map(Author savedAuthor){
        AddAuthorResponse response = new AddAuthorResponse();

        response.setAuthorId(savedAuthor.getAuthorId());
        response.setAuthorEmail(savedAuthor.getAuthorEmail());
        response.setFirstName(savedAuthor.getFirstName());
        response.setLastName(savedAuthor.getLastName());
        return response;
    }
}
