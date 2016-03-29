package com.oneiotworld.demo.service.impl;

import org.springframework.stereotype.Service;

import com.oneiotworld.demo.service.TestModelService;

@Service(value="testModelService")
public class TestModelServiceImpl implements TestModelService {
  
  @Override
  public void addTestModel() {
    System.out.println("t");
  }
  
}
