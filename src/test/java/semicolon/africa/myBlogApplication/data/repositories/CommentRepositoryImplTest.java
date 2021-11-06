package semicolon.africa.myBlogApplication.data.repositories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.africa.myBlogApplication.data.models.Author;
import semicolon.africa.myBlogApplication.data.models.Comment;
import semicolon.africa.myBlogApplication.data.models.Gender;
import semicolon.africa.myBlogApplication.data.models.Post;

import static org.junit.jupiter.api.Assertions.*;

class CommentRepositoryImplTest {
    private CommentRepository commentRepository;

    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Author author = new Author();
        author.setAuthorId("12345");
        author.setAuthorUserName("toyin123");
        author.setFirstName("Agba");
        author.setLastName("Kareem");
        author.setAuthorEmail("toyinfatai@gmail.com");
        author.setAuthorProfession("Software Engineer");
        author.setAuthorPhoneNumber("09078563423");
        author.setGender(Gender.MALE);

        Post post = new Post();
        post.setPostId("01");
        post.setTitle("Food shortage in Africa");
        post.setAuthor(author);
        post.setContent("How to solve the problem of food shortage in Africa");

        Comment comment = new Comment();
        comment.setCommenterName("Linda");
        comment.setCommentId("01");
        comment.setContent("Food security");

        Comment saveComment = commentRepository.save(comment);
        assertEquals(comment, saveComment);


    }

    @Test
    void findCommentById() {
        Author author = new Author();
        author.setAuthorId("12345");
        author.setAuthorUserName("toyin123");
        author.setFirstName("Agba");
        author.setLastName("Kareem");
        author.setAuthorEmail("toyinfatai@gmail.com");
        author.setAuthorProfession("Software Engineer");
        author.setAuthorPhoneNumber("09078563423");
        author.setGender(Gender.MALE);

        Post post = new Post();
        post.setPostId("01");
        post.setTitle("Food shortage in Africa");
        post.setAuthor(author);
        post.setContent("How to solve the problem of food shortage in Africa");

        Comment comment = new Comment();
        comment.setCommenterName("Linda");
        comment.setCommentId("02");
        comment.setContent("Food security");
        Comment savedComment = commentRepository.save(comment);

        Comment foundCommentById = commentRepository.findCommentById("02");
        assertEquals(savedComment, foundCommentById);
    }

    @Test
    void delete() {
        Author author = new Author();
        author.setAuthorId("12345");
        author.setAuthorUserName("toyin123");
        author.setFirstName("Agba");
        author.setLastName("Kareem");
        author.setAuthorEmail("toyinfatai@gmail.com");
        author.setAuthorProfession("Software Engineer");
        author.setAuthorPhoneNumber("09078563423");
        author.setGender(Gender.MALE);

        Post post = new Post();
        post.setPostId("12345");
        post.setTitle("Food shortage in Africa");
        post.setAuthor(author);
        post.setContent("How to solve the problem of food shortage in Africa");

        Comment comment = new Comment();
        comment.setCommenterName("Linda");
        comment.setCommentId("9090");
        comment.setContent("Food security");
        commentRepository.save(comment);
        assertNotNull(commentRepository.findCommentById("9090"));

        commentRepository.delete(comment);
        assertNull(commentRepository.findCommentById("9090"));


    }

    @Test
    void testDelete() {
        Author author = new Author();
        author.setAuthorId("12345");
        author.setAuthorUserName("toyin123");
        author.setFirstName("Agba");
        author.setLastName("Kareem");
        author.setAuthorEmail("toyinfatai@gmail.com");
        author.setAuthorProfession("Software Engineer");
        author.setAuthorPhoneNumber("09078563423");
        author.setGender(Gender.MALE);

        Post post = new Post();
        post.setPostId("01");
        post.setTitle("Food shortage in Africa");
        post.setAuthor(author);
        post.setContent("How to solve the problem of food shortage in Africa");

        Comment comment = new Comment();
        comment.setCommenterName("Linda");
        comment.setCommentId("01");
        comment.setContent("Food security");
        commentRepository.save(comment);
        assertNotNull(commentRepository.findCommentById("01"));

        commentRepository.delete("01");
        assertNull(commentRepository.findCommentById("01"));
    }

    @Test
    void findAll() {
        Author author = new Author();
        author.setAuthorId("12345");
        author.setAuthorUserName("toyin123");
        author.setFirstName("Agba");
        author.setLastName("Kareem");
        author.setAuthorEmail("toyinfatai@gmail.com");
        author.setAuthorProfession("Software Engineer");
        author.setAuthorPhoneNumber("09078563423");
        author.setGender(Gender.MALE);

        Post post = new Post();
        post.setPostId("01");
        post.setTitle("Food shortage in Africa");
        post.setAuthor(author);
        post.setContent("How to solve the problem of food shortage in Africa");
        Comment comment = new Comment();
        comment.setCommenterName("Linda");
        comment.setCommentId("01");
        comment.setContent("Food security");

        commentRepository.save(comment);
        commentRepository.save(comment);
        commentRepository.save(comment);
        commentRepository.save(comment);
        commentRepository.save(comment);
        assertEquals(5, commentRepository.findAll().size());

    }
}