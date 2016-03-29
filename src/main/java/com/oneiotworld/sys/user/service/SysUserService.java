package com.oneiotworld.sys.user.service;

import java.util.List;

import com.oneiotworld.sys.user.model.SysUser;

public interface SysUserService {
  public void add(SysUser sysUser);
  
  public void modify(SysUser sysUser);
  
  public List<SysUser> createTempDate(int size) ;
}
