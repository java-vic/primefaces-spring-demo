package com.oneiotworld.sys.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.oneiotworld.sys.user.model.SysUser;
import com.oneiotworld.sys.user.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
  
  @Override
  public void add(SysUser sysUser) {
    System.out.println("执行添加操作");
  }
  
  @Override
  public void modify(SysUser sysUser) {
    System.out.println("执行修改操作");
  }
  
  public List<SysUser> createTempDate(int size) {
    List<SysUser> temp = new ArrayList<SysUser>();
    for (int i = 0; i < size; i++) {
      temp.add(new SysUser("USER_" + (i + 1), "NAME_" + (i + 1), "13500000000", 40, 1, 0));
    }
    return temp;
  }
  
}
