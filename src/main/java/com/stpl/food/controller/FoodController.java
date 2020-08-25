package com.stpl.food.controller;


import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.stpl.food.service.GraphQlService;

@RestController
public class FoodController {

  @Autowired
  private GraphQlService graphQLService;
  
  @PostMapping("/food")
  public ResponseEntity<Object> getAllFood(@RequestBody String query) {
    ExecutionResult execute = graphQLService.executeGraphQL(query);
    return new ResponseEntity<>(execute, HttpStatus.OK);
  }
}
