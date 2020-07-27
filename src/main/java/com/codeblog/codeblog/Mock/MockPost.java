package com.codeblog.codeblog.Mock;

import com.codeblog.codeblog.Models.Post;
import com.codeblog.codeblog.Repository.CodeblogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// import javax.annotation.PostConstruct;

@Component
public class MockPost {
  @Autowired
  private CodeblogRepository _repo;

  // @PostConstruct
  public void savePosts () {
    List<Post> posts = new ArrayList<Post>();

    Post post1 = new Post();
    post1.setAuthor("Messias Soares");
    post1.setDescription("Post descrito por Messias Soares");
    post1.setTitle("Post de Messias Soares");
    post1.setPosted(LocalDate.now());
    Post post2 = new Post();
    post2.setAuthor("Luana Gomes");
    post2.setDescription("Post descrito por Luana Gomes");
    post2.setTitle("Post de Luana Gomes");
    post2.setPosted(LocalDate.now());
    Post post3 = new Post();
    post3.setAuthor("Jonny Soares");
    post3.setDescription("Post descrito por Jonny Soares");
    post3.setTitle("Post de Jonny Soares");
    post3.setPosted(LocalDate.now());
    Post post4 = new Post();
    post4.setAuthor("Bruno Rafael");
    post4.setDescription("Post descrito por Bruno Rafael");
    post4.setTitle("Post de Bruno Rafael");
    post4.setPosted(LocalDate.now());
    Post post5 = new Post();
    post5.setAuthor("Brenda Kelly");
    post5.setDescription("Post descrito por Brenda Kelly");
    post5.setTitle("Post de Brenda Kelly");
    post5.setPosted(LocalDate.now());
    Post post6 = new Post();
    post6.setAuthor("Eliane Soares");
    post6.setDescription("Post descrito por Eliane Soares");
    post6.setTitle("Post de Eliane Soares");
    post6.setPosted(LocalDate.now());

    posts.add(post1);
    posts.add(post2);
    posts.add(post3);
    posts.add(post4);
    posts.add(post5);
    posts.add(post6);

    for (Post post: posts) {
      Post postSaved = _repo.save(post);
      System.out.println(postSaved.getId().toString());
    }
  }
}