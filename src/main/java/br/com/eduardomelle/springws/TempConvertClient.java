/**
 * 
 */
package br.com.eduardomelle.springws;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import br.com.eduardomelle.springws.client.gen.CelsiusToFahrenheit;
import br.com.eduardomelle.springws.client.gen.CelsiusToFahrenheitResponse;

/**
 * 
 */
public class TempConvertClient extends WebServiceGatewaySupport {

	public CelsiusToFahrenheitResponse celsiusToFahrenheit(String celsius) {
		CelsiusToFahrenheit request = new CelsiusToFahrenheit();
		request.setCelsius(celsius);

		CelsiusToFahrenheitResponse response = (CelsiusToFahrenheitResponse) getWebServiceTemplate()
				.marshalSendAndReceive(request,
						new SoapActionCallback("https://www.w3schools.com/xml/CelsiusToFahrenheit"));
		return response;
	}

}
