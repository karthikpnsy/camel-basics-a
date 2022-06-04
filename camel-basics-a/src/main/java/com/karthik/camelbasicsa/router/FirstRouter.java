package com.karthik.camelbasicsa.router;

import java.time.LocalTime;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.karthik.camelbasicsa.bean.FirstBean;
import com.karthik.camelbasicsa.processor.FirstProcessor;

@Component
public class FirstRouter extends RouteBuilder{
	@Autowired
	private FirstBean bean;
	
	@Autowired
	private FirstProcessor processor;

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:first-timer?period=60000")
		//.transform().constant(LocalTime.now())
				.bean(bean, "printMessage")
				.process(processor)
		.to("log:first-timer-log");
		
	}
	


}
