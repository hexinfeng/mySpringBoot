package cn.tedu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication//包含:@ComponentScan+@EnableAutoConfiguration+SpringBootConfiguration
//扫描mybatis mapper包路径
@MapperScan(basePackages= {"cn.tedu.mapper"})//如果不使用该注解则需要在持久层接口全部加上@Mapper注解,会创建该接口的实现类
//扫描所有需要的包,包含一些自用的工具包所在的路径
@ComponentScan(basePackages= {"cn.tedu"})//组件扫描
@EnableAutoConfiguration//自动读取配置
@EnableScheduling//开启定时任务,会自动扫描
@EnableAsync//开启异步任务,会自动扫描Component下的Async
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}

}

