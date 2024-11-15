package com.example.demo;
import com.example.repository.AdvancedGreetingRepository;
import com.example.repository.GreetingRepository;
import com.example.repository.SimpleGreetingRepository;
import com.example.service.AdvancedGreetingService;
import com.example.service.GreetingService;
import com.example.service.SimpleGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class DemoApplication {
	private static boolean flagInitiate = true;
    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
    }


	@Bean
    public GreetingRepository AdvancegreetingRepository() {
		if (flagInitiate){
			return new SimpleGreetingRepository();
		}else {
			return new AdvancedGreetingRepository();
		}

    }

    @Bean
    public GreetingService greetingService(GreetingRepository greetingRepository) {
        if (flagInitiate){
			return new SimpleGreetingService(greetingRepository);
		}else {
			return new AdvancedGreetingService(greetingRepository);
		}
	}
    }
