package com.oneiotworld.common;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.commons.lang3.StringUtils;

/**
 * 版权：(C) 版权所有 深圳四海万联科技有限公司.
 *〈简述〉屏幕
 * @author   steven
 * @since    2016年2月24日 下午12:09:55
 */
@ManagedBean(name = "screen")
@SessionScoped
public class SessionScreen implements Serializable {
  
  /**
   * @Fields serialVersionUID : TODO(目的和意义)
   */
  private static final long serialVersionUID = 1L;
  
  /** 屏幕的宽度.*/
  private Integer width = 1024;
  
  /** 屏幕的高度.*/
  private Integer height = 768;
  
  public void onLoadListener() {
    String width = getRequestParameter("width");
    String height = getRequestParameter("height");
    if (StringUtils.isBlank(width)) {
      this.width = 1024;
    } else {
      this.width = Integer.valueOf(width);
    }
    
    if (StringUtils.isBlank(height)) {
      this.height = 768 - 72;
    } else {
      this.height = Integer.valueOf(height) - 72;
    }
  }
  
  /**
   * 〈简述〉 获取请求参数中的值 
   * @author steven
   * @since 2016年2月24日 下午12:14:13
   * @param key key值
   * @return key 对应的 value 值
   */
  protected String getRequestParameter(String key) {
    FacesContext context = FacesContext.getCurrentInstance();
    Map<String, String> map = context.getExternalContext().getRequestParameterMap();
    return (String) map.get(key);
  }
  
  public Integer getWidth() {
    return width;
  }
  
  public void setWidth(Integer width) {
    this.width = width;
  }
  
  public Integer getHeight() {
    return height;
  }
  
  public void setHeight(Integer height) {
    this.height = height;
  }
  
}
