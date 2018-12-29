package cn.tedu.controller;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.task.AsyncTask;

@RestController
@RequestMapping("tasks")
public class DoTask {
	/*
	 * 异步任务在发送短信,邮件,APP消息推送,节省运维凌晨发布的效率
	 */
	@Autowired
	private AsyncTask asyncTask;
	
	@RequestMapping("test1")
	public String test1() throws Exception {
		long start=System.currentTimeMillis();
		Future<Boolean>a=asyncTask.doTask11();
		Future<Boolean>b=asyncTask.doTask22();
		Future<Boolean>c=asyncTask.doTask33();
		Future<Boolean>d=asyncTask.doTask44();
		while(!a.isDone()||!b.isDone()||!c.isDone()||!d.isDone()) {
			if(a.isDone()&&b.isDone()&&c.isDone()&&d.isDone()) {
				break;
			}
		}
		long end=System.currentTimeMillis();
		String times="任务完成,共耗时:"+(end-start);
		System.out.println(times);
		return times;
	}
}
