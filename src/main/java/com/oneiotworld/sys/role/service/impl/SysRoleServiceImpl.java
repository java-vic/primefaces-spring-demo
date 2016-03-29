package com.oneiotworld.sys.role.service.impl;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.springframework.stereotype.Service;

import com.oneiotworld.sys.role.model.SysRole;
import com.oneiotworld.sys.role.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {

  @Override
  public TreeNode createSysRoleTreeNode() {
    TreeNode node = new DefaultTreeNode("root",null);
    for(int i=0;i<3;i++){
      TreeNode secondNode = new DefaultTreeNode(new SysRole("0_"+i, "name_"+i, null),node);
      for(int j=0;j<10;j++){
        @SuppressWarnings("unused")
        TreeNode threeNode = new DefaultTreeNode(new SysRole("0_"+i+j,"name_"+i+j,null),secondNode);
      }
    }
    return node;
  }
  
}
