package com.wzh.web;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wzh.web.dao")
@SpringBootApplication
public class ChapeterApplication implements CommandLineRunner{
	private Logger logger = LoggerFactory.getLogger(getClass());


	public static void main(String[] args) {
		SpringApplication.run(ChapeterApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		logger.info("");
	}
}
