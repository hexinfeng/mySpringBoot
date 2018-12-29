package cn.tedu.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {
	private static final SimpleDateFormat format=
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//定义每过1秒执行任务
	//@Scheduled(fixedRate=1000)
	//使用cron表达式来设定更灵活http://cron.qqe2.com
	//@Scheduled(cron="0/10 * * * * ? ")
	public void reportCurrentTime() {
		System.out.println("现在的时间:"+format.format(new Date()));
	}
}
