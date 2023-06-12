package com.example.demo.repository

import com.example.demo.model.Post
import org.socialsignin.spring.data.dynamodb.repository.EnableScan
import org.springframework.data.repository.CrudRepository

@EnableScan
public interface PostRepository : CrudRepository<Post, String> {}