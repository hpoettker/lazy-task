package com.example.lazytask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.stereotype.Component;

@EnableTask
@SpringBootApplication
public class LazyTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazyTaskApplication.class, args);
	}

}

@Component
class TaskApplicationRunner implements ApplicationRunner {

	private static final Logger LOG = LoggerFactory.getLogger(TaskApplicationRunner.class);

	@Override
	public void run(ApplicationArguments args) {
		LOG.info("Hello World!");
	}

}
