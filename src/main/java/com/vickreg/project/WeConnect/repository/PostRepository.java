package com.vickreg.project.WeConnect.repository;

import com.vickreg.project.WeConnect.model.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
