package com.sm.graduation.common.interceptor;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Component
public class WebCfg implements WebMvcConfigurer {

    // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }


    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //添加了一个拦截器LoginInterceptor，用于拦截指定的URL路径
        //通过.addPathPatterns("/indexR","/indexA","/indexU")指定了需要拦截的URL路径模式，即/indexR、/indexA和/indexU
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/indexR","/indexA","/indexU");
        WebMvcConfigurer.super.addInterceptors(registry);   //调用父类的add'确保其他的拦截器也能正常工作
    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //设置视图控制器的优先级为最高
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        //视图控制器用于将指定的URL路径映射到对应的视图页面，可以简化URL与视图之间的映射配置
        WebMvcConfigurer.super.addViewControllers(registry);
    }
}
