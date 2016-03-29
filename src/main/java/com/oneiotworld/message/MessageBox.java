package com.oneiotworld.message;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.stereotype.Component;

/**
 * 版权：(C) 版权所有 深圳四海万联科技有限公司.
 *〈简述〉 消息提示框
 * @author   steven
 * @since    2016年2月24日 上午11:05:29
 */
@Component
@ManagedBean(name = "messageBox")
@ViewScoped
public class MessageBox implements Serializable {
  
  /**
   * @Fields serialVersionUID : TODO(目的和意义)
   */
  private static final long serialVersionUID = 1L;
  
  /** 消息类型.*/
  private String type;
  
  /** 消息内容.*/
  private String message;
  
  /** 是否是错误消息.*/
  private boolean isErrorMessage;
  
  public MessageBox() {
    this.type = null;
    this.message = null;
  }
  
  /**
   * 〈简述〉 设置警告消息
   * @author steven
   * @since 2016年2月24日 上午11:08:56
   * @param message 消息内容
   */
  public void setWaringMessage(String message) {
    resetMessage();
    this.type = "warn";
    this.isErrorMessage = true;
    this.message = message;
  }
  
  /**
   * 〈简述〉 设置提示消息
   * @author steven
   * @since 2016年2月24日 上午11:09:58
   * @param message 消息内容
   */
  public void setInfoMessage(String message) {
    resetMessage();
    this.type = "info";
    this.isErrorMessage = false;
    this.message = message;
  }
  
  /**
   * 〈简述〉 设置错误消息
   * @author steven
   * @since 2016年2月24日 上午11:10:30
   * @param message 消息内容
   */
  public void setErrorMessage(String message) {
    resetMessage();
    this.type = "error";
    this.isErrorMessage = true;
    this.message = message;
  }
  
  /**
   * 〈简述〉 重置消息
   * @author steven
   * @since 2016年2月24日 上午11:12:02
   */
  public void resetMessage() {
    this.type = null;
    this.message = null;
    this.isErrorMessage = false;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }

  public boolean isErrorMessage() {
    return isErrorMessage;
  }

  public void setErrorMessage(boolean isErrorMessage) {
    this.isErrorMessage = isErrorMessage;
  }
  
  
  
}
