package org.example.service2.service;

import org.springframework.stereotype.Service;

@Service
public class SomeService {
   public void someMethod(){
    System.out.println("hello final ");
  }

  public String processData(String data) {
    // New data processing feature
    return data.toUpperCase();
  }
}
