package com.oneiotworld.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.component.tabview.Tab;
import org.primefaces.context.RequestContext;
import org.springframework.stereotype.Component;

@Component
@ManagedBean(name = "tabController")
@SessionScoped
public class TabController implements Serializable {
  
  /**
   * @Fields serialVersionUID : TODO(目的和意义)
   */
  private static final long serialVersionUID = 1L;
  
  /** tabList.*/
  private List<Tab> tabLists = new ArrayList<Tab>();
  
  public void addTab(String tabId, String tabName, String tabUrl) {
    Tab newTab= new Tab();
    newTab.setId("tab_"+tabId);
    newTab.setTitle(tabName);
    boolean isExist = false;
    for(Tab tab:tabLists){
      if(tab.getId().equals(newTab.getId())){
        isExist = true;
        break;
      }
    }
    
    if(!isExist){
      tabLists.add(newTab);
    }
//    TabBean tabBean = new TabBean(tabId, tabName, tabUrl);
//    boolean isExist = false;
//    for (TabBean tab : tabLists) {
//      String tempTabId = tab.getTabId();
//      if (tempTabId.equals(tabId)) {
//        isExist = true;
//        break;
//      }
//    }
//    if (!isExist) {
//      tabLists.add(tabBean);
//    }
//    selectTab(tabBean);
  }
  
  /** 选中已经添加的tab.*/
  public void selectTab(TabBean tabBean) {
    // FacesContext context = FacesContext.getCurrentInstance();
//    RequestContext.getCurrentInstance().execute("PF('mainTab').select(3)");
    String tabId = tabBean.getTabId();
    RequestContext.getCurrentInstance().execute("PF('mainTab').select('"+tabId+"')");
  }
  
  public void closeTab(TabBean tabBean) {
    tabLists.remove(tabBean);
  }

  public List<Tab> getTabLists() {
    return tabLists;
  }

  public void setTabLists(List<Tab> tabLists) {
    this.tabLists = tabLists;
  }
}
