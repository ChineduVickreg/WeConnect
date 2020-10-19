package com.vickreg.project.WeConnect.model.post;

import com.vickreg.project.WeConnect.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @ManyToOne
    private User author;

    private String postBody;

    @OneToMany
    private List<Comment> comment;

    private Date postDate;
    private Time postTime;


}
