//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.07.10 às 09:03:48 PM GMT-03:00 
//


package com.test.utils.soap_methods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOftCountryCodeAndName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftCountryCodeAndName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tCountryCodeAndName" type="{http://www.oorsprong.org/websamples.countryinfo}tCountryCodeAndName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftCountryCodeAndName", propOrder = {
    "tCountryCodeAndName"
})
public class ArrayOftCountryCodeAndName {

    @XmlElement(nillable = true)
    protected List<TCountryCodeAndName> tCountryCodeAndName;

    /**
     * Gets the value of the tCountryCodeAndName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tCountryCodeAndName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCountryCodeAndName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCountryCodeAndName }
     * 
     * 
     */
    public List<TCountryCodeAndName> getTCountryCodeAndName() {
        if (tCountryCodeAndName == null) {
            tCountryCodeAndName = new ArrayList<TCountryCodeAndName>();
        }
        return this.tCountryCodeAndName;
    }

}
