package com.vickreg.project.WeConnect.model.post;

import com.vickreg.project.WeConnect.model.user.User;
import com.vickreg.project.WeConnect.repository.PostRepository;
import com.vickreg.project.WeConnect.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PostTest {
    User userPost;
    Post myPost;

    @Autowired
    PostRepository postRepository;

    @Autowired
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userPost = new User();
        myPost = new Post();
    }

    @Test
    void createPost(){
     userPost= userRepository.findById(6L).orElseThrow();
     myPost.setAuthor(userPost);
     myPost.setPostBody("I want experience loving in marriage just as i have loved you in friendship");

     assertThat(postRepository.save(myPost)).isNotNull();
    }


    @Test
    void getAPostFromDb(){
       // userPost = userRepository.findById(3l).orElseThrow();
        postRepository.findById(13L).orElseThrow();
        myPost.getPostId();

        assertThat(postRepository.findById(13L)).isNotEmpty();
    }

    @Test
    void updatePost(){
        //userPost = userRepository.findById(1L).orElseThrow();
        postRepository.findById(10L).orElseThrow();
        myPost.getPostId();
        myPost.setPostBody("Money answers all things at all time. if you think am lying, kindly ask Solomon the great");


        assertThat(postRepository.findById(10L)).isNotEmpty();
    }

    @Test
    void DeletePost(){
        postRepository.deleteById(11L);
        myPost.getPostId();

        assertThat(postRepository.findById(11L)).isNotNull();
    }
}