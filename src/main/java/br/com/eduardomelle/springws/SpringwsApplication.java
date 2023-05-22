package br.com.eduardomelle.springws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 
 * https://www.w3schools.com/xml/tempconvert.asmx?WSDL
 * 
 */
@SpringBootApplication
public class SpringwsApplication {

	@Autowired
	private TempConvertClient client;

	public static void main(String[] args) {
		SpringApplication.run(SpringwsApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner() {
		return args -> {
			String celsius = "10";
			System.out.println(celsius + " celsius -> "
					+ this.client.celsiusToFahrenheit(celsius).getCelsiusToFahrenheitResult() + " fahrenheit");
		};
	}

}
