package com.vickreg.project.WeConnect.model.post;

import com.vickreg.project.WeConnect.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinitions;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @ManyToOne
    private User commentAuthor;

    private String commentBody;

    @ManyToOne
    private Post post;

    private Date commentDate;
    private Time commentTime;



}
