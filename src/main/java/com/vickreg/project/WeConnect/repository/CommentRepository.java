package com.vickreg.project.WeConnect.repository;

import com.vickreg.project.WeConnect.model.post.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
