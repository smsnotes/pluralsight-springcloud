package pluralsight.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {

	//@Bean(name="TaskProcessorA")
	@Bean
	 public TaskProcessor taskProcessor() {
		 return new TaskProcessor();
	 };
	 
	 
}
