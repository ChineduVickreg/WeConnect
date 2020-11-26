package com.vickreg.project.WeConnect.model.user;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "relationship")
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User friendRequestSender;

    @ManyToOne
    private User friendRequestReceiver;

    private  int status = 1;
}
