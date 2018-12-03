package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication

@EnableTaskLauncher
/* @EnableTaskLauncher using the deployer know to pull the right task */
public class PluralsightSpringcloudTasksinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudTasksinkApplication.class, args);
	}
}
