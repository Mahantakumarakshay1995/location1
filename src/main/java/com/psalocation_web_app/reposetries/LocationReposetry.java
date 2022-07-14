package com.psalocation_web_app.reposetries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psalocation_web_app.entity.Location;

public interface LocationReposetry extends JpaRepository<Location, Long> {

}
