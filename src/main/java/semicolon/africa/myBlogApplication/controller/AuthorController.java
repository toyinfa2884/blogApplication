package semicolon.africa.myBlogApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import semicolon.africa.myBlogApplication.data.models.Author;
import semicolon.africa.myBlogApplication.data.services.AuthorService;
import semicolon.africa.myBlogApplication.data.services.AuthorServiceImpl;
import semicolon.africa.myBlogApplication.dtos.requests.AddAuthorRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddAuthorResponse;

public class AuthorController {
    private AuthorService authorService = new AuthorServiceImpl();
    @PostMapping("/api/addAuthor")
    public AddAuthorResponse addAuthor(@RequestBody AddAuthorRequest addAuthorRequest){
        return  authorService.addAuthor(addAuthorRequest);
    }
    @GetMapping("/api/author/{id}")
    public Author findAuthorById(@PathVariable("id") String id){
        return authorService.findAuthorById(id);
    }
}
