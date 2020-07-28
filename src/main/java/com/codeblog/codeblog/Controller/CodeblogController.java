package com.codeblog.codeblog.Controller;

import java.util.List;

import com.codeblog.codeblog.Models.Post;
import com.codeblog.codeblog.Service.ICodeblogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CodeblogController {
  
  @Autowired
  private ICodeblogService _service;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public ModelAndView GetPost () {
    ModelAndView view = new ModelAndView("posts");

    List<Post> posts = _service.findAll();

    view.addObject("AllPosts", posts);

    return view;
  }

  @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
  public ModelAndView GetPostDetails (@PathVariable("id") long id) {
    ModelAndView view = new ModelAndView("post-details");

    Post post = _service.findById(id);

    view.addObject("Post", post);

    return view;
  }

}