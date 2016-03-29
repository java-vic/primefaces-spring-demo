package com.oneiotworld.sys.theme.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.oneiotworld.sys.theme.model.ThemeBean;

@ManagedBean(name = "themeBeanController")
@SessionScoped
public class ThemeBeanController  implements Serializable {
  
  /**
   * @Fields serialVersionUID : TODO(目的和意义)
   */
  private static final long serialVersionUID = 1L;

  public List<ThemeBean> themeBeanLists;
  
  public String themeName="bootstrap";
  
  @PostConstruct
  public void init() {
    themeBeanLists = createThemeList();
  }
  
  public List<ThemeBean> createThemeList() {
    List<ThemeBean> list = new ArrayList<ThemeBean>();
    list.add(new ThemeBean("1", "bootstrap"));
    list.add(new ThemeBean("2", "afterdark"));
    list.add(new ThemeBean("3", "afternoon"));
    list.add(new ThemeBean("4", "afterwork"));
    list.add(new ThemeBean("5", "black-tie"));
    list.add(new ThemeBean("6", "blitzer"));
    list.add(new ThemeBean("7", "glass-x"));
    list.add(new ThemeBean("8", "home"));
    list.add(new ThemeBean("9", "midnight"));
    return list;
  }
  
  public List<ThemeBean> getThemeBeanLists() {
    return themeBeanLists;
  }
  
  public void setThemeBeanLists(List<ThemeBean> themeBeanLists) {
    this.themeBeanLists = themeBeanLists;
  }
  
  public String getThemeName() {
    return themeName;
  }
  
  public void setThemeName(String themeName) {
    this.themeName = themeName;
  }
  
}
