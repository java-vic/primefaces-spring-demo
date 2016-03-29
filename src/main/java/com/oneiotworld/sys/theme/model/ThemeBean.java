package com.oneiotworld.sys.theme.model;

import java.io.Serializable;

/**
 * 版权：(C) 版权所有 深圳四海万联科技有限公司.
 *〈简述〉 主题bean
 * @author   steven
 * @since    2016年3月10日 上午9:49:20
 */
public class ThemeBean implements Serializable {

  /**
   * @Fields serialVersionUID : TODO(目的和意义)
   */
  private static final long serialVersionUID = 1L;

  /**
   * @Fields serialVersionUID : TODO(目的和意义)
   */
  
  private String uuid;
  
  private String themeName;
  
  

  public ThemeBean(String uuid, String themeName) {
    super();
    this.uuid = uuid;
    this.themeName = themeName;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getThemeName() {
    return themeName;
  }

  public void setThemeName(String themeName) {
    this.themeName = themeName;
  }
}
