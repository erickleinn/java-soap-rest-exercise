//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.01.04 às 12:40:26 AM GMT-03:00 
//


package com.test.utils.soap_methods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tCountryInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tCountryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sISOCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sCapitalCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sPhoneCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sContinentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sCurrencyISOCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sCountryFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Languages" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftLanguage"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCountryInfo", propOrder = {
    "sisoCode",
    "sName",
    "sCapitalCity",
    "sPhoneCode",
    "sContinentCode",
    "sCurrencyISOCode",
    "sCountryFlag",
    "languages"
})
public class TCountryInfo {

    @XmlElement(name = "sISOCode", required = true)
    protected String sisoCode;
    @XmlElement(required = true)
    protected String sName;
    @XmlElement(required = true)
    protected String sCapitalCity;
    @XmlElement(required = true)
    protected String sPhoneCode;
    @XmlElement(required = true)
    protected String sContinentCode;
    @XmlElement(required = true)
    protected String sCurrencyISOCode;
    @XmlElement(required = true)
    protected String sCountryFlag;
    @XmlElement(name = "Languages", required = true)
    protected ArrayOftLanguage languages;

    /**
     * Obtém o valor da propriedade sisoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISOCode() {
        return sisoCode;
    }

    /**
     * Define o valor da propriedade sisoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISOCode(String value) {
        this.sisoCode = value;
    }

    /**
     * Obtém o valor da propriedade sName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSName() {
        return sName;
    }

    /**
     * Define o valor da propriedade sName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSName(String value) {
        this.sName = value;
    }

    /**
     * Obtém o valor da propriedade sCapitalCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCapitalCity() {
        return sCapitalCity;
    }

    /**
     * Define o valor da propriedade sCapitalCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCapitalCity(String value) {
        this.sCapitalCity = value;
    }

    /**
     * Obtém o valor da propriedade sPhoneCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPhoneCode() {
        return sPhoneCode;
    }

    /**
     * Define o valor da propriedade sPhoneCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPhoneCode(String value) {
        this.sPhoneCode = value;
    }

    /**
     * Obtém o valor da propriedade sContinentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSContinentCode() {
        return sContinentCode;
    }

    /**
     * Define o valor da propriedade sContinentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSContinentCode(String value) {
        this.sContinentCode = value;
    }

    /**
     * Obtém o valor da propriedade sCurrencyISOCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCurrencyISOCode() {
        return sCurrencyISOCode;
    }

    /**
     * Define o valor da propriedade sCurrencyISOCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCurrencyISOCode(String value) {
        this.sCurrencyISOCode = value;
    }

    /**
     * Obtém o valor da propriedade sCountryFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCountryFlag() {
        return sCountryFlag;
    }

    /**
     * Define o valor da propriedade sCountryFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCountryFlag(String value) {
        this.sCountryFlag = value;
    }

    /**
     * Obtém o valor da propriedade languages.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public ArrayOftLanguage getLanguages() {
        return languages;
    }

    /**
     * Define o valor da propriedade languages.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public void setLanguages(ArrayOftLanguage value) {
        this.languages = value;
    }

}
