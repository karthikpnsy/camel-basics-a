package com.karthik.camelbasicsa.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FirstProcessor implements Processor{
	
	private Logger logger = LoggerFactory.getLogger(FirstProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		logger.info("logging value " + exchange.getMessage());
	}

}
