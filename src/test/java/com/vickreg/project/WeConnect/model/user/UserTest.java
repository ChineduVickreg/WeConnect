package com.vickreg.project.WeConnect.model.user;

import com.vickreg.project.WeConnect.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {
    User myUser;

    @Autowired
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        myUser = new User();
    }

    @Test
    void createUser(){
        myUser.setUserName("Aisha");
        myUser.setPassword("password012412");
        myUser.setEmailAddress("aisha@gmail.com");
        myUser.setGender(Gender.FEMALE);
        assertThat(userRepository.save(myUser)).isNotNull();
    }

    @Test
    void confirmUserName(){
        myUser = userRepository.findById(12L).orElseThrow();
        String  userName = "Aisha";
        assertThat(userName).isEqualTo(myUser.getUserName());
    }

    @Test
    void confirmNumberOfUsersInDatabase(){
      List <User> allUser = userRepository.findAll();

      assertThat(allUser.size()).isEqualTo(10);
    }

    @Test
    void deleteUserById(){

        userRepository.deleteById(2L);
        List <User> allUser = userRepository.findAll();
        assertThat(allUser.size()).isEqualTo(0);
    }

}

// Write test for post
// write test  to update post
// write test for comment
// write test to know all the comment for a single post
// write test to know all the post by a single user
//write test for friendly request
