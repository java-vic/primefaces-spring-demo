package com.oneiotworld.sys.role.model;

import java.io.Serializable;

/**
 * 版权：(C) 版权所有 深圳四海万联科技有限公司.
 *〈简述〉 系统角色 
 * @author   steven
 * @since    2016年3月9日 下午3:58:50
 */
public class SysRole implements Serializable{

  /**
   * @Fields serialVersionUID : TODO(目的和意义)
   */
  private static final long serialVersionUID = 1L;
  
  
  private String id;
  
  private String name;
  
  private String parentId;
  
  

  public SysRole() {
    super();
  }

  public SysRole(String id, String name, String parentId) {
    super();
    this.id = id;
    this.name = name;
    this.parentId = parentId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }
  
  
  
}
