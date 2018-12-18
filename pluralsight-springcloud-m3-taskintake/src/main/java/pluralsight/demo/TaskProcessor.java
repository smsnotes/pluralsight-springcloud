package pluralsight.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.cloud.task.launcher.TaskLaunchRequest;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;


@Component
@EnableBinding(Source.class)
public class TaskProcessor {

	@Autowired
	
	private Source source ;
	
	@Value("${taskAddress}")
	private String taskAddress;
	
	
	public void publichRequest(String payload) {
		
		// Info : GroupID:artifactID:jar:version;
		
		List<String> input = new ArrayList<String>(Arrays.asList(payload.split(",")));
		
		TaskLaunchRequest request = new TaskLaunchRequest(taskAddress,input, null,null, "TaskLaunchRequestFromTaskProcessor");
		
		System.out.println("TaskProcessor.publichRequest() create task request - taskAddress: " + taskAddress);
		
		GenericMessage<TaskLaunchRequest> message = new  GenericMessage<>(request);
		
		this.source.output().send(message);

	}
}
