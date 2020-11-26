package com.vickreg.project.WeConnect.repository;

import com.vickreg.project.WeConnect.model.user.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
