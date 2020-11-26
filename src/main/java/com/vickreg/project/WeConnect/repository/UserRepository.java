package com.vickreg.project.WeConnect.repository;

import com.vickreg.project.WeConnect.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
