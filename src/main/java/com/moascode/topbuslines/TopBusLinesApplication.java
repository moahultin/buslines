package com.moascode.topbuslines;

import com.moascode.topbuslines.journey.JourneyClient;
import com.moascode.topbuslines.journey.JourneyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TopBusLinesApplication {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Bean
	public JourneyService getJourneyService(){
		return new JourneyService();
	}

	@Bean
	public JourneyClient getJourneyClient(){
		return new JourneyClient();
	}

	public static void main(String[] args) {
		SpringApplication.run(TopBusLinesApplication.class, args);
	}

}
