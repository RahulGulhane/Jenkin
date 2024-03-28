package com.BikkadIT.RollBackTrans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.RollBackTrans.Service.ServiceImpl;

@SpringBootApplication
public class RollBackTransApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RollBackTransApplication.class, args);
		ServiceImpl serviceImpl = context.getBean(ServiceImpl.class);
		
		serviceImpl.saveData();
	
	}

}
