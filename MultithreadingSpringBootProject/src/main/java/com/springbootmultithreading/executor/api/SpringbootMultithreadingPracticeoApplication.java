package com.springbootmultithreading.executor.api;

import com.springbootmultithreading.executor.api.service.FilesStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringbootMultithreadingPracticeoApplication implements CommandLineRunner {
	@Resource
	FilesStorageService storageService;
// collected vide https://www.youtube.com/watch?v=3rJBLFA95Io&ab_channel=JavaTechie
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMultithreadingPracticeoApplication.class, args);
	}


	@Override
	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}
