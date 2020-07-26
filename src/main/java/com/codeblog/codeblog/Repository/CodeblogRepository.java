package com.codeblog.codeblog.Repository;

import com.codeblog.codeblog.Models.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {
  
}