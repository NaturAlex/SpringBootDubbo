package com.sixone.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sixone.consumer"})
@EnableDubboConfiguration
public class DubboCommonConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboCommonConsumerApplication.class, args);
	}

}
