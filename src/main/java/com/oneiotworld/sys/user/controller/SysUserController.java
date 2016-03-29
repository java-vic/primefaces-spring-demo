package com.oneiotworld.sys.user.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.oneiotworld.common.BaseController;
import com.oneiotworld.sys.user.model.SysUser;
import com.oneiotworld.sys.user.service.SysUserService;

@Controller
@ManagedBean(name = "sysUserController")
@RequestScoped
public class SysUserController extends BaseController {
  
  /**
   * @Fields serialVersionUID : TODO(目的和意义)
   */
  private static final long serialVersionUID = 1L;
  
  private List<SysUser> sysUserLists;
  
  private SysUser selectedSysUser;
  
  private List<SysUser> selectedSysUsers;
  
  private SysUser sysUser;
  
  @Autowired
  SysUserService sysUserService;
  
  @PostConstruct
  public void init() {
    sysUserLists = sysUserService.createTempDate(10);
    selectedSysUser = null;
    selectedSysUsers = new ArrayList<SysUser>();
  }
  
  public void doAddBefore() {
    sysUser = new SysUser();
    System.out.println("DO ADD!!");
  }
  
  public void doUpdateBefore(){
    if(null!=selectedSysUser){
      sysUser = selectedSysUser;
    }
  }
  
  public void delSysUser(){
//    if(null != selectedSysUser){
//      sysUserLists.remove(selectedSysUser);
//      messageBox.setInfoMessage("删除成功!");
//    }
    if(null!=selectedSysUsers && selectedSysUsers.size()>0){
      System.out.println("删除数据的长度为："+selectedSysUsers.size());
      selectedSysUsers = new ArrayList<SysUser>();
      messageBox.setInfoMessage("删除数据成功");
    }
  }
  
  public void setErrorInfoMessage(){
    messageBox.setErrorMessage("有错误信息！");
  }
  
  public void setInfoMessage(){
    messageBox.setInfoMessage("验证成功");
  }
  
  public void saveSysUser() {
    if (StringUtils.isNotBlank(sysUser.getUuid())) {
      isError = true;
      sysUserService.modify(sysUser);
      messageBox.setInfoMessage("修改成功");
    } else {
//      sysUserService.add(sysUser);
//      sysUser.setUuid("1");
//      sysUserLists.add(sysUser);
      isError = false;
      messageBox.setErrorMessage("添加失败");
    }
  }
  
  public List<SysUser> getSysUserLists() {
    return sysUserLists;
  }
  
  public void setSysUserLists(List<SysUser> sysUserLists) {
    this.sysUserLists = sysUserLists;
  }
  
  public SysUser getSelectedSysUser() {
    return selectedSysUser;
  }
  
  public void setSelectedSysUser(SysUser selectedSysUser) {
    this.selectedSysUser = selectedSysUser;
  }
  
  public SysUser getSysUser() {
    return sysUser;
  }
  
  public void setSysUser(SysUser sysUser) {
    this.sysUser = sysUser;
  }
  
  public void setCurrentSelectSysUser() {
    sysUser = selectedSysUser;
  }
  
  public List<SysUser> createTempDate(int size) {
    List<SysUser> temp = new ArrayList<SysUser>();
    for (int i = 0; i < size; i++) {
      temp.add(new SysUser("USER_" + (i + 1), "NAME_" + (i + 1), "13500000000", 40, 1, 0));
    }
    return temp;
  }

  public List<SysUser> getSelectedSysUsers() {
    return selectedSysUsers;
  }

  public void setSelectedSysUsers(List<SysUser> selectedSysUsers) {
    this.selectedSysUsers = selectedSysUsers;
  }
  
  
  
}
