package antoniogiovanni.marchese.u5w1l1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1L1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1L1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1L1Application.class);
		System.out.println(ctx.getBean("menu"));
	}

}
