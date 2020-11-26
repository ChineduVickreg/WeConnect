package com.vickreg.project.WeConnect.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vickreg.project.WeConnect.model.post.Comment;
import com.vickreg.project.WeConnect.model.post.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String userName;


    private String firstName;

    private String lastName;

    @Column(nullable = false)
    private String emailAddress;

    @Column(nullable = false)
    @JsonIgnore
    @ToString.Exclude
    private String password;


    private String phoneNumber;

    @OneToOne
    private Address address;


    private String profileImage;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Image> allImages;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Date dateOfBirth;

    private String location;

    private String bannerImage;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Video> allVideos;

    @OneToMany(mappedBy = "friendRequestSender", cascade = CascadeType.ALL)
    private  List<Friend> friendRequestSender;

    @OneToMany(mappedBy = "friendRequestReceiver", cascade = CascadeType.ALL)
    private  List<Friend> friendRequestReceiver;

    @OneToMany( mappedBy = "author", cascade = CascadeType.ALL)
    private List<Post> posts;

    @OneToMany( mappedBy = "commentAuthor", cascade = CascadeType.ALL)
    private  List<Comment> comments;
}



