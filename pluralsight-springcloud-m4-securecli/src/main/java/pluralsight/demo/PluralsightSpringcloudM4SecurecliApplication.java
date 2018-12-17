package pluralsight.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;

@SpringBootApplication
public class PluralsightSpringcloudM4SecurecliApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM4SecurecliApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("PluralsightSpringcloudM4SecurecliApplication.run()");
		
		ResourceOwnerPasswordResourceDetails ro = new ResourceOwnerPasswordResourceDetails();
		ro.setClientAuthenticationScheme(AuthenticationScheme.header);
		ro.setAccessTokenUri("http://localhost:9000/services/oauth/token");
		ro.setScope(Arrays.asList("toll_read"));
		
		ro.setClientId("pluralsight");
		ro.setClientSecret("pluralsightsecret");
		
		ro.setUsername("agoldberg");
		ro.setPassword("pass1");
		
		OAuth2RestTemplate ort = new OAuth2RestTemplate(ro);
		
		String tkeno = ort.getAccessToken().toString();
		System.out.println("PluralsightSpringcloudM4SecurecliApplication.run() tkeno  : " + tkeno );
		
		String s = ort.getForObject("http://localhost:9001/services/tolldata", String.class);
		System.out.println("PluralsightSpringcloudM4SecurecliApplication.run()results: " + s);
		
	}
}
