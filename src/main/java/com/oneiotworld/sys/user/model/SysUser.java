package com.oneiotworld.sys.user.model;

import java.io.Serializable;

/**
 * 版权：(C) 版权所有 深圳四海万联科技有限公司.
 *〈简述〉 系统用户
 * @author   steven
 * @since    2016年3月9日 下午3:58:15
 */
@SuppressWarnings("serial")
public class SysUser implements Serializable {
  
  private String uuid;
  
  private String name;
  
  private String phone;
  
  private Integer age;
  
  private Integer gender;
  
  private Integer userStatus;
  
  public SysUser(){
    
  }
  
  public SysUser(String uuid, String name, String phone, Integer age, Integer gender, Integer userStatus) {
    this.uuid = uuid;
    this.name = name;
    this.phone = phone;
    this.age = age;
    this.gender = gender;
    this.userStatus = userStatus;
  }

  public String getUuid() {
    return uuid;
  }
  
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getPhone() {
    return phone;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }
  
  public Integer getAge() {
    return age;
  }
  
  public void setAge(Integer age) {
    if (age < 0 || age > 150) {
      this.age = null;
    } else {
      this.age = age;
    }
  }
  
  public Integer getGender() {
    return gender;
  }
  
  public void setGender(Integer gender) {
    if(gender!=0 && gender!=1){
      this.gender = null;
    }else{
      this.gender = gender;
    }
  }
  
  public Integer getUserStatus() {
    return userStatus;
  }
  
  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }
  
}
