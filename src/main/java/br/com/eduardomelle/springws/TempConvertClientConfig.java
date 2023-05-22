/**
 * 
 */
package br.com.eduardomelle.springws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * 
 */
@Configuration
public class TempConvertClientConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("br.com.eduardomelle.springws.client.gen");
		return marshaller;
	}

	@Bean
	public TempConvertClient tempConvertClient(Jaxb2Marshaller marshaller) {
		TempConvertClient client = new TempConvertClient();
		client.setDefaultUri("https://www.w3schools.com/xml/tempconvert.asmx");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
