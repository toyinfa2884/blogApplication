package semicolon.africa.myBlogApplication.data.repositories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.africa.myBlogApplication.data.models.Author;
import semicolon.africa.myBlogApplication.data.models.Comment;
import semicolon.africa.myBlogApplication.data.models.Gender;
import semicolon.africa.myBlogApplication.data.models.Post;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryImplTest {
    private  PostRepository postRepository;

    @BeforeEach
    void setUp() {
        postRepository = new PostRepositoryImpl();
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

        Comment comment = new Comment();
        comment.setCommenterName("Linda");
        comment.setCommentId("1234");
        comment.setContent("Food security");

        Post post = new Post();
        post.setPostId("123");
        post.setTitle("Food shortage in Africa");
        post.setAuthor(author);
        post.setContent("How to solve the problem of food shortage in Africa");

        Post savePost = postRepository.save(post);
        assertEquals(post, savePost);

    }

    @Test
    void findPostById() {
        Author author = new Author();
        author.setAuthorId("12345");
        author.setAuthorUserName("toyin123");
        author.setFirstName("Agba");
        author.setLastName("Kareem");
        author.setAuthorEmail("toyinfatai@gmail.com");
        author.setAuthorProfession("Software Engineer");
        author.setAuthorPhoneNumber("09078563423");
        author.setGender(Gender.MALE);

        Comment comment = new Comment();
        comment.setCommenterName("Linda");
        comment.setCommentId("12345");
        comment.setContent("Food security");

        Post post = new Post();
        post.setPostId("12345");
        post.setTitle("Food shortage in Africa");
        post.setAuthor(author);
        post.setContent("How to solve the problem of food shortage in Africa");
        Post savedPost = postRepository.save(post);

        Post foundPost = postRepository.findPostById("12345");
        assertEquals(savedPost, foundPost);
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

        Comment comment = new Comment();
        comment.setCommenterName("Linda");
        comment.setCommentId("12345");
        comment.setContent("Food security");

        Post post = new Post();
        post.setPostId("12345");
        post.setTitle("Food shortage in Africa");
        post.setAuthor(author);
        post.setContent("How to solve the problem of food shortage in Africa");
        postRepository.save(post);
        assertNotNull(postRepository.findPostById("12345"));

        postRepository.delete(post);
        assertNull(postRepository.findPostById("12345"));

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

        Comment comment = new Comment();
        comment.setCommenterName("Linda");
        comment.setCommentId("12345");
        comment.setContent("Food security");

        Post post = new Post();
        post.setPostId("12345");
        post.setTitle("Food shortage in Africa");
        post.setAuthor(author);
        post.setContent("How to solve the problem of food shortage in Africa");

        postRepository.save(post);
        assertNotNull(postRepository.findPostById("12345"));

        postRepository.delete("12345");
        assertNull(postRepository.findPostById("12345"));
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

        Comment comment = new Comment();
        comment.setCommenterName("Linda");
        comment.setCommentId("12345");
        comment.setContent("Food security");

        Post post = new Post();
        post.setPostId("12345");
        post.setTitle("Food shortage in Africa");
        post.setAuthor(author);
        post.setContent("How to solve the problem of food shortage in Africa");

        postRepository.save(post);
        postRepository.save(post);
        postRepository.save(post);
        postRepository.save(post);
        postRepository.save(post);
        assertEquals(5, postRepository.findAll().size());

    }
}