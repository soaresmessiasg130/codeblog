package com.codeblog.codeblog.Models;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import javax.persistence.*;

@Entity
@Table(name = "codeblog_post")
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long Id;

  @NotBlank
  private String Title;

  @NotBlank
  private String Author;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
  private LocalDate Posted;

  @NotBlank
  @Lob
  private String Description;

  public Long getId() {
    return Id;
  }

  public void setId(Long id) {
    Id = id;
  }

  public String getTitle() {
    return Title;
  }

  public void setTitle(String title) {
    Title = title;
  }

  public String getAuthor() {
    return Author;
  }

  public void setAuthor(String author) {
    Author = author;
  }

  public LocalDate getPosted() {
    return Posted;
  }

  public void setPosted(LocalDate posted) {
    Posted = posted;
  }

  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }

  
}