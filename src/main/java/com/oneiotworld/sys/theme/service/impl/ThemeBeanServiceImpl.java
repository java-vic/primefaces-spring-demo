package com.oneiotworld.sys.theme.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.MediaSize.NA;

import com.oneiotworld.sys.theme.model.ThemeBean;
import com.oneiotworld.sys.theme.service.ThemeBeanService;

public class ThemeBeanServiceImpl implements ThemeBeanService {
  
  @Override
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
  
}
