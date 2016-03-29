package com.oneiotworld.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * 版权：(C) 版权所有 深圳四海万联科技有限公司.
 *〈简述〉
 * @author   steven
 * @since    2015年12月18日 上午11:10:31
 */
@Component
public class SpringBeanFactoryUtils implements BeanFactoryAware {
  /** bean 工厂.*/
  @SuppressWarnings("unused")
  private static BeanFactory BEANFACTORY;
  
  /**
   * 注入BeanFactory实例
   * @param beanFactory bean工厂
   * @throws BeansException BeansException
   * @see org.springframework.beans.factory.BeanFactoryAware#setBeanFactory(org.springframework.beans.factory.BeanFactory)
   */
  public void setBeanFactory(BeanFactory beanFactory)
    throws BeansException {
    SpringBeanFactoryUtils.BEANFACTORY = beanFactory;
  }
  
  /**  
   * 这是一个便利的方法，帮助我们快速得到一个BEAN  
   * @param beanName bean的名字  
   * @return 返回一个bean对象  
   * @author wangdf 
   */
  public static Object getBean(String beanName) {
    WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
    Object bean = wac.getBean(beanName);
    return bean;
  }
  
  /**
   * 〈简述〉
   * @author steven
   * @since 2015年12月18日 上午11:12:17
   * @param clazz clazz
   * @param <T> 范型
   * @return bean
   */
  public static <T> T getBean2(Class<T> clazz) {
    WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
    T bean = wac.getBean(clazz);
    return bean;
  }
}
