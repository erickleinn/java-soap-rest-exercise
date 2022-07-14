//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.07.14 às 11:06:59 AM GMT-03:00 
//


package com.test.utils.soap_test;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.test.utils.soap_test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.test.utils.soap_test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPrimeNumberResponse }
     * 
     */
    public GetPrimeNumberResponse createGetPrimeNumberResponse() {
        return new GetPrimeNumberResponse();
    }

    /**
     * Create an instance of {@link GetPrimeNumberRequest }
     * 
     */
    public GetPrimeNumberRequest createGetPrimeNumberRequest() {
        return new GetPrimeNumberRequest();
    }

    /**
     * Create an instance of {@link GetCountryCurrencyRequest }
     * 
     */
    public GetCountryCurrencyRequest createGetCountryCurrencyRequest() {
        return new GetCountryCurrencyRequest();
    }

    /**
     * Create an instance of {@link GetCountryCurrencyResponse }
     * 
     */
    public GetCountryCurrencyResponse createGetCountryCurrencyResponse() {
        return new GetCountryCurrencyResponse();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

}
