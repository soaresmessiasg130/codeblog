package com.codeblog.codeblog.Service;

import java.util.List;

import com.codeblog.codeblog.Models.Post;

public interface ICodeblogService {

  List<Post> findAll();

  Post findById(long id);

  Post save(Post post);
  
}