//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.05.22 às 09:03:14 PM BRT 
//


package br.com.eduardomelle.springws.client.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FahrenheitToCelsiusResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fahrenheitToCelsiusResult"
})
@XmlRootElement(name = "FahrenheitToCelsiusResponse")
public class FahrenheitToCelsiusResponse {

    @XmlElement(name = "FahrenheitToCelsiusResult")
    protected String fahrenheitToCelsiusResult;

    /**
     * Obtém o valor da propriedade fahrenheitToCelsiusResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFahrenheitToCelsiusResult() {
        return fahrenheitToCelsiusResult;
    }

    /**
     * Define o valor da propriedade fahrenheitToCelsiusResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFahrenheitToCelsiusResult(String value) {
        this.fahrenheitToCelsiusResult = value;
    }

}
