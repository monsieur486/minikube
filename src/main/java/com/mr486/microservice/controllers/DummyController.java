package com.mr486.microservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

  @GetMapping("/")
  public String hello(){
    return "Coucou ma Darling !!! Ca marche";
  }

}
