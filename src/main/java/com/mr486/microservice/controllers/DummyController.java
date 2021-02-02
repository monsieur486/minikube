package com.mr486.microservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class DummyController {

  @GetMapping("/")
  public String hello() throws UnknownHostException {
    return "<h1>Coucou ma Darling !!! Ca marche :"
      + InetAddress.getLocalHost().getHostName()
      +"</h1>";
  }

}
