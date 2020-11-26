package com.vickreg.project.WeConnect.repository;

import com.vickreg.project.WeConnect.model.user.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
