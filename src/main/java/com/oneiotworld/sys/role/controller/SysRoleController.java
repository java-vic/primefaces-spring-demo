package com.oneiotworld.sys.role.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.oneiotworld.sys.role.service.SysRoleService;

@Controller
@ManagedBean(name = "sysRoleController")
@ViewScoped
public class SysRoleController {
  
  @Autowired
  SysRoleService sysRoleService;
  
  private TreeNode sysRoleNode;
  
  private TreeNode selectedNode;
  
  @PostConstruct
  public void init() {
    sysRoleNode = sysRoleService.createSysRoleTreeNode();
  }
  
  public TreeNode getSysRoleNode() {
    return sysRoleNode;
  }
  
  public void setSysRoleNode(TreeNode sysRoleNode) {
    this.sysRoleNode = sysRoleNode;
  }
  
  public SysRoleService getSysRoleService() {
    return sysRoleService;
  }
  
  public void setSysRoleService(SysRoleService sysRoleService) {
    this.sysRoleService = sysRoleService;
  }
  
  public TreeNode getSelectedNode() {
    return selectedNode;
  }
  
  public void setSelectedNode(TreeNode selectedNode) {
    this.selectedNode = selectedNode;
  }
  
}
