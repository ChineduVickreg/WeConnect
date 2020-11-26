package com.vickreg.project.WeConnect.repository;

import com.vickreg.project.WeConnect.model.user.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Long> {
}
