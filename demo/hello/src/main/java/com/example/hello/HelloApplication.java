package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class HelloApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initialData(){
		User user = new User();
		user.setName("disorn");
		userRepository.save(user);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(HelloApplication.class, args);

		int count = context.getBeanDefinitionCount();
		System.out.println(count);

//		String[] beans = context.getBeanDefinitionNames();
//		for (String bean : beans) {
//			String scope = context.getBeanFactory().getBeanDefinition(bean).getScope();
//			System.out.println(bean + " : " + scope);
//		}
	}

}
