package com.pluralsight;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class PluralsightSpringcloudM3TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM3TaskApplication.class, args);
	}
	
	@Bean
	public TollProcessingTask tollProcessingTask () {
		return new TollProcessingTask();
	}
	
	
	public class TollProcessingTask implements CommandLineRunner {

		public void run(String... strings) throws Exception {
			// TODO Auto-generated method stub
			// Stationid, license plante, timestamp
			if ( strings != null) {
				String stationId = strings[1];
				String licensePlat = strings[2];
				String timesstamp = strings[3];
				System.out.println("PluralsightSpringcloudM3TaskApplication.TollProcessingTask.run() HA1 length = " + strings.length);
				System.out.println("PluralsightSpringcloudM3TaskApplication.TollProcessingTask.run() stationId = " + stationId + ",licensePlat=" + licensePlat + ",timesstamp=" + timesstamp);
			}
			
		}
		
	}
}
