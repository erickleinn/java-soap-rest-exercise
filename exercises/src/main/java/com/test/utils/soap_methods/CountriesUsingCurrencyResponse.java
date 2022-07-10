//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.07.10 às 05:14:33 PM GMT-03:00 
//


package com.test.utils.soap_methods;

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
 *         &lt;element name="CountriesUsingCurrencyResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/&gt;
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
    "countriesUsingCurrencyResult"
})
@XmlRootElement(name = "CountriesUsingCurrencyResponse")
public class CountriesUsingCurrencyResponse {

    @XmlElement(name = "CountriesUsingCurrencyResult", required = true)
    protected ArrayOftCountryCodeAndName countriesUsingCurrencyResult;

    /**
     * Obtém o valor da propriedade countriesUsingCurrencyResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public ArrayOftCountryCodeAndName getCountriesUsingCurrencyResult() {
        return countriesUsingCurrencyResult;
    }

    /**
     * Define o valor da propriedade countriesUsingCurrencyResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public void setCountriesUsingCurrencyResult(ArrayOftCountryCodeAndName value) {
        this.countriesUsingCurrencyResult = value;
    }

}
