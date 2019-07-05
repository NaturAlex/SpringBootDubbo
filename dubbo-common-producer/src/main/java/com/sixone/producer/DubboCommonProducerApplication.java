package com.sixone.producer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sixone.producer")
@EnableDubboConfiguration
public class DubboCommonProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboCommonProducerApplication.class, args);
	}

}
