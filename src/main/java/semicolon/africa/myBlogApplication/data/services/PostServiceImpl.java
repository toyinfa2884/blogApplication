package semicolon.africa.myBlogApplication.data.services;

import semicolon.africa.myBlogApplication.data.models.Post;
import semicolon.africa.myBlogApplication.data.repositories.PostRepository;
import semicolon.africa.myBlogApplication.data.repositories.PostRepositoryImpl;
import semicolon.africa.myBlogApplication.dtos.requests.AddPostRequest;
import semicolon.africa.myBlogApplication.dtos.responses.AddPostResponse;
import semicolon.africa.myBlogApplication.utils.PostModelMapper;

import java.util.List;

public class PostServiceImpl implements PostService{
    private PostRepository postRepository = new PostRepositoryImpl();
    @Override
    public AddPostResponse addPost(AddPostRequest addPostRequest) {
        Post post = PostModelMapper.map(addPostRequest);
        Post savedPost = postRepository.save(post);
        AddPostResponse response = PostModelMapper.map(savedPost);
        return response;
    }

    @Override
    public AddPostResponse updatePost(AddPostRequest addPostRequest) {
        return null;
    }

    @Override
    public Post findPostById(String id) {
        return postRepository.findPostById(id);
    }

    @Override
    public void deletePost(Post post) {


    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<Post> findAll(AddPostRequest addPostRequest) {
        return null;
    }
}
