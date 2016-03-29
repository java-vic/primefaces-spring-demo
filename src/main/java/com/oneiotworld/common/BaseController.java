package com.oneiotworld.common;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.oneiotworld.message.MessageBox;

/**
 * 版权：(C) 版权所有 深圳四海万联科技有限公司.
 *〈简述〉 BaseController
 * @author   steven
 * @since    2016年2月24日 上午11:17:15
 */
public class BaseController implements Serializable {
  
  /**
   * @Fields serialVersionUID : TODO(目的和意义)
   */
  private static final long serialVersionUID = 1L;
  
  @Autowired
  protected MessageBox messageBox;
  
  /** 是否有错.*/
  protected boolean isError = true;

  public boolean isError() {
    return isError;
  }

  public void setError(boolean isError) {
    this.isError = isError;
  }
  
  
  
}
