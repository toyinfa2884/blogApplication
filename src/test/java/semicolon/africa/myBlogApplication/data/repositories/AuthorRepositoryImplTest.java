package semicolon.africa.myBlogApplication.data.repositories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.africa.myBlogApplication.data.models.Author;
import semicolon.africa.myBlogApplication.data.models.Gender;

import static org.junit.jupiter.api.Assertions.*;

class AuthorRepositoryImplTest {
    private AuthorRepository authorRepository;

    @BeforeEach
    void setUp() {
        authorRepository = new AuthorRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        //given that
        Author author = new Author();
        author.setAuthorId("12345");
        author.setFirstName("Micheal");
        author.setLastName("John");
        author.setAuthorEmail("michealjohn@gmail.com");
        author.setAuthorProfession("Teacher");
        author.setAuthorPhoneNumber("090456789");
        author.setAuthorUserName("john12");
        author.setGender(Gender.MALE);
        //when
        Author savedAuthor = authorRepository.save(author);
        //then
        assertEquals(author, savedAuthor);
    }
    @Test
    void addOneFemaleAuthorAndOneMaleAuthor(){
        Author author1 = new Author();
        author1.setAuthorId("345");
        author1.setFirstName("Mary");
        author1.setLastName("John");
        author1.setAuthorEmail("maryjohn@gmail.com");
        author1.setAuthorProfession("Industrialist");
        author1.setAuthorPhoneNumber("070786543");
        author1.setAuthorUserName("78Mary");
        author1.setGender(Gender.FEMALE);

        Author author2 = new Author();
        author2.setAuthorId("12345");
        author2.setFirstName("Micheal");
        author2.setLastName("John");
        author2.setAuthorEmail("michealjohn@gmail.com");
        author2.setAuthorProfession("Teacher");
        author2.setAuthorPhoneNumber("090456789");
        author2.setAuthorUserName("john12");
        author2.setGender(Gender.MALE);

        authorRepository.save(author1);
        authorRepository.save(author2);

        assertEquals(2, authorRepository.findAll().size());
        System.out.print (authorRepository.findAll());

    }


    @Test
    void findAuthorById() {
        //given that
        Author author = new Author();
        author.setAuthorId("12345");
        author.setFirstName("Micheal");
        author.setLastName("John");
        author.setAuthorEmail("michealjohn@gmail.com");
        author.setAuthorProfession("Teacher");
        author.setAuthorPhoneNumber("090456789");
        author.setAuthorUserName("john12");
        author.setGender(Gender.MALE);
        Author savedAuthor = authorRepository.save(author);

        //when
        Author foundAuthorById = authorRepository.findAuthorById("12345");
        //then
        assertEquals(savedAuthor, foundAuthorById);
    }

    @Test
    void delete() {
        //given that
        Author author = new Author();
        author.setAuthorId("12345");
        author.setFirstName("Micheal");
        author.setLastName("John");
        author.setAuthorEmail("michealjohn@gmail.com");
        author.setAuthorProfession("Teacher");
        author.setAuthorPhoneNumber("090456789");
        author.setAuthorUserName("john12");
        author.setGender(Gender.MALE);
        authorRepository.save(author);
        assertNotNull(authorRepository.findAuthorById("12345"));

        //when
        authorRepository.delete(author);
        //then
        assertNull(authorRepository.findAuthorById("12345"));
    }

    @Test
    void testDelete() {
        //given that
        Author author = new Author();
        author.setAuthorId("12345");
        author.setFirstName("Micheal");
        author.setLastName("John");
        author.setAuthorEmail("michealjohn@gmail.com");
        author.setAuthorProfession("Teacher");
        author.setAuthorPhoneNumber("090456789");
        author.setAuthorUserName("john12");
        author.setGender(Gender.MALE);
        authorRepository.save(author);
        assertNotNull(authorRepository.findAuthorById("12345"));

        //when
        authorRepository.delete("12345");
        //then
        assertNull(authorRepository.findAuthorById("12345"));
    }

    @Test
    void findAll() {
        //given that
        Author author = new Author();
        author.setAuthorId("12345");
        author.setFirstName("Micheal");
        author.setLastName("John");
        author.setAuthorEmail("michealjohn@gmail.com");
        author.setAuthorProfession("Teacher");
        author.setAuthorPhoneNumber("090456789");
        author.setAuthorUserName("john12");
        author.setGender(Gender.MALE);
        //when
        authorRepository.save(author);
        authorRepository.save(author);
        authorRepository.save(author);
        authorRepository.save(author);
        authorRepository.save(author);

        //then
        assertEquals(5, authorRepository.findAll().size());

    }
}