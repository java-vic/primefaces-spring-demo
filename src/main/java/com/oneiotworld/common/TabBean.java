package com.oneiotworld.common;

import java.io.Serializable;

/**
 * 版权：(C) 版权所有 深圳四海万联科技有限公司.
 *〈简述〉
 * @author   steven
 * @since    2016年3月14日 下午2:03:25
 */

public class TabBean implements Serializable {
  
  /**
   * @Fields serialVersionUID : TODO(目的和意义)
   */
  private static final long serialVersionUID = 1L;
  
  /** tab Id.*/
  private String tabId;
  
  /** tab Name.*/
  private String tabName;
  
  /** 内嵌tab的URL页面.*/
  private String tabUrl;
  
  public TabBean(){
    
  }
  
  public TabBean(String tabId, String tabName, String tabUrl) {
    this.tabId = tabId;
    this.tabName = tabName;
    this.tabUrl = tabUrl;
  }



  public String getTabId() {
    return tabId;
  }
  
  public void setTabId(String tabId) {
    this.tabId = tabId;
  }
  
  public String getTabName() {
    return tabName;
  }
  
  public void setTabName(String tabName) {
    this.tabName = tabName;
  }

  public String getTabUrl() {
    return tabUrl;
  }

  public void setTabUrl(String tabUrl) {
    this.tabUrl = tabUrl;
  }
}
