package com.codeblog.codeblog.Service.Implement;

import java.util.List;

import com.codeblog.codeblog.Models.Post;
import com.codeblog.codeblog.Repository.CodeblogRepository;
import com.codeblog.codeblog.Service.ICodeblogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeblogServiceImplement implements ICodeblogService {
  @Autowired
  private CodeblogRepository _repo;

  @Override
  public List<Post> findAll() {
    return _repo.findAll();
  }

  @Override
  public Post findById(long id) {
    return _repo.findById(id).get();
  }

  @Override
  public Post save(Post post) {
    return _repo.save(post);
  }
}