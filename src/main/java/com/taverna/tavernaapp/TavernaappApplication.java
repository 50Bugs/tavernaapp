package com.taverna.tavernaapp;

import com.taverna.tavernaapp.parsing.ParsingData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TavernaappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TavernaappApplication.class, args);

		//System.out.println(ParsingData.parseFromDlabComUA());
	}

}
