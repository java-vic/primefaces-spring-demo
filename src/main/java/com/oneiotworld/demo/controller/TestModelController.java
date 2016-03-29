package com.oneiotworld.demo.controller;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.oneiotworld.common.BaseController;
import com.oneiotworld.demo.service.TestModelService;
import com.oneiotworld.message.MessageBox;

@Controller
@ManagedBean(name="testModelController")
@RequestScoped
public class TestModelController extends BaseController implements Serializable {
  /**
   * @Fields serialVersionUID : TODO(目的和意义)
   */
  private static final long serialVersionUID = 1L;
  private String name;
  
  @Autowired
  TestModelService testModelService;
  
  public TestModelController(){
    name = "vic";
  }

  public void msgBoxTest(){
    testModelService.addTestModel();
    System.out.println("执行添加操作");
//    messageBox.setErrorMessage("系统错误!");
  }
  
  public void msgBoxInfoTest(){
//    messageBox.setInfoMessage("添加成功");
  }
  
  public void msgBoxErrorTest(){
//    messageBox.setErrorMessage("添加失败");
  }
  
  public void msgBoxWaringTest(){
//    messageBox.setWaringMessage("警告信息");
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
