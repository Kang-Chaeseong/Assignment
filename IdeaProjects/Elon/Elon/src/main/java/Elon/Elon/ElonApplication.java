package Elon.Elon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElonApplication {

	public static void main(String[] args) {
		Elon_Serve lombok = new Elon_Serve();
		lombok.setData("string");
		String data = lombok.getData();
		System.out.println("Elon"+ data);
		SpringApplication.run(ElonApplication.class, args);
	}

}
