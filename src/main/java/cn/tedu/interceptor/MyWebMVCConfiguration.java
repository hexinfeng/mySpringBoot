package cn.tedu.interceptor;

import javax.xml.ws.soap.Addressing;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * SringBoot拦截器的使用:
 * 1.使用2Configuration配置拦截器
 * 2.继承WebMvcConfigurerAdapter
 * 3.重写addInterceptors方法添加需要拦截的地址
 * @author Administrator
 */
@Configuration
public class MyWebMVCConfiguration extends WebMvcConfigurerAdapter{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		/*
		 * 拦截器配置
		 * 先配置的先拦截,后配置的后拦截
		 */
		
		//registry.addInterceptor(new OneInterceptor()).addPathPatterns("/hello/**");
		//registry.addInterceptor(new OneInterceptor()).addPathPatterns("/user/**");
		//拦截所有,放行部分
		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/*/**")
													 .excludePathPatterns("/hello/getRedis");
		
		super.addInterceptors(registry);
	}
}
