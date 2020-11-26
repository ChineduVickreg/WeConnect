package com.vickreg.project.WeConnect.model.post;

import com.vickreg.project.WeConnect.model.user.User;
import com.vickreg.project.WeConnect.repository.CommentRepository;
import com.vickreg.project.WeConnect.repository.PostRepository;
import com.vickreg.project.WeConnect.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CommentTest {
    Comment comment;
    User authorOfPost;
    User userMakingComment;
    Post myPost;

    @Autowired
    CommentRepository commentRepository;
    UserRepository userRepository;
    PostRepository postRepository;

    @BeforeEach
    void setUp() {
        comment = new Comment();
        authorOfPost =new User();
        myPost = new Post();
        userMakingComment = new User();
    }

    @Test
    void createComment(){
        authorOfPost = userRepository.findById(12L).orElseThrow();
        myPost = postRepository.findById(10L).orElseThrow();
        comment.setCommentAuthor(userMakingComment);
        comment.setCommentBody("I absolutely disagree on this one, without money humanity will still exist");
        commentRepository.save(comment);

       assertNotNull(comment);
       System.out.println(comment);
    }
}